package learnJava.src.dersler.gun9;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        int day = 5;
        String dayName = switch (day) {
            case 1 -> "Monday"; // Değer atamasını switch içinde manuel olarak yapmalısınız
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            default -> "Invalid day";
        };
        System.out.println("dayName");

        // TASK-> Girilen haftanın gününü hafta içi veya sonu oldugunu print eden code create ediniz..
        System.out.println("Haftanın gününü girin:");
        Scanner scanf = new Scanner(System.in);
        String gun = scanf.next().toUpperCase();
        switch (gun) {
            case "PAZARTESI":
            case "SALI":
            case "CARSAMBA":
            case "PERSEMBE":
            case "CUMA":
                System.out.println("Haftaiçi");
                break;
            case "CUMARTESI":
            case "PAZAR":
                System.out.println("Haftasonu");
                break;
            default:
                System.out.println("Hatalı veri girişi.");
        }
          String output =  switch (gun){
            case"PAZARTESI","SALI","CARSAMBA","PERSEMBE","CUMA"-> "HAFTAICI";
            case"CUMARTESI","PAZAR" -> "HAFTASONU";
              default -> "HATALI VERİ GİRİŞİ";
        };
        System.out.println("output = " + output);


        String dayN =switch (day){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            default -> "geşerli gün giriniz";
        };

        // Task-> Girilen ay numarasına göre  mevsimini print eden code create ediniz...
        System.out.println("kaçıncı aydayız? ");
        int ayNumber = scanf.nextInt();
        String mevsim = switch (ayNumber){
            case 12,1, 2 -> "KIŞ";
            case 3,4,5 -> "ILKBAHAR";
            case 6, 7, 8 -> "YAZ";
            case 9, 10, 11 -> "SONBAHAR";
            default -> "Invalid number";
            };



    }


}
