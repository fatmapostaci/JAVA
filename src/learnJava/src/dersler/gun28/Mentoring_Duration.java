package learnJava.src.dersler.gun28;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Mentoring_Duration {
    public static void main(String[] args) {
        //Duration Tasks-1 : İki Saat Arasındaki Farkı Hesaplama
        LocalTime startTime = LocalTime.of(9, 30);
        LocalTime endTime = LocalTime.of(15, 45);
        Duration d = Duration.between(startTime,endTime);
        System.out.println("İki Saat Arasındaki Fark " +d.toString());

        //Duration Tasks-2 : İki Tarih-Saat Arasındaki Farkı Saniye Olarak Hesaplama
        LocalDateTime startDateTime = LocalDateTime.of(2024, 11, 1, 14, 0);
        LocalDateTime endDateTime = LocalDateTime.of(2024, 11, 2, 16, 30);
        Duration d2 = Duration.between(startDateTime,endDateTime);
        System.out.println("İki Tarih-Saat Arasındaki Farkı Saniye Olarak Hesaplama = " + d2.toSeconds());

        //Duration Tasks-3 : Bir Görevin Süresini Ölçme
        //Görev : 0 dan 100 e kadar olan sayıların karesini alıp yazdırma (milisaniye olarak)
        LocalTime baslangicAni = LocalTime.now();
        for (int i = 0; i < 1000000; i++) {
           // System.out.print(Math.pow(i, 2) +" ");

        }
        LocalTime bitisAni = LocalTime.now();
        Duration dPow = Duration.between(baslangicAni,bitisAni);
        long gecenSure = dPow.toSeconds();
        System.out.println("\ngecenSure = " + gecenSure + " saniye");
        System.out.println("gecenSure = " + dPow.toMillis()+ " milisaniye");
/*
        Duration Tasks-4 : Zaman Aralığı İçinde İşlem Takibi
        Bir fabrikada üretim hattında makinelerin çalışma sürelerini takip etmek istiyorsunuz.
        Fabrika, sabah saat 08:00'da çalışmaya başlar ve akşam saat 18:00'da biter.
        Üretim hattındaki makinelerin çalışma aralığı aşağıdaki gibidir:

        Makine 1: 09:15 - 12:45
        Makine 2: 08:30 - 16:15
        Makine 3: 10:00 - 18:00
        Fabrikanın toplam çalışma süresine göre makinelerin ne kadar süre aktif olduğunu hesaplayın.
        */
        LocalTime mak1bas = LocalTime.of(9,15);
        LocalTime mak1bit = LocalTime.of(12,45);
        LocalTime mak2bas = LocalTime.of(8,30);
        LocalTime mak2bit = LocalTime.of(16,15);
        LocalTime mak3bas = LocalTime.of(10,00);
        LocalTime mak3bit = LocalTime.of(18,00);
        LocalTime fabBas = LocalTime.of(8,0);
        LocalTime fabBit = LocalTime.of(18,0);

        Duration mak1 = Duration.between(mak1bas,mak1bit);
        Duration mak2 = Duration.between(mak2bas,mak2bit);
        Duration mak3 = Duration.between(mak3bas,mak3bit);


        Duration fabrika = Duration.between(fabBas,fabBit);
        Duration delayTimeMak1 =  fabrika.minus(mak1);
        Duration delayTimeMak2 =  fabrika.minus(mak2);
        Duration delayTimeMak3 =  fabrika.minus(mak3);

        System.out.println("delayTimeMak1 = " + delayTimeMak1);
        System.out.println("delayTimeMak2 = " + delayTimeMak2);
        System.out.println("delayTimeMak3 = " + delayTimeMak3);

    }
}
