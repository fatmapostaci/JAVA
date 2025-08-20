package learnJava.src.codeChallenge.ALLSUBJECTS;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateAndTime {
    public static void main(String[] args) {
        //Görev 1: Mevcut tarihi ve saati ekrana yazdıran bir program yazın.
        LocalDate mevcutTarih = LocalDate.now();
        LocalTime mevcutSaat = LocalTime.now();
        System.out.println( " BUGÜN " + mevcutTarih.toString());
        System.out.println("ŞUANKİ SAAT " + mevcutSaat.toString() );

        //
        //Görev 2: Kullanıcıdan bir tarih girişi alarak, o tarihin haftanın hangi gününe denk geldiğini bulan bir program yazın.
        System.out.println("Kullanıcıdan bir tarih girişi al");
        String tarihStr = (new Scanner(System.in)).nextLine();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate localDateTarihStr = null;
        try {
            localDateTarihStr = LocalDate.parse(tarihStr,format);
        } catch (Exception e) {
            System.out.println( "format kabul edilmedi. Doğru format  dd.MM.yyyy  olmalıdır");
        }
        finally {
            System.out.println("TARİH = " + localDateTarihStr);
        }
        System.out.println("GUNLERDEN "+localDateTarihStr.getDayOfWeek().toString());
        //
        //Görev 3: İki tarih arasındaki gün farkını hesaplayan bir metod yazın.
        Period period = Period.between(localDateTarihStr,mevcutTarih);
        System.out.println("İKİ TARİH ARASINDAKİ GUN FARKI : "+period.getDays());
        //
        //Görev 4: Belirli bir saati 2 saat ileri ve 30 dakika geri alan bir program yazın.
        LocalTime saat = LocalTime.of(2,4,45);
        System.out.println("saat = " + saat);
        System.out.println("2 saat 30dk sonrası = " +saat.plusHours(2).minusMinutes(30));
        //
        //Görev 5: Şu çıktıyı üretecek bir metod yazın:
        gorev5();
        //
        //Bugün: 2024-08-30
        //Şu anki saat: 14:45
        //Bir hafta sonrası: 2024-09-06
        //

    }
    static void gorev5(){
        LocalDate mevcutTarih = LocalDate.now();
        LocalTime mevcutSaat = LocalTime.now();
        System.out.println( "Bugün: " + mevcutTarih.toString());
        DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("hh:mm");
        System.out.println("Şu anki saat: " + mevcutSaat.format(formatTime) );
        System.out.println("Bir hafta sonrası: " + mevcutTarih.plusWeeks(1));

    }
}
