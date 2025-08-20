package learnJava.src.dersler.gun3;

public class C03_Concatenation {//class level

    /*
     Not: char variable'lari matematiksel islemlerde   ASCII degerleri kullanir.
          Ornegin; System.out.println('A' + 'C'); ekrana AC yerine 132 print eder.
     Note: Java'da "+" sembolunun
             i)Toplama islemi
             ii)Birlestirme Islemi(Concatenation)
           Java "+" sembolu  once toplama yapmaya calisir, yapamazsa birlestirme islemi yapılır aksi halde CTE verir.
  */

    public static void main(String[] args) {//main level
        String isim="Fatih Anil ";
        String soyad="Gulun";
        /*
        Birden çok string variable ile farklı data type variable'lar + ile işlem alınırsa
        java toplama değil birleştirme(Concatenation) yapar.
        Trick-> javada String güçlü bir Class'dır.Bir + işlemi için String varsa işlem önceleğine göre
        (mürekkep) concatenation(birleştirme) yapar.
         */
        System.out.println(isim+soyad);
        int a=17;
        int b=45;

        System.out.println(isim+soyad+a+b);// Fatih Anil Gulun1745
        System.out.println(a+isim+soyad+b);// 17Fatih Anil Gulun45
        System.out.println(a+b+isim+soyad);// 62Fatih Anil Gulun
        System.out.println(a+b);// 62
        System.out.println(isim+soyad+(a+b));// Fatih Anil Gulun62
        System.out.println((a+b)+isim+soyad);// 62Fatih Anil Gulun
        System.out.println(isim+(a-b)+(a+b));// Fatih Anil -2862
        System.out.println(isim+((a+b)+(a-b)));// Fatih Anil 34
        System.out.println(""+a+b);// 1745

        // Hap bilgi : herhangi bir sayısal değeri String e çevirmek için:
        double numDouble = 13.84;
        String stringSayi = ""+numDouble;

        System.out.println(stringSayi+stringSayi);
        System.out.println(numDouble + numDouble);
        System.out.println(stringSayi + numDouble);

        char ch='1';//1 ascii = 49
        System.out.println(isim+ch);// Fatih Anil 1
        System.out.println(a+ch+isim);// 66Fatih Anil
        System.out.println(isim+(ch+a));//
        System.out.println(a+isim+ch);//


        //hap bilgi->char data type isleme alindiginda variable type'ina gore farkli cikti verir
        //yani char int ile ascii deger uzerinden toplama yapar, string ile concat(birlestirme)


    }//main sonu


}//class sonu