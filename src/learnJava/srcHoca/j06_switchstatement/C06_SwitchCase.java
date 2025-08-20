package learnJava.srcHoca.j06_switchstatement;

import java.util.Scanner;

public class C06_SwitchCase {
    // TASK-> Girilen haftanın gününü hafta içi veya sonu oldugunu print eden code create ediniz..

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen haftanın gününü (ingilizce karakterler ile ) isim olarak giriniz...");
        String  dayName = input.next();

        switch (dayName.toLowerCase()) {
            case "pazartesi","sali","carsamba","persembe","cuma" :
                System.out.println("Hafta içi");
                break;
            case "cumartesi","pazar":
                System.out.println("Hafta Sonu");
            default:
                System.out.println("Yanlış gün ismi girdiniz özellikle 'ı','ç' 'ş' gibi Türkçe karakter yazamayınız...");

        }

















    }
}
