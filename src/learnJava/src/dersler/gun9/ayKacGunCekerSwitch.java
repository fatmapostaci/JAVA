package learnJava.src.dersler.gun9;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class ayKacGunCekerSwitch {
    public static void main(String[] args) {
        // Task-> Girilen ay numarasına göre kaç gün çektiğini print eden code create ediniz...
        Scanner input = new Scanner(System.in);
        System.out.println("Ay numarasını giriniz...");
        byte ayNo = input.nextByte();
        int numOfDays =0;
        LocalDate date = LocalDate.now();
        int year = date.getYear();
        switch (ayNo){
            case 1,3,5,7,8,10,12:
                System.out.println("31 gün çeker");
                break;
            case 4,6,9,11:
                System.out.println("30 gün çeker");
                break;
            case 2:
                String s28 = "28 gün çeker";
                String s29 = "29 gün çeker";
                System.out.println( (year%4==0 ?  ( year% 100 == 0  ? (  year %400==0 ? s29 : s28 )  : s29 )  : s28));
                break;
            default:
                System.out.println("Geçerli ay numarası girin!");
        }
    }
}
