package learnJava.src.dersler.gun7;

import java.io.EOFException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class BurcHesaplama {
    public static void main(String[] args) {
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
       Balık Burcu   : 20 Şubat - 20 Mart
       switch-case kullanmadan yapınız. */
        System.out.println("Merhabalar, Programın sonlandırmak istediğinizde  \"*\" karakterini girin");
        while (true) {
            System.out.print("Doğum tarihinizi girin, burcunuzu bulalım: ");
            Scanner scanf = new Scanner(System.in);
            String dogumgunu="", month;
            int day;
            try {
                dogumgunu = scanf.nextLine();

                if ( (dogumgunu.charAt(1)) == 32) { //(2.karakter boşluk ise) 1 0cak formatında veri girilirse if true olur
                    day = Integer.parseInt(dogumgunu.substring(0, 1));
                    month = dogumgunu.substring(2).toUpperCase();
                }
                else {//10 ocak yada 01 ocak formatında veri girilirse else true olur
                    day = Integer.parseInt(dogumgunu.substring(0, 2));
                    month = dogumgunu.substring(3).toUpperCase();
                }
                //burç günleri kontrol bloğu başlangıcı
                if ((month.contains("MART") && 32>day && day > 20) || (month.contains("NISAN") && day>0 && day < 21)) {
                    System.out.println("Koç Burcu (21 Mart - 20 Nisan)");
                } else if ((month.contains("NISAN") && 31>day && day > 20) || (month.contains("MAYIS") && day>0 && day < 22)) {
                    System.out.println("Boğa Burcu (21 Nisan - 21 Mayıs)");
                } else if ((month.contains("MAYIS") && 32>day && day > 21) || (month.contains("HAZIRAN") && day>0 && day < 23)) {
                    System.out.println("İkizler Burcu (22 Mayıs - 22 Haziran)");
                } else if ((month.contains("HAZIRAN") && 31>day && day > 22) || (month.contains("TEMMUZ") && day>0 && day < 23)) {
                    System.out.println("Yengeç Burcu (23 Haziran - 22 Temmuz)");
                } else if ((month.contains("TEMMUZ") && 32>day && day > 22) || (month.contains("AGUSTOS") && day>0 && day < 23)) {
                    System.out.println("Aslan Burcu (23 Temmuz - 22 Ağustos)");
                } else if ((month.contains("AGUSTOS") && 32>day && day > 22) || (month.contains("EYLUL") && day>0 && day < 23)) {
                    System.out.println("Başak Burcu (23 Ağustos - 22 Eylül)");
                } else if ((month.contains("EYLUL") && 31>day && day > 22) || (month.contains("EKIM") && day>0 && day < 23)) {
                    System.out.println("Terazi Burcu (23 Eylül - 22 Ekim)");
                } else if ((month.contains("EKIM") && 31>day && day > 22) || (month.contains("KASIM") && day>0 && day < 22)) {
                    System.out.println("Akrep Burcu (23 Ekim - 21 Kasım)");
                } else if ((month.contains("KASIM") && 31>day && day > 21) || (month.contains("ARALIK") && day>0 && day < 22)) {
                    System.out.println("Yay Burcu (22 Kasım - 21 Aralık)");
                } else if ((month.contains("ARALIK") && 32>day && day > 21) || (month.contains("OCAK") && day>0 && day < 22)) {
                    System.out.println("Oğlak Burcu (22 Aralık - 21 Ocak)");
                } else if ((month.contains("OCAK") && 32>day && day > 21) || (month.contains("SUBAT") && day>0 && day < 20)) {
                    System.out.println("Kova Burcu (22 Ocak - 19 Şubat)");
                } else if ((month.contains("SUBAT") && 30 >day && day > 19) || (month.contains("MART") && day>0 && day < 21)) {
                    System.out.println("Balık Burcu (20 Şubat - 20 Mart)");
                } else
                    System.out.println("Geçerli gün ve ay değerleri giriniz..."); // kullanıcı boşluk bırakmaz ise yada gün ve ay sınırların dışında girilirse
                //burç günleri kontrol bloğu sonu

            } catch (Exception e) { //gün girilmeden string değeri girilirse exception yakalanır
                System.out.println("\"Gün Ay\" formatında giriş yapın");
            } finally {  //her doğumgünü girişi yapılırken program sonlandırma kontrolü yapılır
                assert dogumgunu != null;  //intellij önerdi ne demek bilmiyorum :)
                if (dogumgunu.contains("*")) {
                    System.out.println("program sonlandırıldı...");
                    break;
                }
            }
        }//sonsuz while döngüsü
    }
}
