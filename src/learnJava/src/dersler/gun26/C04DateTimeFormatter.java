package learnJava.src.dersler.gun26;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class C04DateTimeFormatter {
            /*
		 format->
		 GUN
		 d : basta 0 varsa 0 yazmadan gun numarasi yazılır
		 dd: tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi yazar
		 DDD : yilin kacinci gunu oldugunu yazar
		 E, EE, EEE : gun isminin ilk 3 harfi
		 EEEE : gun isminin tamamini

		 AY (Ay icin M, dakika icin m kullanilir)
		 M : basta 0 varsa 0 yazmadan ay numarasi yazılır
		 MM: tek haneli aylari 01 gibi basina sifir yazarak ay numarasi yazılır
		 MMM : Ay isminin ilk 3 harfi yazılır
		 MMMM : Ay isminin tamami yazılır

		 YY : yilin son iki rakamini
		 YYYY : Yilin tamamini yazılır

		 Saat : (24 saat uzerinden istiyorsak H, 12 saat duzeninde istiyorsak h)

		 HH : saatin tamami, tek rakamli saat olursa 02 gibi
		 H  : tek rakamli saat olursa sadece saati 2 gibi yazar

		 hh :  12 saat dilimine gore 2 rakam olarak yazılır
		 h : 12 saat dilimine gore tek rakam olanlari tek olarak yazılır

		 m : minute tek rakamlari 8 gibi  tek yazlır
		 mm: tek rakamlari 08 gibi yazılır

		 a yazarsak AM veya PM degerini yazar
		 */


    public static void main(String[] args) {
        LocalDate bugun = LocalDate.now();
        LocalTime zaman = LocalTime.now();
        LocalDateTime dt = LocalDateTime.now();

        // Tarih Formatları
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("MMM/dd/yyyy");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("MMMM/dd/yyyy");
        DateTimeFormatter format4 = DateTimeFormatter.ofPattern("EEEE, (D) MMMM/dd/yyyy");

        System.out.println("bugun = " + bugun);
        System.out.println("bugun.format(format1) = " + bugun.format(format1));
        System.out.println("bugun.format(format2) = " + format2.format(bugun));
        System.out.println("bugun.format(format3) = " + bugun.format(format3));
        System.out.println("bugun.format(format4) = " + bugun.format(format4));

        // Zaman Formatları
        DateTimeFormatter timeformat1 = DateTimeFormatter.ofPattern("HH:mm");
        DateTimeFormatter timeformat2 = DateTimeFormatter.ofPattern("hh:mm a");

        System.out.println("timeformat1.format(zaman) = " + timeformat1.format(zaman));
        System.out.println("zaman.format(timeformat2) = " + zaman.format(timeformat2));



        // Date Time Formatı
        DateTimeFormatter dateTimeformat1 = DateTimeFormatter.ofPattern("yyyy-MM-dd ; HH:mm");

        System.out.println("dt.format(dateTimeformat1) = " + dt.format(dateTimeformat1));

    }
}
