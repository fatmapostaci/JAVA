package learnJava.src.dersler.gun7;

import java.time.LocalDate;
import java.util.Scanner;

public class Ehliyet {
    public static void main(String[] args) {
        /*
       TASK -> Kullanıcının ehliyetinin varlığını kontrol ediniz.
       Ehliyeti varsa yıl tecrübesi 7 yıl ve üstü ise aldıgı mesafe 100000 km ve üzeri ise kontak anahtarını veriniz
       aksi durumda tecrübe yılı ve mesafe eksiklerini print eden code create ediniz
      */
        int ehliyetYili , alinanyol,yil;
        System.out.println("Ehliyetiniz var mı? (True/False)");
        Scanner scanf = new Scanner(System.in);
        boolean isEhliyet = (scanf.nextBoolean());

        int localYil = LocalDate.now().getYear();
        if (isEhliyet) {
            System.out.println("Ehliyetinizi kaç yılında aldınız? ");
            ehliyetYili = scanf.nextInt();
            yil = localYil-ehliyetYili;
            System.out.println("Kaç yıllık mesafe yol kat ettiniz");
            alinanyol = scanf.nextInt();
            if (yil > 6 && alinanyol >= 100000) {
                System.out.println("Yola çıkabilirsiniz");
            } else {
                if (yil < 7) {
                    System.out.printf(" %d eksik tecrübe yılınız var ", 7 - yil);
                }
                if (alinanyol < 100000) {
                    System.out.printf(" %d km daha yol kat etmelisiniz ", 100000 - alinanyol);
                }
            }
        }
        else System.out.println("Ehliyet almalısınız");
    }
}
