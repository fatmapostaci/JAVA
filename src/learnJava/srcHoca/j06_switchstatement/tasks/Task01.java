package learnJava.srcHoca.j06_switchstatement.tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        //Task->  Girilen bir tamsayının onlar basamağının harf karakteri ile  print eden code create ediniz.

        // Kullanıcıdan tam sayı alıyoruz
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir tamsayı giriniz: ");
        int number = scanner.nextInt();

        // Sayının mutlak değerini alarak negatiflikten kurtuluyoruz
        number = Math.abs(number);

        // Onlar basamağını bulmak için sayıyı 10'a böleriz ve 10 ile mod alırız
        int tensDigit = (number / 10) % 10;

        // Onlar basamağını harf olarak yazdırıyoruz
        switch (tensDigit) {
            case 0:
                System.out.println("Onlar basamağı: Sıfır");
                break;
            case 1:
                System.out.println("Onlar basamağı: Bir");
                break;
            case 2:
                System.out.println("Onlar basamağı: İki");
                break;
            case 3:
                System.out.println("Onlar basamağı: Üç");
                break;
            case 4:
                System.out.println("Onlar basamağı: Dört");
                break;
            case 5:
                System.out.println("Onlar basamağı: Beş");
                break;
            case 6:
                System.out.println("Onlar basamağı: Altı");
                break;
            case 7:
                System.out.println("Onlar basamağı: Yedi");
                break;
            case 8:
                System.out.println("Onlar basamağı: Sekiz");
                break;
            case 9:
                System.out.println("Onlar basamağı: Dokuz");
                break;
            default:
                System.out.println("Geçersiz bir sayı girdiniz.");


        }
    }
}