package learnJava.src.dersler.gun4;

import java.util.Scanner;

public class odev_gun4 {
    public static void main(String[] args) {
        /* Task->
         * 120 yi 60 a bolunuz, sonucu 10 ile carpip 20 ile toplayiniz, cikan sonuctan 40 cikariniz.
         */
        System.out.println((((double) (120 / 60) * 10) + 20) - 40);

        /*Task->
         * Saniyeyi saat, dk ve saniyeye çeviren bir program yazınız.
         * 		Örnek : 4250 - > 1 saat 10 dakika 50 saniye
         * 1 saat = 3600 saniye
         * 1 dk   = 60 saniye
         *
         */
        Scanner scanf = new Scanner(System.in);
        System.out.print("Toplam saniyeyi giriniz: ");
        int total_seconds =scanf.nextInt();
        int hours = total_seconds / 360; // 1 saat = 360 saniye
        int minutes = (total_seconds % 360) / 60; // 1 dakika = 60 saniye
        int seconds = total_seconds % 60; // Kalan saniye
        System.out.printf("%d saniye -> %d saat %d dakika %d saniye \n", total_seconds, hours, minutes, seconds );


      /*Task->
     Çiftlikteki hayvanların ayaklarının toplam sayısını bulma.
     Çiftlikteki bulunun inek, koyun, tavukların ayak sayısını print eden code create ediniz.

     */
        int inek, koyun, tavuk;
        System.out.print("Çiftlikte kaç adet inek var? ");
        inek = scanf.nextInt();
        System.out.print("Çiftlikte kaç adet koyun var? ");
        koyun = scanf.nextInt();
        System.out.print("Çiftlikte kaç adet tavuk var? ");
        tavuk = scanf.nextInt();

        System.out.println("Çiftlikteki hayvanların ayaklarının toplam sayısı " + ((inek+koyun)*4+(tavuk*2)) );

     /*    Verilen iki tane int  (num1 , num2),
     Bu iki Integer'in toplamını yazdırın.
          */

        System.out.println("iki tane int  (num1 , num2) girin: ");
        int num1 = scanf.nextInt();
        int num2 = scanf.nextInt();
        System.out.println("num2+num1 = " + (num2 + num1));



            /*  Task:
                Verilen int ler hakkında (num1, num2),
            num1 'in   num2'ye bölümünden kalanı, int sonuc'a  eşitleyin.
            int sonucu yazdırın.
    //Kodu aşağıya yazınız.
             */

        System.out.println("Birbirine bölümünden Kalanı bulmak için iki tane int girin: ");
        int num3 = scanf.nextInt();
        int num4 = scanf.nextInt();
        int sonuc = num3%num4;
        System.out.println("sonuc = " + sonuc);

        /*  Task:
             Oluşturulmuş olan int ler hakkında, (num1, num2 , num3, num4),
        Bu int'leri birbiriyle çarpın ve sonuca eşitleyin.
        int sonuc u yazdırın.
    //Kodu aşağıya yazınız.

             */

        System.out.println(" (num1, num2 , num3, num4) birbiriyle çarpma. Sayıları (int) girin: ");
        num1 = scanf.nextInt();
        num2 = scanf.nextInt();
        num3 = scanf.nextInt();
        num4 = scanf.nextInt();
        sonuc = num4*num1*num2*num3;
        System.out.println("sonuc = " + sonuc);

        /*   Task:
            Oluşturulmuş olan double'lar hakkında,
        Bu 4 doubleyi  birbiriyle çarpın ve sonuca  eşitleyin.
        Double sonucu yazdırın.
     */
        System.out.println(" (num1, num2 , num3, num4) birbiriyle çarpma. Sayıları (double) girin: ");
        double num1D = scanf.nextDouble();
        double num2D  = scanf.nextDouble();
        double num3D  = scanf.nextDouble();
        double num4D  = scanf.nextDouble();
        double sonucD = num4D*num1D*num2D*num3D;
        System.out.println("sonuc = " + sonucD);
    }
}
