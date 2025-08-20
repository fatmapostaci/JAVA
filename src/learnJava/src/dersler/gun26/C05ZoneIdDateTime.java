package learnJava.src.dersler.gun26;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class C05ZoneIdDateTime {

    // herhangi bir ulke/sehir(local) tarih-zaman datasını tutar

    public static void main(String[] args) {
        LocalTime simdi = LocalTime.now();
        LocalTime almanyaCurrentTime = LocalTime.now(ZoneId.of("Europe/Berlin"));
        LocalTime ingiltereCurrentTime = LocalTime.now(ZoneId.of("Europe/London"));
        LocalTime turkiyeCurrentTime = LocalTime.now(ZoneId.of("Europe/Istanbul"));

        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        for (String id:zoneIds){
            if (id.contains("Japan"))System.out.println(id);
        }
        System.out.println("simdi = " + simdi);
        System.out.println("almanyaCurrentTime = " + almanyaCurrentTime);
        System.out.println("ingiltereCurrentTime = " + ingiltereCurrentTime);
        LocalDate japanDate = LocalDate.now(ZoneId.of("Japan"));
        System.out.println("japanDate = " + japanDate);

        ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("Japan"));

    }
}
