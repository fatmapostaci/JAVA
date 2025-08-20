package learnJava.srcHoca.j100projects.project04.yapayversion.service;

import j100projects.project04.yapayversion.model.Film;
import j100projects.project04.yapayversion.model.User;


import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AdminService {
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_PURPLE = "\u001B[35m";

    private final Scanner scanner;
    private final List<Film> films;
    private final Map<String, User> users;

    public AdminService(Scanner scanner, List<Film> films, Map<String, User> users) {
        this.scanner = scanner;
        this.films = films;
        this.users = users;
    }

    public void addFilm() {
        System.out.print("Film adı: ");
        String name = scanner.nextLine().toUpperCase();
        System.out.print("Yönetmen: ");
        String director = scanner.nextLine();
        System.out.print("Yıl: ");
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Kategori: ");
        String category = scanner.nextLine();
        System.out.print("Başrol oyuncusu: ");
        String mainActor = scanner.nextLine();
        System.out.print("Zorluk (KOLAY/NORMAL/ZOR): ");
        String difficulty = scanner.nextLine().toUpperCase();
        System.out.print("Puan değeri: ");
        int points = scanner.nextInt();

        films.add(new Film(name, director, year, category, mainActor, difficulty, points));
        System.out.println(ANSI_GREEN + "Film başarıyla eklendi!" + ANSI_RESET);
    }

    public void removeFilm() {
        listAllFilms();
        System.out.print("Silmek istediğiniz filmin numarasını girin: ");
        int index = scanner.nextInt() - 1;
        
        if (index >= 0 && index < films.size()) {
            Film removedFilm = films.remove(index);
            System.out.println(ANSI_GREEN + removedFilm.getName() + " filmi başarıyla silindi!" + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED + "Geçersiz film numarası!" + ANSI_RESET);
        }
    }

    public void removeUser() {
        listAllUsers();
        System.out.print("Silmek istediğiniz kullanıcının adını girin: ");
        String username = scanner.nextLine();

        if (users.remove(username) != null) {
            System.out.println(ANSI_GREEN + username + " kullanıcısı başarıyla silindi!" + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED + "Kullanıcı bulunamadı!" + ANSI_RESET);
        }
    }

    public void listAllFilms() {
        System.out.println(ANSI_PURPLE + "\n=== Tüm Filmler ===" + ANSI_RESET);
        for (int i = 0; i < films.size(); i++) {
            Film film = films.get(i);
            System.out.printf("%d. %s (%d) - %s - Zorluk: %s%n", 
                i + 1, film.getName(), film.getYear(), film.getCategory(), film.getDifficulty());
        }
    }

    public void listAllUsers() {
        System.out.println(ANSI_PURPLE + "\n=== Tüm Kullanıcılar ===" + ANSI_RESET);
        users.values().forEach(user -> 
            System.out.printf("%s - Toplam Puan: %d - Oyun Sayısı: %d%n", 
                user.getUsername(), user.getTotalScore(), user.getGamesPlayed()));
    }
}
