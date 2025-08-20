package learnJava.srcHoca.j05_ifconditions.tasks;

import java.util.Scanner;

public class T04_EhliyetKontrolü {
        /*
      TASK -> Kullanıcının ehliyetinin varlığını kontrol ediniz.
      Ehliyeti varsa yıl tecrübesi 7 yıl ve üstü ise aldıgı mesafe 100000 km ve üzeri ise kontak anahtarını veriniz
      aksi durumda tecrübe yılı ve mesafe eksiklerini print eden code create ediniz
     */

   public static void main(String[] args) {
       int tecrube,alinanYol;
       int ehliyet;

       Scanner scan = new Scanner(System.in);
       System.out.println("Ehliyetiniz var mı ? varsa :1 yoksa : 2 seçiniz ");
       ehliyet = scan.nextInt();

       if (ehliyet ==1){
           System.out.println("Kaç yıllık tecrübeniz var ?");
           tecrube = scan.nextInt();

           System.out.println("Toplam kaç km araç kullandınız? ");
           alinanYol = scan.nextInt();

           if (tecrube > 6 && alinanYol >= 100000){
               // kontak sizin
               System.out.println("Kontak anahtarını alabilirsiniz");
           } else {
               if (alinanYol<100000){
                   System.out.println((100000-alinanYol) + " km da yol almanız lazım");
               }
               if (tecrube<7){
                   System.out.println((7-tecrube) + " yıl daha tecrübe kazanmalısınız");
               }
           }

       } else {
           System.out.println("Kontak almak için ehliyet sahibi olmalısınız");
       }





















    }

}
