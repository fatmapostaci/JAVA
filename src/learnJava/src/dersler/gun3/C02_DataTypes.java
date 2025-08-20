package learnJava.src.dersler.gun3;

public class C02_DataTypes {
/*
            Java'da  2 farkli data type tanımlanır.
            1)Primitive Data Type (8 tane)

              a)boolean: Sadece True veya False değerlerini alabilir. sadece iki farkli deger alabildigi icin memory'de az(bir bit'lik) alan kaplar
                        1
              b)char :Tek character'li (S, ?, 3, * gibi her bir sembol) ifadeler icin char data type'i kullanilir.
                      her bir char memory'de 16 bit'lik yer kaplar.char deger mutlaka tek tirnak icine konulmalıdilir.
                      char değerler aritmetik islemler için charlarin ASCII ("American Standard Code for Information Interchange") Table'daki degerlerini alır.
                        2^4
              c)byte : -128'den +127 ye kadar tum tam sayi degerlerini alır.
                      byte variable -> memory'de 8 bitlik alan kaplar.
                                    2^3
              d)short : -32768'den 32767'ye kadar tum tam sayi degerlerini alır.
                      short variable -> memory'de 16 bıt alan kaplar.
                        2^4
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
            i)Stack Memory: -> gömlek cebi
                a)Kucuk memory'dir
                b)Primitve ve Non-Primitive'lerin adreslerini(Reference) icerir
           ii)Heap Memory: -> cüzdan
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


        //hap bilgi-> bir varibleye deger atamasi yapilirken data type uygun deger atanmali
        // aksi takdirde CTE hatasi aliniz

        String isim = "Can Yücel";
        String unvan = "Team Lead";
        // String sene = 25; // CTE -> compile time error: -> uygun data tipi tanımlanmadı
        double maas = 40000;

        boolean isAcemi = false;
        // char a = "&"; // char tek tırnak içinde yazılır.
        char a = '&';
       // char b = ' %'; // bosluk ta bir karakterdir. 2 karakterden oluşamaz
        //char c = ''; // char karaktersiz olamaz.
        char d = ' '; // boşluk karakterdir.
        String str = "";

        // Task-> 1999 yılında doğan kisinin yasını print eden code create ediniz...
        int dt = 1999;
        int buYil = 2024;
        int yas = buYil - dt ;
        System.out.println("kişinin yasi = " + yas);

        //Task -> tamsayı ve ondalıklı sayı tanımlayıp toplam  print ediniz
        int sayi1 = 35;
        double sayi2 = 23.546;
        System.out.println("toplamları = "+(sayi1 +sayi2));
        System.out.println(sayi1 + sayi2 + " deniyoruz");

        char v = '4';
        char y ='c';
        String strY = "c";
        System.out.println(v);
        System.out.println(v + 2);

        System.out.println(y);
        System.out.println(y + 2);
        System.out.println(sayi1 + v);

        //Task -> iki farklı tamsayı türünde sayı  tanımlayıp toplam ve farkını print ediniz
        int num1 = 96;
        short num2 = 23;
        System.out.println("toplamları= " +(num1 + num2));
        System.out.println("farkları= " + (num1 - num2));

        //Task -> tamsayı ve char data type iki variable  tanımlayıp toplam  print ediniz

        int num3 = 32;
        char ch = '&';
        System.out.println("yeni toplam = " + (num3 + ch));

        // Task -> ad ve soyadınızı ve yasınızı print ediniz.
        String ad = "Süleyman";
        String soyisim = "Kirkil";
        byte age = 47;
        System.out.println("adınız : " + ad + "\nsoyadınız : " + soyisim + "\nyaşınız :" + age);






















    }

}
