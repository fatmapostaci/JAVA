
package learnJava.src.dersler.gun19;

import java.util.Scanner;

public class Task05_HM {
    // task-> girilen iki sayıyı seçilen dört işleme göre hesaplayıp print eden METHOD create ediniz

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }


    public static void menu() {
        Task05_HM_Methodlar obj = new Task05_HM_Methodlar();
        String metin="";
        System.out.println("NOT: 3+5.0 yada 15.5/5 yada 1.2*2.5 formatında pozitif değerler kabul edilmektedir" );
        do {

            System.out.println("Yapmak istediğiniz işlemi girin: ");
            //3+2 şeklinde girilen string ten split yaparak operation öncesini sayı1 e operatörden sonrasını sayı2 ye atıyor
            metin = s.nextLine();
            double[] sayilar = obj.sayiları_bul(metin);

            //string olarak girilen input içinden operatörü bul
            String operator = obj.operatoru_bul(metin);

            double output = switch (operator) {
                case "+" -> obj.toplama_yap(sayilar);
                case "-" -> obj.cikarma_yap(sayilar);
                case "*" -> obj.carpma_yap(sayilar);
                case "/" -> obj.bolme_yap(sayilar);
                default -> obj.hata();
            };
            System.out.println(metin + " =  " + output);
        } while (obj.islemKabulEdildi(metin));

    }
}//Class sonu
