package learnJava.src.dersler.gun15;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        // task-> girilen şifrenin asagidaki sartlari kontrol edin
        // ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        // eger tum sartlari saglarsa, "sifre basariyla kaydedildi" print edin
        // - ilk harf kucuk harf olmali
        // - son karakter rakam olmali
        // - sifre bosluk icermemeli
        // - uzunlugu en az 10 karakter olmali
        boolean flag;
        do {
            Scanner scanf = new Scanner(System.in);
            System.out.print("Şifre girin: ");
            String sifre = scanf.nextLine();
            flag = true;
            boolean isLowerCase = Character.isLowerCase(sifre.charAt(0));
            if (!isLowerCase) {
                System.out.println("İlk harf küçük harf ile başlamalı");
                flag = false;
            }
            boolean isDigit=Character.isDigit(sifre.charAt(sifre.length() - 1));
            if (!isDigit) {
                System.out.println("son karakter rakam olmali");
                flag = false;
            }
            if (sifre.contains(" ")) {
                    System.out.println("sifre bosluk icermemeli");
                    flag = false;
                }
            boolean isLengthTrue=sifre.length() > 9;
            if (!isLengthTrue) {
                System.out.println("uzunlugu en az 10 karakter olmali");
                flag = false;
            }
        } while (flag == false);  //herhangi bir şart sağlanmaz ise flag false dönecek
        //her döngü başında flag true ya dönüyor tekrar hata sorguluyor

        if (flag==true)
            System.out.println("Şifre kabul edildi");
    }
}
