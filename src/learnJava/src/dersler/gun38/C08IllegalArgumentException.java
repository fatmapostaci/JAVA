package learnJava.src.dersler.gun38;

import java.util.Scanner;

public class C08IllegalArgumentException {

            /*
        ahan da TRİCK kosesinde bugun :)
        "throw" - throws" farkları
        1- "throws" -> main method kapanıs parantezi ile method body acılıs parantezi arasına yazılır.
           "throw" -> method body içinde tanımlanır.
        2- "throws" -> keywordden sonra birden fazla exception tanımlanabilir
           "throw" -> keywordden sonra sadece bir tane exception tanımlanır
        3- "throws" -> keywordden sonra sadece exception class name yazılır
            "throw" ->  keywordden sonra exception obj tanımlanır
        4- "throws" -> keyword method ilk satırda sadece bir kez tanımlanır
            "throw" -> keyword istenildiği kadar method body de tanımlanabilir.
         */

    // IllegalargumentException -> kullanılmasını istenmeyen değerlerde pr hata vermesi isteniyorsa bu excp fırlatılır
    // ornek : yas datası için negatif değer girilidğinde pr kırılmadan run olması ama girilen değer için excp fırlatması için kullanılır..

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz");
        int yas = scn.nextInt();
        try {
            yasKontrolEt(yas);
        } catch (IllegalArgumentException e) {
            System.out.println("Hata hakkkında bilgi veya bu durumda takip edilecek yolun kodları çalışıyor");
            System.out.println(e.getMessage());
        }
        System.out.println("Adınızı giriniz");
        System.out.println("Adresinizi giriniz");
        System.out.println("Hayırlı Olsun");
    }

    private static void yasKontrolEt(int yas) {
        if (yas < 18){
            throw new IllegalArgumentException("Ehliyet almak için en az 18 yaşında olmalısınız " + (18-yas) + " yıl sonra deneyin");
        }
    }

}
