package learnJava.src.dersler.gun26;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class Mentoring {
    public static void main(String[] args) {
        //Örnek 1 : Bugünün Tarihi, 10 Gün Önce ve 10 Gün Sonranın tarihini yazdıralım
        LocalDate bugununTarihi = LocalDate.now();
        String onGunOncesi = bugununTarihi.plusDays(-10).toString();
        System.out.println("onGunOncesi = " + onGunOncesi);
        System.out.println("bugununTarihi.plusDays(10) = " + bugununTarihi.plusDays(10));

        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("MM-yyyy-dd");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("yyyy-MM-dd.hh-mm-ss-SS");
        LocalDate onGunOncesiLD = bugununTarihi.plusDays(-10);
        System.out.println("format1.format(onGunOncesiLD) = " + format1.format(onGunOncesiLD));
        LocalDate onGunSonrasiLD = bugununTarihi.plusDays(10);
        System.out.println("format2.format(onGunSonrasiLD) = " + format2.format(onGunSonrasiLD));

        //Örnek 2 : Şu Anki Saat, 2 Saat Önce ve 3 Saat Sonra yazıralım
        LocalTime suankiSaat = LocalTime.now();
        String ikiSaatOncesi = suankiSaat.plusHours(-2).toString();
        System.out.println("ikiSaatOncesi = " + ikiSaatOncesi);
        String ucSaatSonrasi = suankiSaat.plusHours(3).toString();
        System.out.println("ucSaatSonrasi = " + ucSaatSonrasi);

        // Örnek 3 : Bir kullanıcı hem tarih hem de saat olarak bugünü , 5 gün ve 4 saat sonrasını görmek istiyor.
        LocalDateTime tarihVeSaat = LocalDateTime.now();
        LocalDateTime besGunDortSaatSonrasi = tarihVeSaat.plusDays(5).plusHours(4);
        System.out.println("format1.format(besGunDortSaatSonrasi) = " + format1.format(besGunDortSaatSonrasi));
        System.out.println("besGunDortSaatSonrasi = " + besGunDortSaatSonrasi);
        System.out.println("format3.format(tarihVeSaat) = " + format3.format(tarihVeSaat));
        System.out.println();
        // Örnek 4: Kullanıcı, bugünkü tarihin bulunduğu haftanın başlangıç ve bitiş tarihlerini görmek istiyor.
        LocalDate bugun = LocalDate.now();
        System.out.println("bugun.getYear() = " + bugun.getYear());
        System.out.println("bugun.getMonth() = " + bugun.getMonth());
        System.out.println("bugun.getDayOfMonth() = " + bugun.getDayOfMonth());
        System.out.println("bugun.getDayOfWeek() = " + bugun.getDayOfWeek());
        //bulunduğumuz günün bulunduğu haftaya ait tarihlere ulaşma yolu
        System.out.println("bugun.with(DayOfWeek.MONDAY) = " + bugun.with(DayOfWeek.MONDAY));
        System.out.println("bugun.with(DayOfWeek.SUNDAY) = " + bugun.with(DayOfWeek.SUNDAY));

        System.out.println("bugun.with(LocalDate.now()) = " + bugun.with(LocalDate.now()));
        System.out.println("bugun.lengthOfMonth() = " + bugun.lengthOfMonth());
        System.out.println("bugun.lengthOfMonth() = " + bugun.plusDays(30).lengthOfMonth());

        //Örnek: Bir Tarihin Yılın Kaçıncı Günü Olduğunu Bulma
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String stringTarih = "13.01.2024";
        LocalDate gun2 = LocalDate.parse(stringTarih, format);
        System.out.println("gun2.getDayOfYear() = " + gun2.getDayOfYear());
        System.out.println("gun = " + gun2);
        System.out.println();
        //Örnek: Haftanın Gününü Belirleme
        LocalDate day = LocalDate.of(1986, 04, 13);
        System.out.println("day = " + day);
        System.out.println("day.get(ChronoField.DAY_OF_WEEK) = " + day.get(ChronoField.DAY_OF_WEEK));
        System.out.println("day.getDayOfWeek() = " + day.getDayOfWeek());

        DayOfWeek gun = day.getDayOfWeek();
        System.out.println("gun = " + gun);


        //Örnek: Bir Saat Dilimine Göre Saat Belirleme
         LocalTime now = LocalTime.now(ZoneId.of("Asia/Istanbul"));
         LocalTime now2 = LocalTime.now(ZoneId.of("Asia/Ulaanbaatar"));
         System.out.println("now = " + now);
         System.out.println("now2 = " + now2);
         DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
         System.out.println("timeFormatter.format(now) = " + timeFormatter.format(now));

    }
}
