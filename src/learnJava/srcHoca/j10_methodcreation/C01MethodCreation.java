package learnJava.srcHoca.j10_methodcreation;

public class C01MethodCreation { // Class Başlangıcı
    /*
       code okunabilirliği ve sadeliği için sürekli kullanılan aksiyonlar için method create edip
       main method'a call edip run etmek uygulamanın test edilmesi maintanance ve reusable açısından tercih edilir.

       1) Java method'larin sadece name  değil  name + parametre'lere göre run eder
       parametre sayisi, parametre'lerin data tiplerin ve parametrelerin sırası methodu belirler.

       str.endsWith("el");   Bu method'un gorevi gidip kelimenin son kismini kontrol etmek
                             bu method'u kullanmak icin bu method'un kontrol ettikten sonra
                             bana rapor olarak ne getirdigini bilmem lazim (true/false)

       2) Bir method create edildiğinde  method'un aksiyonuna ve aksiyon çıktısı da method içinde create edilir

       3) Bir method olusturulurken  " str.indexOf(String str, int fromIndex) "
          de oldugu gibi
          disaridan kabul edecegi parametreleri ve bu parametrelerin data tiplerini
          deklare edilmeli

          method call edildiğinde  Parametre olarak
          declare edilen data tiplerine uygun value'ler (ARGUMENT)  girilmeli.
   */

    public static void main(String[] args) { // Main başlangıcı
        System.out.println("hello");
        selamla();
        System.out.println("bitsin");
        String str = "";
        str.length();
        int num1 = 10;
        int num2 = 5;
        int total = topla(); // Eğer return tipi olan bir metog kullanışıyorsa genellikle bir değişkene atama yapılır
        System.out.println("total = " + total);

       System.out.println("topla2() = " + topla2()); // Return tipi olan Method çağrılarını istersek konsola yazdırabiliriz

        System.out.println("topla3(num1,num2) = " + topla3(num1, num2));

    } // Main sonu

//psiz return type olmayan->void method create ediniz

    public static void selamla(){
        System.out.println("Ağaya selam :) ....");
    }

//psiz return type int olan method create ediniz
    public static int topla(){
    int num1 = 15;
    int num2 = 5;
    int sum = num1+ num2;
        return sum;
    }
//psiz return type String olan method create ediniz

    public static String topla2(){
        int num1 = 15;
        int num2 = 5;
        String sonuc = "Sayıların toplamı " + (num2 + num1);
        return sonuc;
        // return "Sayıların toplamı " + (num2 + num1);
    }

//pli return type int meth olusturuldu

    /**
     *
     * @param a
     * ilk sayıyı integer olarak alırız
     * @param b
     * @return İki sayının toplamını döndürür
     */
    public static int topla3(int a, int b){
        return a+b;
        // int total = a+b;
        // return total;
    }

} // Class Bitişi
