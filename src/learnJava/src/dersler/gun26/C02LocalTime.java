package learnJava.src.dersler.gun26;

import java.time.LocalTime;

public class C02LocalTime {
    // LocalTime  -> sadece saat-dakika-saniye datalarını tutar(stored)
    //Trick->LocalTime variable olusturulurken new keyword kullanilmaz

    public static void main(String[] args) {
        LocalTime zaman = LocalTime.now();
        System.out.println("zaman = " + zaman);

        // LocalTime datasında tanımlı metodlar:
        int saat = zaman.getHour();
        System.out.println("saat = " + saat);
        System.out.println("zaman.getMinute() = " + zaman.getMinute());
        System.out.println("zaman.getSecond() = " + zaman.getSecond());
        System.out.println("zaman.getNano() = " + zaman.getNano());

        // İstenilen zamanı oluşturma
        LocalTime zaman1 = LocalTime.of(13,5,12,34);
        LocalTime zaman2 = LocalTime.of(15,34);

        System.out.println("zaman1 = " + zaman1);
        System.out.println("zaman2 = " + zaman2);

        // Saati ve diğer dataları ileri ve geri alabiliriz

        System.out.println("zaman1.plusHours(3).minusMinutes(12) = " + zaman1.plusHours(3).minusMinutes(12));


    }
}
