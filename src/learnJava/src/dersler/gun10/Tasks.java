package learnJava.src.dersler.gun10;

import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        {
        /*  TASK :
   Asagidaki String degiskenini kullanarak  konsolda isminizi print eden code create ediniz.
    */
        String harfDepo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String adım1 = "" + harfDepo.charAt(5) + harfDepo.charAt(0) + harfDepo.charAt(19) + harfDepo.charAt(12) + harfDepo.charAt(0);
        System.out.println("adım1 = " + adım1);
        String adım2 = harfDepo.substring(5, 6).concat(harfDepo.substring(0, 1).concat(harfDepo.substring(19, 20).concat(harfDepo.substring(12, 13).concat(harfDepo.substring(0, 1)))));
        System.out.println("adım2 = " + adım2);
    }{
            /*
        Task-> Girilen string içindeki istenen index'deki karakteri print eden code create ediniz
         */
        System.out.print("Girdi: ");
        String metin3 = scan.nextLine();
        System.out.print("sorgulanacak index: ");
        int index = scan.nextInt();
        System.out.println((index > metin3.length())
                ? "Metnin uzunluğunu geçmeyen bir index girin."
                : "charAt(index) = " + metin3.charAt(index));
    }
        {
            //Girilen String'in son karakterini silen code create ediniz...

            System.out.print("Girdi: ");
            String metin2 = scan.nextLine();
            metin2 = metin2.substring(0, metin2.length() - 1);
            System.out.println("güncellenen metin2  = " + metin2);
        }
        {
     /*    Task->
         Girilen iki kelimeden ilki çift sayıda karakter içeriyorsa
         2. kelimeyi 1. kelimenin ortasına print eden
         ilk kelime tek sayıda karakter içeriyorsa "kelime2 kelime1 eklenemez" print eden code create ediniz
         name1= Java
         name2= Aslıhan
         Print ==> JaAslıhanva
*/
            System.out.print("name1: ");
            String name1 = scan.next();
            System.out.print("name2: ");
            String name2 = scan.next();
            System.out.println(name1.length() % 2 == 0
                    ? name1.substring(0, name1.length() / 2).concat(name2).concat(name1.substring(name1.length() / 2))
                    : "kelime2 kelime1 e eklenemez");
        }
        {
            // Task->  Girilen  bir stringde boşluk karakterinin olup olmadığını kontrol eden code create ediniz
            System.out.print("Girdi: ");
            String metin = scan.nextLine();
            System.out.println((metin.contains(" ")) ? "boşluk var" : "boşluk yok");


        /*  I love java olan bir String oluşturun.
            Bu cümlenin toplam karakter sayısını yazdırın.   */
            String metin1 = " I love java ";
            System.out.println("metin.length() = " + metin1.length());

        }
    }
}
