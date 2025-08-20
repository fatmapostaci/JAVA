package learnJava.src.dersler.gun29.mentoring;

public class C01ImmutableClasses {

    public static void main(String[] args) {

        String str1 = "Clarusway";
    /* Heap memory'deki String Pool'da "Clarusway" değerine sahip bir String objesi
    oluşturuldu (eğer daha önce yoksa).
     "Clarusway" objesi, str1 referansına bağlandı
     */

        String str2 = "Clarusway";
    // String Pool'da "Clarusway" adlı bir obje olduğundan, str2 o objeye referans eder.
    // Eğer String Pool'da böyle bir obje yoksa, "Clarusway" değeriyle yeni bir obje oluşturulur ve str2 o objeye referans eder.
    // str1 ve str2'ün referansları farklıdır (farklı değişkenlerdir), ancak her ikisi de aynı String Pool'daki "Clarusway" objesini paylaşır.

        String str3 = new String("Clarusway");
    // Heap'te yeni bir obje oluşturulur, ancak bu obje String Pool'daki "Clarusway" objesiyle aynı değildir.

        String str4 = str3;
    // Bu ifade, str3'ün işaret ettiği objeyi kullanan yeni bir referans (str4) oluşturur.
    // str4 ve str3 aynı objeyi işaret eder, bu nedenle herhangi bir yeni obje oluşturulmaz.

        System.out.println("(str1 == str2) = " + (str1 == str2));  // T -> Aynı obje aynı değer (farklı referans)
        System.out.println("str1.equals(str2) = " + str1.equals(str2));// T -> Aynı değer

        System.out.println("(str1 == str3) = " + (str1 == str3)); // F -> Farklı Obje Aynı Değer
        System.out.println("str1.equals(str3) = " + str1.equals(str3));// T -> Aynı değer

        System.out.println("(str4 == str3) = " + (str4 == str3)); // T -> Aynı Obje Aynı Değer
        System.out.println("str4.equals(str3) = " + str4.equals(str3));// T -> Aynı değer
    }
}
