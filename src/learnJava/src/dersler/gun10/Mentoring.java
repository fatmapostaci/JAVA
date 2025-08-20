package learnJava.src.dersler.gun10;

import java.util.Scanner;

public class Mentoring {
    public static void main(String[] args) {
        // Kullanıcıdan ad ve soyadını ayrı ayrı alalım.
// Yanyana yazdıralım. concat() kullanalım.
        Scanner scan = new Scanner(System.in);
        String ad = scan.next();
        String soyad = scan.next();

        System.out.println("concated name = " + ad.concat(" ").concat(soyad));
        System.out.println("ad = " + ad);

        // Bir dosyanın adını ve uzantısını ayrı ayrı alın ve concat() metodunu kullanarak tam dosya adını oluşturun.
// Örneğin, "Ödev" dosya adını ve ".pdf" uzantısını birleştirerek tam dosya adı oluşturun.
        //Scanner scan = new Scanner(System.in);
        System.out.print("Dosya adını girin: ");
        String ad_dosya = scan.next();
        System.out.print("Uzantısını girin: ");
        String ad_uzanti = scan.next();
        String concated_name = ad_dosya.concat(String.valueOf('.')).concat(ad_uzanti);
        System.out.println("concated_name = " + concated_name);


        // Bir sosyal medya platformuna kullanıcı adı kaydediyorsunuz.
// Kullanıcı adlarının uzunluğunun en az 5, en fazla 15 karakter olması gerekiyor.
// Kullanıcıdan bir kullanıcı adı alın ve length() metodunu kullanarak bu kurallara uyup uymadığını kontrol edin.
// uuyorsa --> "Kullanıcı adı geçerli."
// uymuyorsa --> "Kullanıcı adı geçersiz. 5 ile 15 karakter arasında olmalıdır."

        // Soru: Bir mağaza, yeni bir ürünün adıyla seri numarasını birleştirerek stok etiketi oluşturmak istiyor.
// Kullanıcıdan ürün adı ve seri numarasını alarak bu iki değeri concat() ile birleştirin ve
// uzunluğunu length() ile kontrol edin. Eğer stok etiketi
// uzunluğu 25 karakterden fazla ise, "Stok etiketi çok uzun." mesajını gösterin.
// Ayrıca, ürün adı en az 5 karakter değilse, "Ürün adı çok kısa, geçerli bir ürün adı girin." mesajını verin.


        // Bir kullanıcıdan iki kelime girmesini isteyin.
// Bu kelimeleri concat metodu ile birleştirin ve birleştirilmiş kelimenin uzunluğunu length metodu ile hesaplayın.
// Sonuçları ekrana yazdırın.


//Task 06
        // Kullanıcıdan bir kelime girmesini isteyin. Girilen kelimenin uzunluğunu hesaplayın. Eğer kelimenin uzunluğu 5'ten büyükse,
// kelimenin ilk ve son harfini alarak yeni bir kelime oluşturun.
// Aksi takdirde, kelimenin uzunluğu tek sayi ise ortasındaki harfi yazdırın.
// çiftse kelimeyi yazdırın. Oluşturulan yeni kelimeyi ekrana yazdırın.
// Oluşturulan  kelimeyi ekrana yazdırın.

       //Task 07
// Kullanıcıdan bir kelime girmesini isteyin. Girilen kelimenin uzunluğunu hesaplayın. Eğer kelimenin uzunluğu 5'ten büyükse,
// kelimenin ilk ve son harfini alarak yeni bir kelime oluşturun.
// Aksi takdirde, kelimenin uzunluğu tek sayi ise ortasındaki harfi yazdırın.
// çiftse kelimeyi yazdırın.
// Oluşturulan  kelimeyi ekrana yazdırın.


        // Task 08
        ////  Bir alışveriş uygulaması simüle edin. Kullanıcıdan bir ürün adı ve bir indirim kodu girmesini isteyin.
        //        //  Eğer ürün adında indirim kodu geçiyorsa, yeni bir ürün adı oluşturun.
        //        //  Bu yeni ad, ürün adının son karakteri ile indirim kodunun ilk karakterinin birleştirilmesiyle oluşsun.
        //        //  Eğer indirim kodu ürün adında geçmiyorsa,
        //        //  başında urun adının harf sayısı kadar indirim kodunun son karakteri bulunan " .. indirim kodu bu üründe geçersizdir. "
        //        //     ( ipucu : repeat() methodu kullanmayı deneyiniz )
        //        //  mesajını ekrana yazdırınız .
        //        //  Sonuç olarak, hem yeni ürün adını hem de oluşturulan mesajı ekrana yazdırın.
    }
}
