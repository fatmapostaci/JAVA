package learnJava.src.codeChallenge.gun2;

import java.util.Scanner;

public class SayıOkuma {
    public static void main(String[] args) {
        //  Task-> Girilen 3 haneli bir sayının okunusunu print eden code create ediniz.
        int birler, onlar, yuzler, sayi = 0;
        boolean flag = false;
        do {
            try {
                Scanner input = new Scanner(System.in);
                System.out.print("3 basmakli bir sayı giriniz...");
                sayi = input.nextInt();
                flag = false;
            } catch (Exception e) {
                System.out.println("Geçersiz");
                flag = true;
            }
        } while (flag);
        birler = sayi % 10;
        onlar = (sayi / 10) % 10;
        yuzler = (sayi / 100);

        String birlerS = switch (birler) {
            case 1 -> "bir";
            case 2 -> "iki";
            case 3 -> "üç";
            case 4 -> "dört";
            case 5 -> "beş";
            case 6 -> "altı";
            case 7 -> "yedi";
            case 8 -> "sekiz";
            case 9 -> "dokuz";
            case 0 -> "";
            default -> "???";
        };
        String onlarS = switch (onlar) {
            case 1 -> "on";
            case 2 -> "yirmi";
            case 3 -> "otuz";
            case 4 -> "kırk";
            case 5 -> "elli";
            case 6 -> "altmış";
            case 7 -> "yetmiş";
            case 8 -> "seksen";
            case 9 -> "doksan";
            case 0 -> "";
            default -> "???";
        };
        String yuzlerS = switch (yuzler) {
            case 1 -> "yüz";
            case 2 -> "iki yüz";
            case 3 -> "üç yüz";
            case 4 -> "dört yüz";
            case 5 -> "beş yüz";
            case 6 -> "altı yüz";
            case 7 -> "yedi yüz";
            case 8 -> "sekiz yüz";
            case 9 -> "dokuz yüz";
            case 0 -> "";
            default -> "???";
        };
        System.out.printf("%s %s %s \n", yuzlerS, onlarS, birlerS);

    }

}
