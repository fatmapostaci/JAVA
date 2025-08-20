package learnJava.srcHoca.j07_stringmanipulations;

public class C02_Length {

        /*
        length() methodu girilen string'in uzunluğunu:içinde bulunan karakter sayısını return(döndurur :verir ) eder
        butun karakterleri(boşluk vs) sayıp adedini verir.
         */


    public static void main(String[] args) {
        String str1 = "Hayattan bir saat calmak :)";
        System.out.println("str1.length() = " + str1.length());

        String str2 =" "; // Tek karakterden oluşan bir metin (boşluk karakteri) -> Su dolmamış, sadece hava olan bir bardak
        String str3 =""; // Hiçbir karakter içermeyen metin -> Hava bile almayan, tamamen boş, vakumlanmış bir bardak
        String str4 ="null"; // Bu null demek değildir, n,u,l,l karakterlerinin dizilimi...
        String str5 =null; // Değeri olmayan referans (henüz bir nesneye işaret etmiyor) -> Henüz bardak bile yok; sadece bardak için ayrılmış bir yer var

        System.out.println("str2.length() = " + str2.length()); // 1
        System.out.println("str3.length() = " + str3.length()); // 0
       // System.out.println("str5.length() = " + str5.length()); // RTE -> NullPointerException verilir.

                /*
        Hap Bilgi->nul atanan String variable herhangi bir method call etmez
        null->case sensitive NULL !=null !=Null
        null->dutluk: arsa degeri olmayan arazi sadece hicligi gosteren pointer(isaretci)
         */

        String str6 ; // String e atama bile yapmadık.
       // System.out.println("str6.length() = " + str6.length()); // CTE atama yapmadım ki diye hata verir

    }
}
