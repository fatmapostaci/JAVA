package learnJava.src.codeChallenge.gun2;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Odev {

    public static void main(String[] args) {
 /*       //Task->  Girilen bir tamsayının onlar basamağının harf karakteri ile  print eden code create ediniz.
        // örnek: girdi :234 ->  çıktı : "Üç"
        Scanner scanf = new Scanner(System.in);
        System.out.print("Tam sayı bir değer girin: ");
        int sayi = scanf.nextInt();
        int onlar = (sayi /=10)%10;
        String onlarS = switch (onlar) {
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
        System.out.println("onlar basamağındaki rakam = " + onlarS);
*/

        // Task-> Girilen güne  göre 100 gün sonraki hangi günü print eden code create ediniz.
        //  hafta başlangıcı:pazartesi alınız

        // ipucu: Günleri sayılara atayarak mod 7 de iişem yapmayı deneyebilirsiniz
        // Mesela pazartesi = 1 olsun 10 gün sonra mod 7 de 3 olur. Yani 3 dün sonrasını yazdırmalıyız

        //Scanner scanf = new Scanner(System.in);
        System.out.print("Günü girin: ");
        Scanner scanf = new Scanner(System.in);
        String dayOfWeek = scanf.next().toUpperCase();
        int ilkGun = switch (dayOfWeek){
            case "PAZARTESI" -> 1;
            case "SALI" -> 2;
            case "CARSAMBA" -> 3;
            case "PERSEMBE" ->4;
            case "CUMA" ->5;
            case "CUMARTESI" ->6;
            case "PAZAR" -> 7;
            default -> 0;
        };
        int gunEkle = (ilkGun + 100)%7;
        String dayOutput = switch (gunEkle){
            case 1 -> "PAZARTESI";
            case 2 -> "SALI";
            case 3 ->"CARSAMBA";
            case 4 -> "PERSEMBE";
            case 5-> "CUMA" ;
            case 6->"CUMARTESI";
            case 7->"PAZAR" ;
            default -> "";
        };
        System.out.println("dayOutput = " + dayOutput);


    }
}
