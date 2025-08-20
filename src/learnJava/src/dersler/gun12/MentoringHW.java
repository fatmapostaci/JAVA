package learnJava.src.dersler.gun12;

import java.util.Scanner;

public class MentoringHW {
    public static void main(String[] args) {
//Task 11
////Kullanıcıdan bir cümle alın ve bu cümlede ilk geçen "b"
// harfinden sonra en son geçen "c" harfinin indeksini bulun.
        Scanner scan8 = new Scanner(System.in);
        System.out.print("Girdi: ");
        String cumle8 = scan8.next().strip();
        int ilk_b_indexi = cumle8.indexOf("b");
        int ikinci_b_indexi = cumle8.indexOf("b", ilk_b_indexi+1);
        if (ikinci_b_indexi == -1) {
            int index_c = cumle8.lastIndexOf("c");//b sadece 1 tane ise yada hiç yoksa
            System.out.println("index_c = if " + (index_c));
        }else
        {            //sadece ilk b den sonraki gelen c yi araması için ikinci b yi de bulmam gerekti, aralığa baktım
            int index_c = cumle8.indexOf("c", ilk_b_indexi + 1, ikinci_b_indexi);
            System.out.println("İlk  b harfinden sonraki son c harfinin indexi = " + index_c);
        }
//        Task 10
//Kullanıcıdan bir kelime alın ve cümlede ilk geçen "a" harfinden sonraki "b" harfinin pozisyonunu bulun.
        Scanner scan7 = new Scanner(System.in);
        System.out.print("kelime girin: ");
        String kelime7 = scan7.next().strip();
        int index_b = kelime7.indexOf('b', kelime7.indexOf("a"));
        System.out.println("index_b = " + index_b);


//        Task 09
// "Merhaba Dünya" ifadesinde "Mer" kelimesinin geçtiği pozisyonu bulun. Eğer kelime yoksa "-1" yazdırın.

        String dunya = " Merhaba Dunya";
        int indexMer = dunya.indexOf("Mer");
        if (indexMer == -1)
            System.out.println("-1   Bu cümle Mer kelimesi içermez");
        else System.out.println("Mer kelimesinin cümle içindeki konumu " + indexMer + " dir");

        //   Task 08
// Kullanıcıdan bir cümle alın ve cümlede "elma" kelimesinin geçtiği ilk konumu bulun.
        Scanner scan6 = new Scanner(System.in);
        System.out.print("cümle girin: ");
        String cumle6 = scan6.nextLine().strip();
        int index_elma = cumle6.indexOf("elma") + 1;
        if (index_elma == 0)
            System.out.println("Bu cümle elma kelimesi içermez");
        else System.out.println("Elma kelimesinin cümle içindeki konumu " + index_elma + " dir");

//        Task 07
// Kullanıcıdan bir cümle alın ve bu cümledeki son "e" harfinin konumunu bulun.
        Scanner scan5 = new Scanner(System.in);
        System.out.print("cümle girin: ");
        String cumle5 = scan5.nextLine().strip();
        int index_e = cumle5.lastIndexOf('e');
        if (index_e == -1)
            System.out.println("e harfi bu metinde yok");
        else
            System.out.println("bu cümledeki son e harfi" + index_e + ". sıradadır");


//        Task 06
//"Merhaba Dünya" ifadesinde "D" harfinin konumunu bulun.


        //Task 05
// Soru: Kullanıcıdan bir kelime alın ve "a" harfinin ilk geçtiği konumu bulun.
        Scanner scan4 = new Scanner(System.in);
        System.out.print("kelime girin: ");
        String kelime2 = scan4.nextLine().strip();
        int index_a = kelime2.indexOf('a');
        System.out.println((index_a == -1) ? "a harfi bu kelimede yok" :
                "a harfi bu kelimede var");


        // Task 04
//Kullanıcıdan bir cümle alın. Bu cümlenin sonundaki boşlukları temizleyin,
// ardından bu temizlenmiş cümledeki son kelimenin uzunluğunu bulun.
// Son kelimede, ilk geçen "a" harfinin indeksini ve son geçen "a" harfinin indeksini yazdırın.
// Eğer son kelimede "a" harfi yoksa, bulunmadığını belirtin.
// Son olarak, bu son kelimeyi cümleden alıp ekrana yazdırın.
          /*
          Girdi: "Java programlama dili öğreniyoruz "
          Çıktı:
          Son kelimenin uzunluğu: 10
          Son kelimede ilk 'a' harfi konumu: 3
          Son kelimede son 'a' harfi konumu: 3
          Son kelime: öğreniyoruz
          */
        Scanner scan3 = new Scanner(System.in);
        System.out.print("cümle girin: ");
        String cumle2 = scan3.nextLine().strip();
        int length = cumle2.length();
        String son_kelime = cumle2.substring(cumle2.lastIndexOf(' ') + 1);

        System.out.println(son_kelime + "  " + son_kelime.length() + " harfli bir kelimedir");

        if (!son_kelime.contains("a"))
            System.out.println("a harfi son kelimede yok");
        else {
            int a_son = son_kelime.lastIndexOf('a') + 1; //son kelimedeki son a nın konumu
            int a_ilk = son_kelime.indexOf('a') + 1; //son kelimedeki ilk a nın konumu
            System.out.println(son_kelime + "daki ilk a harfi " + a_ilk + ". sıradadır");
            System.out.println(son_kelime + "daki son a harfi " + a_son + ". sıradadır");
        }
        //Task 03
//Boş değilse ters çevir
// Bir kelimeyi tersten yazdırmak için kullanıcıdan bir 3 harfli bir kelime alın.
// Eğer kelime boşsa "Kelime boş" mesajı verilsin, değilse kelime 3 harfliyse tersine çevirilsin ;
// 3 ten fazla veya 3 ten az harfli ise "Kelime çok uzun veya çok kısa " yazdırılsın.
        Scanner scan = new Scanner(System.in);
        System.out.print("kelime girin: ");
        String kelime1 = scan.nextLine();
        String reverse;
        System.out.println(kelime1.isBlank() ? "Kelime boş" :
                (kelime1.length() > 3 ? "kelime çok uzun" :
                        (kelime1.length() < 3 ? "kelime çok kısa" :
                                "" + kelime1.substring(2, 3) + kelime1.substring(1, 2) + kelime1.substring(0, 1)
                        )));


        // Task 02
// ekrandan isim ve soy ismi tek boşluk ile okutunuz,
// ve büyük harf kısaltma olarak yazınız
// input "kahraman can"
// output "K.C."
        Scanner scan2 = new Scanner(System.in);
        System.out.print("isim ve soy ismi tek boşluk ile girin: ");
        String isim_soyisim = scan2.nextLine().toUpperCase();
        //stringin ilk karakterini substring ile aldım, "." ile concat ettim. sonra soyisim için boşluk karakterini bulup 1 fazlasının indexini aldım ve concat ile ilk harfe ekledim. en son da "." concat ettim
        String paraf = isim_soyisim.substring(0, 1).concat(".").concat(isim_soyisim.charAt(isim_soyisim.indexOf(" ") + 1) + "").concat(".");
        System.out.println(paraf);


 /*Task 01
        Kullanıcıdan bir cümle ve bir kelime girmesini isteyin.
        Girilen cümlenin, girilen kelimeyle başlayıp başlamadığını kontrol edin.
        Eğer cümle kelime ile başlıyorsa, cümlenin ilk karakteri ile kelimeyi birleştirerek yeni bir ifade oluşturun.
        Eğer cümle kelime ile başlamıyorsa, cümlenin uzunluğu kadar "!" karakteri ile bir mesaj oluşturun.
              ( ipucu : repeat() methodu kullanmayı deneyiniz )

        Sonuç olarak, hem yeni ifadeyi hem de oluşturulan mesajı ekrana yazdırın.
        */
        Scanner scanf = new Scanner(System.in);
        System.out.print("Cümle girin: ");
        String cumle = scanf.nextLine();
        Scanner scanf2 = new Scanner(System.in);
        System.out.print("Kelime girin: ");
        String kelime = scanf2.next();
        System.out.println(cumle.startsWith(kelime) ? cumle.substring(0, 1).concat(kelime) : "!".repeat(cumle.length()));

    }
}
