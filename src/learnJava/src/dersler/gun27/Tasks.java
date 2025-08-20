package learnJava.src.dersler.gun27;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Tasks {
    public static void main(String[] args) {

        //DURATION CLASS
        LocalTime t1 = LocalTime.of(0,25,30);
        LocalTime t2 = LocalTime.of(20,25,30);
        LocalTime t3 = LocalTime.of(23,10,30);
        LocalTime t4 = LocalTime.of(2,25,30);

        Duration d1 = Duration.between(t3,t1);
        System.out.println("d1.toHours() = " + d1.toHours());
        System.out.println("d1.toDays() = " + d1.toDays());

        LocalDate day1 = LocalDate.of(2021,3,11);
        LocalDate day2 = LocalDate.of(2024,5,2);
        Period p = Period.between(day2,day1);
        System.out.println("d2.toMonths() = " + p.toTotalMonths());

        System.out.println("p.withDays() = " + p.withDays(0));

        //COMPARING
        LocalDate bugun = LocalDate.now();
        boolean isReturned = day1.isBefore(bugun);
        System.out.println("isReturned = " + isReturned);
        System.out.println("day1.isAfter(day2) = " + day1.isAfter(day2));
        //
        //kaç gün geciktiğini hesapla
        int count = 0;
        LocalTime time1 = LocalTime.now();
        while (!bugun.isEqual(day1)){
            day1 = day1.plusDays(1);
            count++;
        }
        LocalTime time2 = LocalTime.now();
        System.out.println("count = " + count);
        System.out.println("Duration.between(time1,time2) = " + Duration.between(time1, time2));
        System.out.println("day2.compareTo(bugun) = " + day2.compareTo(bugun));

        //Period

        Period periodCW = Period.of(0,11,0);
        LocalDate kursBaslangici = LocalDate.of(2024,9,30);
        LocalDate kurBitis = kursBaslangici.plus(periodCW);
        //yada
        Period periodAylar = Period.ofMonths(11);
        LocalDate kursBitis = kursBaslangici.plus(periodAylar);
        System.out.println("kursBitis = " + kursBitis);
        String kursBitisString = kursBaslangici.plus(periodAylar).format((DateTimeFormatter.BASIC_ISO_DATE) );
        System.out.println("kursBitisString = " + kursBitisString);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        DateTimeFormatter formatterISO =  DateTimeFormatter.ISO_DATE;
        String strNew = "02.12.2024";
        System.out.println("LocalDate.parse(strNew,formatter).format(formatter) = " + LocalDate.parse(strNew, formatter).format(formatterISO));
    }
}
