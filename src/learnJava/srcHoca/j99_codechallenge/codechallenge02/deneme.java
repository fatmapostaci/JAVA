package learnJava.srcHoca.j99_codechallenge.codechallenge02;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        int birler, onlar, yuzler;
        boolean flag;
        int sayi = 0;

        do {
            flag = false; // Döngü her başladığında flag false olmalı
            try {
                Scanner input = new Scanner(System.in);
                System.out.print("3 basamaklı bir sayı giriniz: ");
                sayi = input.nextInt();

                if (sayi < 100 || sayi > 999) { // 3 basamaklı sayı kontrolü
                    System.out.println("Lütfen 3 basamaklı bir sayı giriniz.");
                    flag = true;
                }

            } catch (Exception e) {
                System.out.println("Geçersiz veri girdiniz, tekrar deneyiniz.");
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

