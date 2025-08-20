package learnJava.srcHoca.j99_codechallenge.codechallenge02;

import java.util.Scanner;

public class Task10_Switch {
    //  Task-> Girilen 3 haneli bir sayının okunusunu print eden code create ediniz.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("3 basmakli bir sayı giriniz...");
        int sayi = input.nextInt();
        int birler = sayi % 10;
        int onlar = (sayi / 10) % 10;
        int yüzler = (sayi / 100);

        String birlerOkunusu = "";
        String onlarOkunusu = "";
        String yuzlerOkunusu = "";

        if (birler >= 0 && birler < 10) {
            switch (birler) {
                case 1:
                    birlerOkunusu = "bir";
                    break;
                case 2:
                    birlerOkunusu = "iki";
                    break;
                case 3:
                    birlerOkunusu = "üç";
                    break;
                case 4:
                    birlerOkunusu = "dört";
                    break;
                case 5:
                    birlerOkunusu = "beş";
                    break;
                case 6:
                    birlerOkunusu = "altı";
                    break;
                case 7:
                    birlerOkunusu = "yedi";
                    break;
                case 8:
                    birlerOkunusu = "sekiz";
                    break;
                case 9:
                    birlerOkunusu = "dokuz";
                    break;
                case 0:
                    birlerOkunusu = "";
                    break;

            }
        } else {
            System.out.println("birler basamağına rakam girmediniz");
        }

        if (onlar >= 0 && onlar < 10) {
            switch (onlar) {
                case 1:
                    onlarOkunusu = "on";
                    break;
                case 2:
                    onlarOkunusu = "yirmi";
                    break;
                case 3:
                    onlarOkunusu = "otuz";
                    break;
                case 4:
                    onlarOkunusu = "kırk";
                    break;
                case 5:
                    onlarOkunusu = "elli";
                    break;
                case 6:
                    onlarOkunusu = "altmış";
                    break;
                case 7:
                    onlarOkunusu = "yetmiş";
                    break;
                case 8:
                    onlarOkunusu = "seksen";
                    break;
                case 9:
                    onlarOkunusu = "doksan";
                    break;
                case 0:
                    onlarOkunusu = "";
                    break;

            }
        } else {
            System.out.println("onler basamağına rakam girmediniz");
        }

        if (yüzler >= 0 && yüzler < 10) {
            switch (yüzler) {
                case 1:
                    yuzlerOkunusu = "yüz";
                    break;
                case 2:
                    yuzlerOkunusu = "ikiyüz";
                    break;
                case 3:
                    yuzlerOkunusu = "üçyüz";
                    break;
                case 4:
                    yuzlerOkunusu = "dörtyüz";
                    break;
                case 5:
                    yuzlerOkunusu = "beşyüz";
                    break;
                case 6:
                    yuzlerOkunusu = "altıyüz";
                    break;
                case 7:
                    yuzlerOkunusu = "yediyüz";
                    break;
                case 8:
                    yuzlerOkunusu = "sekizyüz";
                    break;
                case 9:
                    yuzlerOkunusu = "dokuzyüz";
                    break;
                case 0:
                    yuzlerOkunusu = "";
                    break;

            }
        } else {
            System.out.println("yüzler basamağına rakam girmediniz");
        }

        System.out.println("girdiğiniz sayının okunuşu : " + yuzlerOkunusu + " " +onlarOkunusu + " " + birlerOkunusu);
    }
}
