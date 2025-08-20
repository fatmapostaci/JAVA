package learnJava.src.dersler.gun26;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class C03LocalDateTime {

    public static void main(String[] args) {
        // LocalDateTime -> yıl-ay-gun-s

        LocalDateTime zamanMuhru = LocalDateTime.now();
        System.out.println("zamanMuhru = " + zamanMuhru);

        System.out.println("zamanMuhru.getDayOfWeek() = " + zamanMuhru.getDayOfWeek());
        System.out.println("zamanMuhru.getMinute() = " + zamanMuhru.getMinute());

        LocalDate ozelTarih = LocalDate.of(2024,8,23);
        LocalTime ozelZaman = LocalTime.of(15,34,32);
        LocalDateTime ozelAn = LocalDateTime.of(ozelTarih,ozelZaman);
        System.out.println("ozelAn = " + ozelAn);

        System.out.println("ozelAn.plusMonths(3) = " + ozelAn.plusMonths(3));


    }
}
