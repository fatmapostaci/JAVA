package learnJava.src.dersler.gun8;

import java.util.Scanner;

public class C07_NestedTernary {
        /*
TASK :
Girilen bir pozitif tamsayı  4 basamaklı ise  “4 Basamaklı”
degilse çift olup olmadigini kontrol edip. Çift ise “4 basamaklı olmayan çift sayı”
degilse “4 basamaklı olmayan tek sayı"  print eden code create ediniz.
 */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz.");
        int sayi= input.nextInt();
        int sayiTer = sayi;
        int sayac = 0;
        System.out.println("sayi = " + sayi);
        while (sayi > 0) {
            sayi /= 10;
            sayac++;
        }
        System.out.println( sayac== 4 ? "4 basamaklı " : (sayiTer % 2 == 0 ? "4 basamaklı olmayan çift sayı " : "4 basamaklı olmayan tek sayı"));

        System.out.println("sayi = " + sayi);
    }
}
