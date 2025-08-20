package learnJava.src.dersler.gun12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Mentoring {
    public static void main(String[] args) throws ParseException {

        /*
       Task-> String strA="$13.99"  String strB="$17.55" parse method kullanarak strA+strB toplamını print den code create ediniz
       output: strA+strB=31.54
         */
        String strA="$13.99";
        String strB="$17.55";
        double double_strA = Double.parseDouble(  strA.replaceAll("[$]","") );
        double double_strB = Double.parseDouble(  strB.replaceAll("[$]","") );
        System.out.println("toplam = " + (double_strA + double_strB));

        // E-posta metninden tüm HTML etiketlerini kaldırın.
// Kullanıcıdan alınan bir e-posta içeriğini ekranda
// düzgün görünmesi için sadece yazı olarak göstermek istiyorsunuz.
// Örneğin, <p>Merhaba <b>Ali</b>, nasılsın?</p> metnini temizleyin.
// Merhaba Ali , nasılsın? çıktısına ulaşın.
        String metin4 = "<p>Merhaba <b>Ali</b>, nasılsın?</p> ";
        /* "<[^>]*>": Bu düzenli ifade, < ile başlayan ve > ile biten tüm metin parçalarını (HTML etiketlerini) seçer.
        <: Etiketin başlangıcını ifade eder.
        [^>]*: > hariç herhangi bir karakteri sıfır veya daha fazla kez seçer, böylece etiket içindeki tüm karakterleri kapsar.
>: Etiketin kapanışını ifade eder.*/metin4 = metin4.replaceAll("<[^>]*>","");
        System.out.println("metin4 = " + metin4);




        //Tarih biçimindeki yyyy-MM-dd formatındaki tarihleri, sadece yyyy kısmını koruyarak kısaltın.
//Senaryo: Kullanıcının girilen tam tarih bilgisinden yalnızca yıl bilgisi almak istiyorsunuz.
// Örneğin, "Bugün tarih 2023-10-18." ifadesini "Bugün tarih 2023." olarak düzenleyin.

        System.out.print("Doğum tarihini (yyyy-MM-dd) formatında girin: ");
        Scanner scanf = new Scanner(System.in);
        String tarih = scanf.next();
        String [] tarihArr = tarih.split("-");
        System.out.println("Bugünün tarihi = " + tarihArr[0]);

        String s = "Bugün tarih 2023-10-18.";
        s = s.replaceAll("(\\d{4})-\\d{2}-(\\d{2})", "$1-$2");
        System.out.println("s = " + s);

        //Bir cümledeki tüm sayıları # sembolüyle değiştirin.
// Senaryo: Bir metinde, gizlilik için telefon numarası veya yaş gibi bilgileri gizleyin.
// Örneğin, "Ali 25 yaşında ve telefon numarası 0555-123-4567." cümlesindeki tüm sayıları gizleyin.
        String cumle = "Ali 25 yaşında ve telefon numarası 0555-123-4567.";
        boolean flag=false;
        for(int i = 0 ; i < cumle.length() ; i++ )
        if(Character.isDigit(i)){
            flag=true;
        }
        if (flag==true){
            cumle = cumle.replaceAll("[0-9]","#");
        }else
            System.out.println("şifrelenecek bir alan bulunmuyor");
        System.out.println("cumle = " + cumle);

        //"The quick brown fox jumps over the lazy dog" ifadesindeki tüm "o" harflerini "0"
// ve "e" harflerini "3" ile değiştirip sonucu yazdıran bir kod yazınız.
        String metin3="The quick brown fox jumps over the lazy dog";
        metin3 = metin3.replaceAll("[o]","0");
        metin3 = metin3.replaceAll("e","3");
        System.out.println("metin3 = " + metin3);
        // Task03
        ////"abracadabra" ifadesindeki ilk abra kelimesini magic ile değiştirerek elde edilen sonucu yazdırınız.
        String metin2="abracadabra";
        metin2=metin2.replaceFirst("abra","magic");
        System.out.println("metin2 = " + metin2);

//"banana" kelimesindeki n harflerinin yerine m harfini koyarak yeni kelimeyi yazdıran bir kod yazınız.
String banana= "banana";
banana=banana.replaceAll("[n]","m");
        System.out.println("banana -> " + banana);
//        Task01
// "Welcome to the world of programming!" ifadesindeki "world" kelimesini "universe" ile değiştiren bir kod yazınız.
        String metin = "Welcome to the world of programming!";
        metin =metin.replace("world","universe");
        System.out.println("metin = " + metin);
          /* Task->
        Girilen ad soyad bilgilerinin ilk harflerini buyuk harf print eden code create ediniz..
              */
        Scanner scan = new Scanner(System.in);
        System.out.print("ad soyad girin: ");
        String ad_soyad = scan.nextLine().strip();
        String Ad_Soyad="";
        for (int i = 0; i < ad_soyad.split(" ").length; i++) {
            String temp = ad_soyad.split(" ")[i];
            temp = temp.substring(0,1).toUpperCase().concat(temp.substring(1).toLowerCase());
            System.out.println(temp+" ");
            Ad_Soyad = Ad_Soyad.concat(temp+" ");
        }
        System.out.println("Ad Soyad = " + Ad_Soyad);
    }
}
