package learnJava.src.dersler.gun11;

import java.util.Scanner;

public class Mentoring {
    public static void main(String[] args) {
        //:dart: Task 01 --> Kısa Kod Üretme
        //// Soru: Bir uygulamada kullanıcı adı ve soyadı alınmaktadır.
        //// Kullanıcının adının ilk üç harfini ve soyadının ilk üç harfini birleştirerek bir kısa kod üretmek istiyoruz.
        //// substring() metodunu kullanarak kullanıcıdan alınan isim ve soyisimden kısa kodu oluşturun.
        //// Örneğin, kullanıcı "Ahmet" ve "Yılmaz" girdiyse "AhmYıl" şeklinde bir kısa kod üretin.
        Scanner scanf = new Scanner(System.in);
   /*     String ad = scanf.next();
        String soyad = scanf.next();
        String yenikelime = ad.substring(0,3).concat(soyad.substring(0,3));
        System.out.println("yenikelime = " + yenikelime);



*
// Task 02 --> Hatalı Cümle
// Elinizde bir cümle var, ancak bu cümlede bir hata var.
// Mesela "Merhaba Dünya" ifadesinde "Dünya" kelimesini "Evren" ile değiştirmek istiyorsunuz.
// Hatalı kısmı substring() ile bulun, concat() ile yeni kısmı ekleyin ve sonucu yazdırın.
        String cumle = "merhaba dunya, ancak bu cümlede bir hata var.";
        System.out.println(cumle);
        System.out.println("Cümlede güncellenmesi gereken kelimeyi girin: ");
        String silinecek_kelime = scanf.next();
        System.out.println("Cümlede eklenmesi gereken kelimeyi girin: ");
        String eklenecek_kelime = scanf.next();

        if( cumle.contains(silinecek_kelime)){
            String a = cumle.substring(0, cumle.indexOf(silinecek_kelime)-1).concat(" ").concat(eklenecek_kelime);
            String b = cumle.substring( (cumle.indexOf(silinecek_kelime))+(silinecek_kelime.length())  ,cumle.length()-1);
            System.out.println(a.concat(b));
*
//Task03 --> Soru Cümlesi Kontrolü
// Kullanıcıdan bir cümle alın. Eğer cümlenin son karakteri "?" ise "Bu bir soru cümlesidir." yazdırın.
// son karakteri subtring() ile bulalım.
        //Scanner scanf = new Scanner(System.in);
        System.out.println("Bir cümlenin soru cümlesi olması durumu kontrolü. Cümleyi girin: ");
        String cumle = scanf.nextLine();
        System.out.println("cumle.endsWith(\"?\") = " + ((cumle.endsWith("?")) ? "Soru cumlesidir" : " Soru cümlesi değildir"));
        System.out.println("cumle.charAt(cumle.length()-1) = " + ((cumle.charAt((cumle.length() - 1)) == '?') ? "Soru cumlesidir" : " Soru cümlesi değildir"));
        System.out.println("cumle.substring((cumle.length() - 1)) = " + (cumle.substring((cumle.length() - 1)).equals("?") ? " Soru cumlesidir" : " Soru cümlesi değildir"));
*/
// Senaryo 4 :
//  Kullanıcıdan iki kelime alın.
//  Eğer ilk kelimenin son karakteri ile ikinci kelimenin ilk karakteri aynıysa,
//  iki kelimeyi birbirine ekleyin. (harf aynı ise harfi 1 kez yazdırın)
//  Aksi halde ayrı ayrı yazdırın.

        //Scanner scanf = new Scanner(System.in);
        System.out.print("1. kelime girin: ");
        String ilk_kelime = scanf.next();
        System.out.print("İkinci kelimeyi girin: ");
        String ikinci_kelime = scanf.next();
        System.out.println(ikinci_kelime.substring(0,1));
        System.out.println( (ilk_kelime.endsWith(ikinci_kelime.substring(0,1))) ? ilk_kelime.concat(ikinci_kelime.substring(1)) : ilk_kelime.concat(" ").concat(ikinci_kelime));
    }


}






