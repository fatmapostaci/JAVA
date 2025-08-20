package learnJava.src.dersler.gun7;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class T09_BurcHesaplama_Azize_Hanım {
    /*
       Koç Burcu     : 21 Mart - 20 Nisan
       Boğa Burcu    : 21 Nisan - 21 Mayıs
       İkizler Burcu : 22 Mayıs - 22 Haziran
       Yengeç Burcu  : 23 Haziran - 22 Temmuz
       Aslan Burcu   : 23 Temmuz - 22 Ağustos
       Başak Burcu   : 23 Ağustos - 22 Eylül
       Terazi Burcu  : 23 Eylül - 22 Ekim
       Akrep Burcu   : 23 Ekim - 21 Kasım
       Yay Burcu     : 22 Kasım - 21 Aralık
       Oğlak Burcu   : 22 Aralık - 21 Ocak
       Kova Burcu    : 22 Ocak - 19 Şubat
       Balık Burcu   : 20 Şubat - 20 Mart */

    public static void main(String[] args) {
        /*
        Notlar :

        - Öncelikle kullanicidan Yil-Ay-Gün-(2020-03-15)  formatinda dogum tarihi girisi alinir.
        - Daha sonra bu tarih LocalDate metodu ile bir tarih objesine dönüstürülür.
        -Try- Catch ile hatali tarih girisi durumunda uyari verilir ve While ile dogru deger girilene kadar tekrarlanir.
        -belirli bir tarihi almak icin ise LocalDate metodunun .of metodu cagirilir. ( LocalDate.of(dogumTarihiParse.getYear())
        -tarih araliklari burclarin baslangic ve bitis tarihlerini olusturur.
        -dogumTarihiParse (LocalDate ile parse edilmis yeni objemiz.Yani kullanicinin formatlanmis dogum tarihi )
         bu objenin kullanabilecegi metodlardan isAfter, isBefore ve isEqual ile tarih araliklarini belirleyerek ,
         o tarihe karsilik gelen burclari yazdiririz.
         -Burada isAfter ve isBefore metodlari esitlik durumunda da false döndürdügü icin isEquals metodunu da kullaniriz.
        Koç Burcu     : 21 Mart - 20 Nisan. --> bu tarih araliginda 21 Mart sonrasi icin isAfter -
                                                                    20 Nisan öncesi icin isBefore
                                          21 Mart ve 20 Nisan tarihlerini de alabilmek icin ise isEqual metodlari kullanilir

        Bu üc metodun calisma mantigi :
         isAfter :
        LocalDate a = LocalDate. of(2012, 6, 30);
        LocalDate b = LocalDate. of(2012, 7, 1);
        a.isAfter(b) == false
        a.isAfter(a) == false
        b.isAfter(a) == true

        isEquals :
        LocalDate a = LocalDate. of(2012, 6, 30);
        LocalDate b = LocalDate. of(2012, 7, 1);
        a.isEqual(b) == false
        a.isEqual(a) == true
        b.isEqual(a) == false

        LocalDate a = LocalDate. of(2012, 6, 30);
        LocalDate b = LocalDate. of(2012, 7, 1);
        a.isBefore(b) == true
        a.isBefore(a) == false
        b.isBefore(a) == false

         */

        String dogumTarihiKullanici;

        System.out.println("Dogum tarihinizi Yil-Ay-Gün-(2020-03-15) seklinde giriniz");
        Scanner scan = new Scanner(System.in);
        dogumTarihiKullanici = scan.nextLine();

        LocalDate dogumTarihiParse = null;

        while (dogumTarihiParse == null) {
            try {
                dogumTarihiParse = LocalDate.parse(dogumTarihiKullanici);
            } catch (DateTimeParseException e) {
                // Eğer tarih formatı yanlışsa, bu mesaj gösterilecek
                System.out.println("Geçersiz tarih formatı! Dogum tarihinizi Yil-Ay-Gün-(2020-03-15) seklinde giriniz.");
                dogumTarihiKullanici = scan.nextLine();
            }
        }

        LocalDate kocBaslangic = LocalDate.of(dogumTarihiParse.getYear(), 3, 21);
        LocalDate kocBitis = LocalDate.of(dogumTarihiParse.getYear(), 4, 20);

        LocalDate bogaBaslangic = LocalDate.of(dogumTarihiParse.getYear(), 4, 21);
        LocalDate bogaBitis = LocalDate.of(dogumTarihiParse.getYear(), 5, 21);

        LocalDate ikizlerBaslangic = LocalDate.of(dogumTarihiParse.getYear(), 5, 22);
        LocalDate ikizlerBitis = LocalDate.of(dogumTarihiParse.getYear(), 6, 22);

        LocalDate yengecBaslangic = LocalDate.of(dogumTarihiParse.getYear(), 6, 23);
        LocalDate yengecBitis = LocalDate.of(dogumTarihiParse.getYear(), 7, 22);

        LocalDate aslanBaslangic = LocalDate.of(dogumTarihiParse.getYear(), 7, 23);
        LocalDate aslanBitis = LocalDate.of(dogumTarihiParse.getYear(), 8, 22);

        LocalDate basakBaslangic = LocalDate.of(dogumTarihiParse.getYear(), 8, 23);
        LocalDate basakBitis = LocalDate.of(dogumTarihiParse.getYear(), 9, 22);

        LocalDate teraziBaslangic = LocalDate.of(dogumTarihiParse.getYear(), 9, 23);
        LocalDate teraziBitis = LocalDate.of(dogumTarihiParse.getYear(), 10, 22);

        LocalDate akrepBaslangic = LocalDate.of(dogumTarihiParse.getYear(), 10, 23);
        LocalDate akrepBitis = LocalDate.of(dogumTarihiParse.getYear(), 11, 21);

        LocalDate yayBaslangic = LocalDate.of(dogumTarihiParse.getYear(), 11, 22);
        LocalDate yayBitis = LocalDate.of(dogumTarihiParse.getYear(), 12, 21);

        LocalDate oglakBaslangic = LocalDate.of(dogumTarihiParse.getYear(), 12, 22);
        LocalDate oglakBitis = LocalDate.of(dogumTarihiParse.getYear(), 1, 21);

        LocalDate kovaBaslangic = LocalDate.of(dogumTarihiParse.getYear(), 1, 22);
        LocalDate kovaBitis = LocalDate.of(dogumTarihiParse.getYear(), 2, 19);

        LocalDate balikBaslangic = LocalDate.of(dogumTarihiParse.getYear(), 2, 20);
        LocalDate balikBitis = LocalDate.of(dogumTarihiParse.getYear(), 3, 20);

        if ((dogumTarihiParse.isAfter(kocBaslangic) || dogumTarihiParse.isEqual(kocBaslangic)) && (dogumTarihiParse.isBefore(kocBitis) || dogumTarihiParse.isEqual(kocBitis))) {
            System.out.println("Burcunuz: Koç");
        } else if ((dogumTarihiParse.isAfter(bogaBaslangic) || dogumTarihiParse.isEqual(bogaBaslangic)) && (dogumTarihiParse.isBefore(bogaBitis) || dogumTarihiParse.isEqual(bogaBitis))) {
            System.out.println("Burcunuz: Boğa");
        } else if ((dogumTarihiParse.isAfter(ikizlerBaslangic) || dogumTarihiParse.isEqual(ikizlerBaslangic)) && (dogumTarihiParse.isBefore(ikizlerBitis) || dogumTarihiParse.isEqual(ikizlerBitis))) {
            System.out.println("Burcunuz: İkizler");
        } else if ((dogumTarihiParse.isAfter(yengecBaslangic) || dogumTarihiParse.isEqual(yengecBaslangic)) && (dogumTarihiParse.isBefore(yengecBitis) || dogumTarihiParse.isEqual(yengecBitis))) {
            System.out.println("Burcunuz: Yengeç");
        } else if ((dogumTarihiParse.isAfter(aslanBaslangic) || dogumTarihiParse.isEqual(aslanBaslangic)) && (dogumTarihiParse.isBefore(aslanBitis) || dogumTarihiParse.isEqual(aslanBitis))) {
            System.out.println("Burcunuz: Aslan");
        } else if ((dogumTarihiParse.isAfter(basakBaslangic) || dogumTarihiParse.isEqual(basakBaslangic)) && (dogumTarihiParse.isBefore(basakBitis) || dogumTarihiParse.isEqual(basakBitis))) {
            System.out.println("Burcunuz: Başak");
        } else if ((dogumTarihiParse.isAfter(teraziBaslangic) || dogumTarihiParse.isEqual(teraziBaslangic)) && (dogumTarihiParse.isBefore(teraziBitis) || dogumTarihiParse.isEqual(teraziBitis))) {
            System.out.println("Burcunuz: Terazi");
        } else if ((dogumTarihiParse.isAfter(akrepBaslangic) || dogumTarihiParse.isEqual(akrepBaslangic)) && (dogumTarihiParse.isBefore(akrepBitis) || dogumTarihiParse.isEqual(akrepBitis))) {
            System.out.println("Burcunuz: Akrep");
        } else if ((dogumTarihiParse.isAfter(yayBaslangic) || dogumTarihiParse.isEqual(yayBaslangic)) && (dogumTarihiParse.isBefore(yayBitis) || dogumTarihiParse.isEqual(yayBitis))) {
            System.out.println("Burcunuz: Yay");
        } else if ((dogumTarihiParse.isAfter(oglakBaslangic) || dogumTarihiParse.isEqual(oglakBaslangic)) && (dogumTarihiParse.isBefore(oglakBitis) || dogumTarihiParse.isEqual(oglakBitis))) {
            System.out.println("Burcunuz: Oğlak");
        } else if ((dogumTarihiParse.isAfter(kovaBaslangic) || dogumTarihiParse.isEqual(kovaBaslangic)) && (dogumTarihiParse.isBefore(kovaBitis) || dogumTarihiParse.isEqual(kovaBitis))) {
            System.out.println("Burcunuz: Kova");
        } else if ((dogumTarihiParse.isAfter(balikBaslangic) || dogumTarihiParse.isEqual(balikBaslangic)) && (dogumTarihiParse.isBefore(balikBitis) || dogumTarihiParse.isEqual(balikBitis))) {
            System.out.println("Burcunuz: Balık");
        } else {
            System.out.println("Geçersiz tarih girdiniz!");
        }
    }
}


