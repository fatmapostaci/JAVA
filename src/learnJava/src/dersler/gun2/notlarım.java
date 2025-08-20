package learnJava.src.dersler.gun2;

public class notlarım {
    /*


    /*Variable
          bellekte (memory) ayrilmis olan alanin (reserved area) adidir.
          Variable icinde deger saklayan bir container'dir
          bir variable oluştururken içerisine koyacağimiz datanın değer alabileceği değerlere uygun bir data türü seçmeliyiz
         örneğin bir okulun öğrenci sayısı için variable data türü String,boolean,char veya double alınmamalı.
         geriye kalan tamsayı  turlerınden okulun öğrenci sayısını içine alabilecek büyüklükte bir data turu secilir
         *** genelde tam sayılar için int ondalıklı sayılar için double kullınılır..


    print() : yazdirma isleminden sonra komut ayni satirdan devam ettirir
    println() : yazdirma iseminden saonra komut alt satirdan devam eder
    java'da space(bosluk bir karakter olarak tanimlanir(derlenir)
        java run edildiginde calismaya ilk olarak main method'dan baslar
        daha sonra yukaridan asagi ve soldan saga dogru sirasiyla islem yapar


                   Java'da  2 farkli data type tanımlanır.
            1)Primitive Data Type (8 tane)

              a)boolean: Sadece True veya False değerlerini alabilir. sadece iki farkli deger alabildigi icin memory'de az(bir bit'lik) alan kaplar

              b)char :Tek character'li (S, ?, 3, * gibi her bir sembol) ifadeler icin char data type'i kullanilir.
                      her bir char memory'de 16 bit'lik yer kaplar.char deger mutlaka tek tirnak icine konulmalıdilir.
                      char değerler aritmetik islemler için charlarin ASCII ("American Standard Code for Information Interchange") Table'daki degerlerini alır.

              c)byte : -128'den +127 ye kadar tum tam sayi degerlerini alır.
                      byte variable -> memory'de 8 bitlik alan kaplar.

              d)short : -32768'den 32767'ye kadar tum tam sayi degerlerini alır.
                      short variable -> memory'de 16 bıt alan kaplar.

              e)int : -2,147,483,648'den 2,147,483,647'ye kadar tum tam sayi degerlerini alır.
                     int variable -> memory'de 32 bit alan kaplar.

              f)long : -9,223,372,036,854,755,808'den 9,223,372,036,854,755,807'ye kadar tum tam sayi degerlerini alır.
                      long variable -> memory'de 64 bit alan kaplar.

              g)float : ondalikli sayilar icin kullanilır.
                      float variable -> memory'de 32 bit kullanir.
                      float variable -> ondalik kisimlarinda en fazla 7 rakam barindirabilir.
                      0.1234567
                      Bir ondalikli sayinin float oldugunu belirlemek icin en sona(1.23f veya 1.23F) 'f' veya 'F' yazılmalıdır aksi halde variable double olarak tanımlanır.


              h)double : ondalikli sayilar icin kullanılır.
                      double variable -> memory'de 64 bit kullanir.
                    double variable -> ondalik kisimlarinda en fazla 16 rakam barindirabilirler.
                    0.1234567890123456

            2)Non-Primitive Data Type
                String: Cift tirnak arasina yazilan sifir veya daha fazla character'lerden olusan variable.
            */
            /*
        1)Java'da iki turlu "memory" vardır.
            i)Stack Memory: -> gömlek cebi           ÖNEMLİ
                a)Kucuk memory'dir
                b)Primitve ve Non-Primitive'lerin adreslerini(Reference) icerir
           ii)Heap Memory: -> cüzdan         ÖNEMLİ
                a)Buyuk Memory'dir
                b)Non-Primitive'leri icerir
        2)Java Heap Memory'ye yerlestirilen her non-primitve data icin bir address(Reference) olusturur ve bu adresi(Reference)
         Stack Memory'yde depolanır. Herhangi bir sebeple address(Reference) silinirse Java adresi(Reference) olmayan Heap deki
         non-primitive data yi otomatik siler.  Memory'nin temizligini saglayan "Garbage Collector" çalışır.
     */
        /*
        PRIMITIVE DATA TYPE - NON-PRIMITIVE  DATA TYPE  FARKLARI...
        1)primitive'de tum harfler kucuk; non-primitive'de ilk harf buyuk kullanılır.
        2)primitive data typelarini Java olusturmustur, biz primitive data typelarini olusturamayiz.
        ama non-primitive data type larini Java programcilari tarafindan istenildigi kadar olusturulabilir.
        3)primitive data typelarin memoryde kapladigi yer degisirken; non-primitivelerin memoryde kapladigi yer hep aynidir
        4)primitive data typelarinin memoryde ayirdigi alanda sadece o primitive datanin degeri vardir.
        non-primitive'lerde ise degeri ve methodlari vardir.
        5)primitive 'ler renklenirken mavi renklenirken ; non-primitiveler renklenmez.Or: String siyah kalir

     */

    public static void main(String[] args) {

    String name = "Jane";
    String nameFive = "5";
    int sayi   = 8;
    char ch = 's';   // s --> ASCII değeri 115

        System.out.println(name + nameFive);  // Jane5
        System.out.println( nameFive + sayi); // 58
        System.out.println(sayi + name);   // 8Jane
        System.out.println(sayi + sayi);  // 16
        System.out.println(ch + sayi);   // 115+8
        System.out.println(ch + nameFive);  // s5
        System.out.println(ch + ch); // ss  ?230     **********
        System.out.println(sayi + sayi + ch);  //  8+8+115
        System.out.println(ch + sayi + sayi);  //  115+8+8
        System.out.println((ch + sayi) + name);  //  115+8Jane
        System.out.println(name + (ch + sayi));  // Jane115+8
        System.out.println(name + ch + sayi);  //  Janes8
    }

}
