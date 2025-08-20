package learnJava.srcHoca.j100projects.project04.yapayversion.service;



import j100projects.project04.yapayversion.model.Film;
import j100projects.project04.yapayversion.model.User;

import java.util.*;

public class UserService {
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_RESET = "\u001B[0m";

    private final Scanner scanner;
    private final List<Film> films;
    private final Map<String, User> users;

    public UserService(Scanner scanner, List<Film> films, Map<String, User> users) {
        this.scanner = scanner;
        this.films = films;
        this.users = users;
    }

    public void register() {
        System.out.print("Yeni kullanıcı adı: ");
        String username = scanner.nextLine();
        if (users.containsKey(username)) {
            System.out.println("Bu kullanıcı adı zaten alınmış!");
            return;
        }
        System.out.print("Şifre (en az 6 karakter): ");
        String password = scanner.nextLine();
        if (password.length() < 6) {
            System.out.println("Şifre çok kısa!");
            return;
        }
        users.put(username, new User(username, password));
        System.out.println(ANSI_GREEN + "Kayıt başarılı! Giriş yapabilirsiniz." + ANSI_RESET);
    }

    public void playGame(User user) {
        Film selectedFilm = selectRandomFilm(user.getDifficulty());
        if (selectedFilm == null) {
            System.out.println("Bu zorluk seviyesinde film bulunamadı!");
            return;
        }

        int maxAttempts = calculateMaxAttempts(selectedFilm.getDifficulty());
        int remainingHints = 3;
        String maskedName = maskFilmName(selectedFilm.getName());

        System.out.println(ANSI_YELLOW + "\nFilm İsmi: " + maskedName + ANSI_RESET);
        System.out.println("Tahmin hakkınız: " + maxAttempts);
        System.out.println("İpucu hakkınız: " + remainingHints);

        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            System.out.print("\n1. Tahmin yap\n2. İpucu al\nSeçiminiz: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 2 && remainingHints > 0) {
                showHint(selectedFilm);
                remainingHints--;
                continue;
            }

            System.out.print("Tahmininiz: ");
            String guess = scanner.nextLine().toUpperCase();

            if (guess.equals(selectedFilm.getName())) {
                int earnedPoints = calculatePoints(selectedFilm.getPoints(), attempt, maxAttempts);
                user.addScore(earnedPoints);
                System.out.println(ANSI_GREEN + "\nTebrikler! Doğru tahmin!");
                System.out.println("Kazanılan puan: " + earnedPoints + ANSI_RESET);
                return;
            } else {
                System.out.println(ANSI_YELLOW + "Yanlış tahmin! Kalan hakkınız: " + (maxAttempts - attempt) + ANSI_RESET);
            }
        }

        System.out.println("\nÜzgünüm, tahmin hakkınız bitti!");
        System.out.println("Doğru cevap: " + selectedFilm.getName());
    }

    private Film selectRandomFilm(String difficulty) {
        List<Film> matchingFilms = films.stream()
                .filter(f -> f.getDifficulty().equals(difficulty))
                .toList();
        
        if (matchingFilms.isEmpty()) return null;
        return matchingFilms.get(new Random().nextInt(matchingFilms.size()));
    }

    private String maskFilmName(String name) {
        return name.substring(0, 2) + "*".repeat(name.length() - 2);
    }

    private void showHint(Film film) {
        Map<String, String> hints = film.getHints();
        List<String> availableHints = new ArrayList<>(hints.keySet());
        if (availableHints.isEmpty()) {
            System.out.println("İpucu kalmadı!");
            return;
        }
        String randomHint = availableHints.get(new Random().nextInt(availableHints.size()));
        System.out.println(ANSI_BLUE + "İpucu: " + randomHint + " = " + hints.get(randomHint) + ANSI_RESET);
    }

    private int calculatePoints(int basePoints, int attempt, int maxAttempts) {
        return (int) (basePoints * (1.0 - ((double) (attempt - 1) / maxAttempts)));
    }

    private int calculateMaxAttempts(String difficulty) {
        return switch (difficulty) {
            case "KOLAY" -> 8;
            case "NORMAL" -> 6;
            case "ZOR" -> 4;
            default -> 6;
        };
    }

    public void showScoreboard() {
        System.out.println("\n=== Skor Tablosu ===");
        users.values().stream()
                .sorted((u1, u2) -> Integer.compare(u2.getTotalScore(), u1.getTotalScore()))
                .limit(10)
                .forEach(u -> System.out.printf("%s: %d puan (Ort: %.2f)%n",
                        u.getUsername(), u.getTotalScore(), u.getAverageScore()));
    }
}
