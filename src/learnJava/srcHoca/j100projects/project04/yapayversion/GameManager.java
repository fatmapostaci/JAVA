package learnJava.srcHoca.j100projects.project04.yapayversion;



import j100projects.project04.yapayversion.model.Admin;
import j100projects.project04.yapayversion.model.Film;
import j100projects.project04.yapayversion.model.User;
import j100projects.project04.yapayversion.service.AdminService;
import j100projects.project04.yapayversion.service.UserService;

import java.util.*;

public class GameManager {
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_PURPLE = "\u001B[35m";

    private final List<Film> films;
    private final Map<String, User> users;
    private final Scanner scanner;
    private final Admin admin;
    private final AdminService adminService;
    private final UserService userService;

    public GameManager() {
        this.films = initializeFilms();
        this.users = new HashMap<>();
        this.scanner = new Scanner(System.in);
        this.admin = new Admin();
        this.adminService = new AdminService(scanner, films, users);
        this.userService = new UserService(scanner, films, users);
        // Demo kullanıcı
        users.put("demo", new User("demo", "demo123"));
    }

    private List<Film> initializeFilms() {
        List<Film> filmList = new ArrayList<>();
        filmList.add(new Film("INCEPTION", "Christopher Nolan", 2010, "Bilim Kurgu", "Leonardo DiCaprio", "ZOR", 100));
        filmList.add(new Film("MATRIX", "Wachowski Kardeşler", 1999, "Bilim Kurgu", "Keanu Reeves", "NORMAL", 80));
        filmList.add(new Film("TITANIC", "James Cameron", 1997, "Dram", "Leonardo DiCaprio", "KOLAY", 60));
        return filmList;
    }

    public void startGame() {
        while (true) {
            System.out.println(ANSI_PURPLE + "\n=== Film Tahmin Oyunu ===" + ANSI_RESET);
            System.out.println("1. Admin Girişi");
            System.out.println("2. Kullanıcı Girişi");
            System.out.println("3. Kayıt Ol");
            System.out.println("4. Skor Tablosu");
            System.out.println("5. Çıkış");
            System.out.print("Seçiminiz: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Buffer temizleme

            switch (choice) {
                case 1:
                    adminLogin();
                    break;
                case 2:
                    userLogin();
                    break;
                case 3:
                    userService.register();
                    break;
                case 4:
                    userService.showScoreboard();
                    break;
                case 5:
                    System.out.println("Oyun sonlandırılıyor...");
                    return;
                default:
                    System.out.println("Geçersiz seçim!");
            }
        }
    }

    private void adminLogin() {
        System.out.print("Admin kullanıcı adı: ");
        String username = scanner.nextLine();
        System.out.print("Admin şifresi: ");
        String password = scanner.nextLine();

        if (admin.checkCredentials(username, password)) {
            System.out.println(ANSI_GREEN + "Admin girişi başarılı!" + ANSI_RESET);
            adminMenu();
        } else {
            System.out.println(ANSI_RED + "Hatalı admin kullanıcı adı veya şifre!" + ANSI_RESET);
        }
    }

    private void adminMenu() {
        while (true) {
            System.out.println(ANSI_PURPLE + "\n=== Admin Menüsü ===" + ANSI_RESET);
            System.out.println("1. Film Ekle");
            System.out.println("2. Film Çıkar");
            System.out.println("3. Kullanıcı Sil");
            System.out.println("4. Tüm Filmleri Listele");
            System.out.println("5. Tüm Kullanıcıları Listele");
            System.out.println("6. Çıkış");
            System.out.print("Seçiminiz: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Buffer temizleme

            switch (choice) {
                case 1:
                    adminService.addFilm();
                    break;
                case 2:
                    adminService.removeFilm();
                    break;
                case 3:
                    adminService.removeUser();
                    break;
                case 4:
                    adminService.listAllFilms();
                    break;
                case 5:
                    adminService.listAllUsers();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Geçersiz seçim!");
            }
        }
    }

    private void userLogin() {
        System.out.print("Kullanıcı adı: ");
        String username = scanner.nextLine();
        System.out.print("Şifre: ");
        String password = scanner.nextLine();

        User user = users.get(username);
        if (user != null && user.checkPassword(password)) {
            System.out.println(ANSI_GREEN + "Giriş başarılı!" + ANSI_RESET);
            userService.playGame(user);
        } else {
            System.out.println(ANSI_RED + "Hatalı kullanıcı adı veya şifre!" + ANSI_RESET);
        }
    }
}
