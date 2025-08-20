package learnJava.src.dersler.gun38;

import java.util.Scanner;

public class C09IllegalYasException {


    public static void main(String[] args)  {
        Scanner scn = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz");
        yasKontrolEt(15);
        int yas = scn.nextInt();
        try {
            yasKontrolEt(yas);
        } catch (IllegalYasException e) {
            System.out.println("Hata hakkkında bilgi veya bu durumda takip edilecek yolun kodları çalışıyor");
            System.out.println(e.getMessage());
        }
        System.out.println("Adınızı giriniz");
        System.out.println("Adresinizi giriniz");
        System.out.println("Hayırlı Olsun");
    }

    private static void yasKontrolEt(int yas) throws IllegalYasException {
        if (yas < 18){
            throw new IllegalYasException("Ehliyet almak için en az 18 yaşında olmalısınız " + (18-yas) + " yıl sonra deneyin");
        }
    }

}
