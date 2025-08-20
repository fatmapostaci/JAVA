package learnJava.srcHoca.j06_switchstatement.tasks;

import java.util.Scanner;

public class Task02_DayName {
    public static void main(String[] args) {

        // Task-> Girilen güne  göre 100 gün sonraki hangi günü print eden code create ediniz.
        //  hafta başlangıcı:pazartesi alınız

        Scanner scanner = new Scanner(System.in);
        System.out.println("Haftanın gününü giriniz (1-Pazartesi, 2-Salı, ..., 7-Pazar): ");
        int currentDay = scanner.nextInt();

        // Toplam 100 gün sonrası
        int daysLater = 100;

        // 100 gün sonra hangi gün olduğunu bulmak için, gün sayısını 7'ye göre mod alırız
        int futureDay = (currentDay + daysLater) % 7;

        // Eğer mod işlemi 0 çıkarsa bu Pazar gününe denk gelir
        if (futureDay == 0) {
            futureDay = 7;
        }

        // Hangi gün olduğunu yazdırma
        switch (futureDay) {
            case 1:
                System.out.println("100 gün sonra Pazartesi.");
                break;
            case 2:
                System.out.println("100 gün sonra Salı.");
                break;
            case 3:
                System.out.println("100 gün sonra Çarşamba.");
                break;
            case 4:
                System.out.println("100 gün sonra Perşembe.");
                break;
            case 5:
                System.out.println("100 gün sonra Cuma.");
                break;
            case 6:
                System.out.println("100 gün sonra Cumartesi.");
                break;
            case 7:
                System.out.println("100 gün sonra Pazar.");
                break;
            default:
                System.out.println("Geçersiz gün girdiniz.");
        }
    }
}