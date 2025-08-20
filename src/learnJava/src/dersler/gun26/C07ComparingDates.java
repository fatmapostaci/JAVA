package learnJava.src.dersler.gun26;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class C07ComparingDates {

    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(2022,9,10);
        LocalDate bugun = LocalDate.now();
        LocalDate date2 = LocalDate.of(2024,4,4);
        LocalDate date3 = LocalDate.of(2000,4,1);
        LocalDate date4 = LocalDate.of(2024,4,28);

        boolean isDondu = date1.isBefore(bugun); // belirtilen tarihten önce olup olmadığını
        System.out.println("isDondu = " + isDondu);
        System.out.println("date1.isAfter(date3) = " + date1.isAfter(date3)); // True
        System.out.println("date2.isEqual(date3) = " + date2.isEqual(date3)); // False
        System.out.println("date3.isLeapYear() = " + date3.isLeapYear()); // True
        System.out.println("bugun.isLeapYear() = " + bugun.isLeapYear()); // True

        // date1 kac gun oncesini ifade eder
        int count = 0;
        LocalTime time1 = LocalTime.now();
        while(!bugun.isEqual(date1)){
            date1 = date1.plusDays(1);
            count++;
        }
        LocalTime time2 = LocalTime.now();
        System.out.println("gun sayısı = " + count);
        System.out.println("işlem süresi = " + (Duration.between(time1,time2)));

        System.out.println("date2.compareTo(bugun) = " + date2.compareTo(bugun));
        System.out.println("date2.compareTo(date3) = " + date2.compareTo(date3));
        System.out.println("date2.compareTo(date4) = " + date2.compareTo(date4));

                 /*     ComperaTo komutu işlevi:
        2020-05-23 >  2018-04-02   compareTo =>  2  en büyük fark yılda olduğu için
        2020-05-23 >  2020-04-02   compareTo =>  1  en büyük fark ayda  olduğu için
        2020-05-23 >  2020-05-02   compareTo =>  21  en büyük fark günde olduğu için
        */

    }
}
