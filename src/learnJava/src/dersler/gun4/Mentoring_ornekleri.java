package learnJava.src.dersler.gun4;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Mentoring_ornekleri {
    public static void main(String[] args) throws ParseException {

        String birthDate = "13/04/1986";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date birthday = simpleDateFormat.parse(birthDate);//date formatında doğumgünü tarihi
        Date today = Calendar.getInstance().getTime();  //date formatında bugünün tarihi
        
        long diff = today.getTime() - birthday.getTime();
        System.out.println("diff/1000/60/60/24/365 = " + diff/1000/60/60/24/365);
        
        
       // String todayAsString = simpleDateFormat.format(today).toString();
    //    String birtddayAsString = simpleDateFormat.format(birthday).toString();
       // String t = new String(todayAsString);
        //String b = new String(birtddayAsString);
        System.out.println("birthday = " + simpleDateFormat.format(birthday));
        System.out.println("today = " + simpleDateFormat.format(today));
      //  System.out.println("birtddayAsString = " + birtddayAsString);
      //  System.out.println("todayAsString = " + todayAsString);

        
   /*     LocalDate date1 = LocalDate.parse(t);
        LocalDate date2 = LocalDate.parse(t);
        Period period = date2.until(date1);
        int yearsBetween = period.getYears();
        System.out.println("yearsBetween = " + yearsBetween);



/*

        

/*
        Senaryo : Ürün Fiyatlandırma ve İndirim Hesaplama
        Bir e-ticaret platformu için ürünlerin fiyatlarını ve indirim oranlarını hesaplayan bir modül geliştiriyorsun.
        Kullanıcıdan önce ürünün fiyatını, ardından uygulanacak indirim oranını alman gerekiyor.
        Ancak indirim oranı bir tam sayı (int) olarak girilecek ve hesaplamalarda double türüne dönüştürülmesi gerekiyor.

        Görevler:
        .Kullanıcıdan bir ürünün fiyatını ondalıklı sayı (double) olarak al ve bu fiyatı ekrana yazdır.
        .Kullanıcıdan indirim oranını tam sayı (int) olarak al ve bu değeri ondalıklı (double) olarak kullanmak üzere dönüştür.
        İndirim oranını kullanarak, ürünün indirimli fiyatını hesapla.
        İndirimli fiyatı ekrana yazdır.
        Bilgi:
        İndirimli fiyat formülü: indirimliFiyat = fiyat - (fiyat * indirimOrani / 100)
        Beklenen Çıktı:
        Kullanıcıdan alınan ürün fiyatı ve indirim oranı doğru şekilde ekrana yazdırılmalı.
        İndirimli fiyat hem ondalıklı (double) hem de tam sayı (int) olarak gösterilmeli.
*/

        double urun_fiyati;
        int indirim_orani; //cast edecek int - double
        Scanner scanf = new Scanner(System.in);

        System.out.print("Ürünün fiyatını girin:");
        urun_fiyati  = scanf.nextDouble();
        System.out.println("urun_fiyati = " + urun_fiyati);

        System.out.print("İndirim oranını girin:");
        indirim_orani  = scanf.nextInt();

        System.out.println("İndirimli fiyat:" + (urun_fiyati - (urun_fiyati*indirim_orani/100)) );
        System.out.println("İndirimli fiyat:" + (int)(urun_fiyati - (urun_fiyati*indirim_orani/100)) );





        System.out.printf("\n\n\n\n");




    }
}
