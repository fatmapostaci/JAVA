package learnJava.src.dersler.gun3;

public class Task1_variabletypes
{


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
        /*
        System.out.println(a+isim+soyad+b);//
        System.out.println(a+b+isim+soyad);//
        System.out.println(a+b);//
        System.out.println(isim+soyad+(a+b));//
        System.out.println((a+b)+isim+soyad);//
        System.out.println(isim+(a-b)+(a+b));//
        System.out.println(isim+((a+b)+(a-b)));//
        System.out.println(""+a+b);//

        char ch='1';//1 ascii = 49
        System.out.println(isim+ch);//
        System.out.println(a+ch+isim);//
        System.out.println(isim+(ch+a));//
        System.out.println(a+isim+ch);//

         */

            //hap bilgi->char data type isleme alindiginda variable type'ina gore farkli cikti verir
            //yani char int ile ascii deger uzerinden toplama yapar, string ile concat(birlestirme)





        }//main sonu

}
