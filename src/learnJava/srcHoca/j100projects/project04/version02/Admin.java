package learnJava.srcHoca.j100projects.project04.version02;

import java.util.Scanner;

import static j100projects.project04.version02.Film.filmListe;
import static j100projects.project04.version02.User.passwordList;
import static j100projects.project04.version02.User.userList;


public class Admin {
    private static String adminUser = "admin";
    private static String adminPassword = "admin01";

    static Scanner scanner = new Scanner(System.in);

    public static void adminKontrol() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Lütfen Admin Kullanıcı Adınızı Giriniz:");
            String adminName = scanner.next();
            System.out.println("Lütfen Admin Parolanızı Giriniz:");
            String adminPass = scanner.next();

            if (adminName.equals(adminUser) && adminPass.equals(adminPassword)) {
                System.out.println("Giriş Başarılı!\n");
                adminMenu();
                return;
            } else {
                System.out.println("Hatalı giriş! Kalan deneme hakkınız: " + (3 - i));
            }
        }
        System.out.println("Deneme hakkınız bitti. Ana menüye yönlendiriliyorsunuz...\n");
    }

    public static void adminMenu() {
        boolean devam = true;

        while (devam) {
            System.out.println("Değerli Admin, Hoşgeldiniz! Yapmak istediğiniz işlemi seçiniz:" +
                    "\n1 - Film Ekle" +
                    "\n2 - Film Çıkar" +
                    "\n3 - Kullanıcı Sil" +
                    "\n4 - Ana Menüye Dön" +
                    "\nSeçiminiz: ");

            int adminSecim = scanner.nextInt();
            switch (adminSecim) {
                case 1:
                    filmEkle();
                    break;
                case 2:
                    filmCikar();
                    break;
                case 3:
                    userSil();
                    break;
                case 4:
                    System.out.println("Ana menüye dönülüyor...\n");
                    devam = false;
                    break;
                default:
                    System.out.println("Geçersiz seçim! Lütfen tekrar deneyin.");
                    break;
            }
        }
    }
    private static void filmEkle() {
        System.out.println("\nEklemek istediğiniz filmin adını giriniz:");
        String yeniFilm = scanner.next().toUpperCase();
        filmListe.add(yeniFilm);
        System.out.println(Film.c_PURPLE+"Film başarıyla eklendi! Güncel film listesi:");
        System.out.println(Film.c_GREEN+filmListe+Film.c_RESET+ "\n");
    }
    private static void filmCikar() {
        System.out.println("\nÇıkarmak istediğiniz filmin numarasını giriniz:");
        for (int i = 0; i < filmListe.size(); i++) {
            System.out.println((i + 1) + ". " + filmListe.get(i));
        }
        int secim = scanner.nextInt();
        if (secim > 0 && secim <= filmListe.size()) {
            filmListe.remove(secim - 1);
            System.out.println("Film başarıyla çıkarıldı! Güncel film listesi:");
            System.out.println(filmListe);
        } else {
            System.out.println("Geçersiz seçim! Lütfen doğru numarayı giriniz.");
        }
    }
    private static void userSil() {
        System.out.println("\nÇıkarmak istediğiniz kullanıcının adını giriniz:");
        for (int i = 0; i < userList.size(); i++) {
            System.out.println(userList.get(i));
        }
        String userName = scanner.next();
        int index = userList.indexOf(userName);
        if (index != -1) {
            userList.remove(index);
            passwordList.remove(index);
            System.out.println("Kullanıcı başarıyla silindi! Güncel kullanıcı listesi:");
            System.out.println(userList);
        } else {
            System.out.println("Kullanıcı bulunamadı!");
        }
    }
}
