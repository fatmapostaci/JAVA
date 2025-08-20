package learnJava.srcHoca.j100projects.project04.version02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static j100projects.project04.version02.Admin.adminKontrol;
import static j100projects.project04.version02.User.userKayıt;
import static j100projects.project04.version02.User.userKontrol;



public class Film {
    static String c_RED = "\u001B[31m";
    static String BOLD = "\033[0;1m";
    static String c_RESET = "\u001B[0m";
    static String c_BLUE = "\u001B[34m";
    static String c_PURPLE = "\u001B[35m";
    static String c_GREEN = "\u001B[32m";
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> filmListe = new ArrayList<>(
            Arrays.asList("JOKER", "INCEPTION", "PIYANIST", "GREENMILE", "GODFATHER", "MATRIX", "BRAVEHEART",
                    "LEON", "GODFATHER", "JURASSICPARK", "TITANIC", "HOBBITS", "MISSIONIMPOSSIBLE", "KINGKONG"));

    public static void menuGiris() {
        boolean devam = true;

        while (devam) {
            System.out.println("\nFilm Tahmin Oyunumuza Hoşgeldiniz:" +
                    "\n1 - Admin Girişi" +
                    "\n2 - Kullanıcı Girişi" +
                    "\n3 - Kayıt Ol" +
                    "\n4 - Çıkış" +
                    BOLD+c_RED+"\nSeçiminiz: "+c_RESET);

            int secim = scanner.nextInt();
            switch (secim) {
                case 1:
                    adminKontrol();
                    break;
                case 2:
                    userKontrol();
                    break;
                case 3:
                    userKayıt();
                    break;
                case 4:
                    System.out.println("Çıkış yapılıyor. Hoşça kalın!");
                    devam = false;
                    break;
                default:
                    System.out.println("Geçersiz bir seçim yaptınız, lütfen tekrar deneyin.");
                    break;
            }
        }
    }
}






