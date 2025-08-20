package learnJava.srcHoca.j100projects.project04.version02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static j100projects.project04.version02.Film.filmListe;


public class User {
    static Scanner scanner = new Scanner(System.in);

    private String userName;
    private String userPassword;
    static ArrayList<String> userList = new ArrayList<>(Arrays.asList("user1", "user2", "user3", "user4"));
    static ArrayList<String> passwordList = new ArrayList<>(Arrays.asList("user01", "user02", "user03", "user04"));


    public static void userKontrol() {
        System.out.println("************ Kullanıcı Menüsüne Hoşgeldiniz *************");

        for (int i = 1; i <= 3; i++) {
            System.out.print("Lütfen Kullanıcı Adınızı Giriniz: ");
            String user = scanner.next();
            System.out.print("Lütfen Şifrenizi Giriniz: ");
            String userPass = scanner.next();

            boolean loginSuccessful = false;
            for (int j = 0; j < userList.size(); j++) {
                if (userList.get(j).equals(user) && passwordList.get(j).equals(userPass)) {
                    System.out.println("Giriş Başarılı!");
                    loginSuccessful = true;
                    break;
                }
            }

            if (loginSuccessful) {
                filmTahmin();
                return; // Kullanıcı tahmin oyunu için giriş yaptıktan sonra döngüden çıkılır
            }

            System.out.println("Hatalı Giriş! Kalan deneme hakkınız: " + (3 - i));

            if (i == 3) {
                System.out.println("Deneme hakkınız bitti. Ana menüye yönlendiriliyorsunuz...");
                //Film.menuGiris(); // Başarısız girişlerde ana menüye yönlendirme
            }
        }
    }

    public static void filmTahmin() {
        System.out.println("Listemizde bulunan " + filmListe.size() + " filmden birini seçmek için: ");
        System.out.print("1 ile " + filmListe.size() + " arasında bir sayı giriniz: ");
        int filmIndex = scanner.nextInt();
        scanner.nextLine(); // Satır sonu karakterini temizlemek için

        String tahminEdilecekFilm = filmListe.get(filmIndex - 1);
        int tahminHakki = tahminEdilecekFilm.length() * 2;
        System.out.println("\n" + tahminHakki + " defa tahmin hakkınız bulunmaktadır.");

        String ipucuFilm = tahminEdilecekFilm.substring(0, 2) + tahminEdilecekFilm.substring(2).replaceAll("\\w", "*");
        System.out.println("Filmi tahmin etmen için sana bir ipucu veriyorum: " + ipucuFilm);

        for (int i = 1; i <= tahminHakki; i++) {
            System.out.print("\n" + i + ". tahminini gir: ");
            String tahmin = scanner.nextLine().toUpperCase();

            if (tahmin.equals(tahminEdilecekFilm.toUpperCase())) {
                System.out.println("\nTebrikler! " + i + ". tahmininizde filmi bildiniz.");
                return;
            } else {
                System.out.println("Yanlış tahmin! Kalan hakkınız: " + (tahminHakki - i));
            }
        }

        System.out.println("\nMaalesef kaybettiniz! Doğru cevap: " + tahminEdilecekFilm);
        Film.menuGiris();
    }

    public static void userKayıt() {
        System.out.println("********** Kayıt Menüsüne Hoşgeldiniz ******************");
        System.out.print("Kullanıcı Adınızı Giriniz: ");
        String yeniUser = scanner.next();

        while (userList.contains(yeniUser)) {
            System.out.print("Bu kullanıcı adı zaten mevcut. Başka bir kullanıcı adı giriniz: ");
            yeniUser = scanner.next();
        }

        System.out.print("Kullanıcı Şifrenizi Belirleyiniz (en az 5 karakter): ");
        String yeniUserPass = scanner.next();

        while (yeniUserPass.length() < 5) {
            System.out.print("Şifreniz 5 karakterden kısa olamaz. Tekrar giriniz: ");
            yeniUserPass = scanner.next();
        }

        userList.add(yeniUser);
        passwordList.add(yeniUserPass);
        System.out.println("Kayıt başarıyla tamamlandı! Ana menüye yönlendiriliyorsunuz...");
        Film.menuGiris();
    }
}
