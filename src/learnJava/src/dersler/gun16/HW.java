package learnJava.src.dersler.gun16;

import java.util.Scanner;

public class HW {
    public static void main(String[] args) {
        //task->girilen bir ondalik sayinin ondalik kismindaki rakamlarinin toplamini bulunuz.
        //             24.5673 ==>    5+6+7+3 = 21
        Scanner sc = new Scanner(System.in);
        System.out.println(" Ondalık sayı girin. ");
        String sayi = sc.nextLine();
        if(sayi.contains(","))
            sayi=sayi.replace(",",".");//kullanıcı ondalık yazarken virgül girerse . ile güncelledim

        int nokta_index = sayi.indexOf(".");
        int sayiInt = Integer.parseInt(  sayi.substring(nokta_index+1)  );
        System.out.println("sayiInt = " + sayiInt);
        int rakamlari_toplami=0;
        while (sayiInt>0){
            System.out.print(sayiInt%10 + "+");
            rakamlari_toplami += sayiInt%10;
            sayiInt=sayiInt/10;
            }
        System.out.print(" = " + rakamlari_toplami);

        //task-> Girilen ismin ilk harfinin buyuk olmasını kontrol eden code create ediniz.
    /*    do {
            Scanner sc = new Scanner(System.in);
            System.out.println(" Bir isim girin. ");
            String isim = sc.nextLine();

            char ilk_harf = isim.charAt(0);
            boolean is_uppercase = Character.isUpperCase(ilk_harf);
            if (is_uppercase) {
                System.out.println("isim kabul edildi");
                break;
            }
            else System.out.println("İsmin baş harfi büyük olmalı");
        }while (true);
     */
        //task-> kullanıcıdan alınan bir cümlenin büyük harfle başlayıp nokta ile bittiğini kontrol eden code create ediniz.
 /*       boolean is_uppercase, is_dot;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println(" Bir cümle girin. ");
            String cumle = sc.nextLine();

            char ilk_harf = cumle.charAt(0);
            is_uppercase = Character.isUpperCase(ilk_harf);

            String son_karakter = cumle.substring(cumle.length() - 1);
            is_dot = son_karakter.equals(".");

            if (!is_uppercase) {
                System.out.println("İlk harf büyük olmalı");
            }
            if (!is_dot) {
                System.out.println("Cümle sonuna nokta konmalı");
            }
            if(is_dot && is_uppercase) {
                System.out.println("Cümle koşulları sağlıyor");
                break;
            }
        }while (true);

  */
    }
}
