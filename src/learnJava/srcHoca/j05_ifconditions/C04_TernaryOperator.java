package learnJava.srcHoca.j05_ifconditions;

import java.util.Scanner;

public class C04_TernaryOperator {
/*
Ternary Operatörü Kullanımında Dikkat Edilmesi Gereken Hususlar

Basitlik: Ternary operatör sadece basit koşullar için uygundur.
 Karmaşık mantıklar için uygun değildir. Birkaç ardışık ternary
  ifadesi, kodu okunmaz hale getirebilir. Örneğin:

String result = (a > b) ? "A" : (c < d) ? "C" : "D";

// Bu gibi kullanımlar okunabilirliği zorlaştırır.

Kodun Okunabilirliği: Kısa ve anlaşılır olduğunda ternary
    operatör okunabilirliği artırır. Ancak çok karmaşık durumlarda
    if-else yapısı daha iyi bir seçenek olacaktır. Ternary ifadeler
    uzun ya da iç içe geçtiğinde kodun bakımı zorlaşır.

Kodun Yan Etkileri: Ternary operatörü, yalnızca basit atama işlemleri için uygundur.
    Eğer işlem birden fazla adım veya yan etki (örneğin bir metot çağrısı) içeriyorsa,
    if-else daha uygun olur. Örneğin:

(a > b) ? process1() : process2();  // Bu kullanım yerine if-else tercih edilmeli.

Null Kontrolleri: Null değerlerle çalışırken dikkatli olunmalıdır. Eğer ternary operatör
    kullanırken null döndürme durumu varsa, kod beklenmedik bir şekilde çalışabilir.
    Örneğin, nesneye bağlı işlemler sırasında NullPointerException oluşabilir.

Tip Uyuşmazlığı: Ternary operatörde iki sonuç ifadesinin aynı türde olması gerekir.
    Farklı türler döndürmeye çalışırsanız, derleyici hata verecektir. Örneğin:

int result = (a > b) ? 10 : "On";  // Bu, derleyici hatası üretir çünkü 10 bir int, "On" ise String.
 */

    public static void main(String[] args) {
       // Task verilen iki sayıdan en büyüğünü hesaplayın
        int a = 23;
        int b = 36;
        int max ;

        if (a>b){
            max = a;
        } else {
            max = b;
        }
        System.out.println(max);

        int maximum = a>b ? a : b;
        System.out.println("maximum = " + maximum);

        // Runner-> girilen bir tamsayının  tek-çift olmasını kontrol eden code create ediniz.
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayı giriniz...");
        int sayi1 = input.nextInt();

        String result = sayi1 % 2 == 0 ? "Girdiğiniz sayı çift" : "Girdiğiniz sayı tek";
        System.out.println("result1 = " + result);

        System.out.println("**************** Task 02**************************");
        // Task02_DayName-> girilen bir tamsayının  pozitif olmasını kontrol eden code create ediniz.
        String sonuc;
        System.out.println("Bir sayı giriniz...");
        int sayi2 = input.nextInt();
        sonuc = sayi2 < 0 ? sayi2 + " sayısı negatif sayıdır" : sayi2 + " sayısı pozitif sayıdır";
        System.out.println("sonuc = " + sonuc);

        System.out.println(sayi2 < 0 ? sayi2 + " sayısı negatif sayıdır" : sayi2 + " sayısı pozitif sayıdır");

        System.out.println("**************** Task 03**************************");
        // Task03-> girilen iki tamsayının buyugunu print eden code create ediniz.

        System.out.println("(sayi1 > sayi2 ? sayi1 : sayi2) = " + (sayi1 > sayi2 ? sayi1 : sayi2));

        System.out.println("**************** Task 04**************************");
        // Task04-> girilen iki tamsayının işaretleri farklı ise toplamını değilse "agam DEWAMKEEE" print eden code create ediniz.

        System.out.println("(sayi1 * sayi2 < 0 ? (sayi1 + sayi2) : \"agam DEWAMKEEE\") = " + (sayi1 * sayi2 < 0 ? (sayi1 + sayi2) : "agam DEWAMKEEE"));
        Object netice = sayi1 * sayi2 < 0 ? (sayi1 + sayi2)  : "agam DEWAMKEEE"; // Object data türü bütün data çeşitlerinin atasıdır (Hz. Adem gibi )
        System.out.println("netice = " + netice);

    }
}
