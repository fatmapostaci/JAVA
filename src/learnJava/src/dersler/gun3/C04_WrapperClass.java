package learnJava.src.dersler.gun3;

public class C04_WrapperClass {
    /*
               Note: Java primitive lere method'lar ekleyerek yeni bir
                     yapi olusturdu, bu yapiya "Wrapper Class"
                     Primitive         Wrapper
                        byte     ==>    Byte
                        short    ==>    Short
                        ** int   ==>    Integer
                        long     ==>    Long
                        float    ==>    Float
                        double   ==>    Double
                        boolean  ==>    Boolean
                        ** char  ==>    Character
            */

    public static void main(String[] args) {
        short num1 = 21; // primitive data oluşturuldu
        Short num2 = 21; // Wrapper class ta data oluştu

        //int a = null; primitive data null değeri almaz
        Integer b = null; // Wrapper class null değeri alır,
        int a = 45;

        String name = "Seniye";
        System.out.println("name.getClass() = " + name.getClass()); // getClass() mtd u data nın data türünü döndürdü
        System.out.println("name.toUpperCase() = " + name.toUpperCase());
        System.out.println("num2.getClass() = " + num2.getClass());
        //System.out.println("num1.getClass() = " + num1.getClass()); // CTE verdi -> primitivelerde hafızada sadece değer kaydedilir mthdlar yok

                /*
        Non-primitive data turleri data depolamak yaninda kullanışlı
        birçok method'a sahiptir ancak primitive data turlerinin boyle
        bir ozelligi yoktur primitive data turleri sadece degerleri
        saklarlar (container) ve herhangi bir özellik(method) vs bulundurmaz.
        Ancak primitive data turleri icin de bazi işlemler için (String'den tamsayı çekme)
        method'lar ihtiyaç olduğunda Java her bir primitive data turunu, non-primitive
        Wrapper Class  oluşturarak ilgili methodlarla ara çözüm imkanı sunmuştur.
         */

        int num3 = 35;
        // Herhangi bir datayı çevirmek için çevirmek istediğiniz wrapper classın ismi kullanılarak methodlardan yararlanılır
        String num3Str = String.valueOf(num3);  // int -> Str çevirdik.
        System.out.println("num3Str = " + num3Str);

        Double num3Double = Double.valueOf(num3); // int -> double a çevirdik

        String price ="2000";
        Integer priceInt = Integer.valueOf(price);
        int priceInt2 = Integer.valueOf(price);
        int prc = Integer.parseInt(price);


        // task-> id ve tc String değerlerini toplamını print code create ediniz..

        String id ="12345";
        String tcno ="12345555";

       // System.out.println(id + tcno);  // 1234512345555 -> concatenation yaptı ...
        int idInt = Integer.parseInt(id);
        Integer idWInt = Integer.valueOf(id);

        int tcnoInt = Integer.parseInt(tcno);
        System.out.println( "Toplamları = " + (idInt + tcnoInt));

        String okulNo = "a3435"; // RTE veririr -> "NumberFormatException" çeviremiyorum diye not düşer.
        Integer okulyeni = Integer.valueOf(okulNo);
        System.out.println("okulyeni = " + okulyeni);


    }
}
