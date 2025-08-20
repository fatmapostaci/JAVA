package learnJava.src.dersler.gun3;

public class Task2_imprimitive
{

//public class C04_WrapperClass {
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
        /*
        Non-primitive data turleri data depolamak yaninda kullanışlı
        birçok method'a sahiptir ancak primitive data turlerinin boyle
        bir ozelligi yoktur primitive data turleri sadece degerleri
        saklarlar (container) ve herhangi bir özellik(method) vs bulundurmaz.
        Ancak primitive data turleri icin de bazi işlemler için (String'den tamsayı çekme)
        method'lar ihtiyaç olduğunda Java her bir primitive data turunu, non-primitive
        Wrapper Class  oluşturarak ilgili methodlarla ara çözüm imkanı sunmuştur.
         */
    public static void main(String[] args) {
        short num1 = 21; // primitive data oluşturuldu
        Short num2 = 21; // Wrapper class ta data oluştu

        //int a = null; primitive data null değeri almaz
        Integer b = null; // Wrapper class null değeri alır,
        int a = 45;

        String name = "Fatma";
        System.out.println("class of the Name: " + name.getClass() );
        System.out.println("name.getClass() = " + name.getClass()); // getClass() mtd u data nın data türünü döndürdü
        // name.getClass().soutv yazınca üstteki kalıp içinde output ekrarnını yazıyor
        System.out.println("name.toUpperCase() = " + name.toUpperCase());
        System.out.println("num2.getClass() = " + num2.getClass());

        System.out.println("name.toUpperCase() = " + name.toUpperCase());
        System.out.println("b.getClass() = " + b.getClass());
        //System.out.println("num1.getClass() = " + num1.getClass()); // CTE verdi -> primitivelerde hafızada sadece değer kaydedilir mthdlar yok


        int num3 = 35;
        Integer price = Integer.valueOf(num3);
        String priceString = String.valueOf(num3);

        String id = "1234";
        String tcno = "344574";

        int idint = Integer.valueOf(id);
        Integer tcnoInt = Integer.valueOf(tcno);

        System.out.println("Toplamları: " + (idint+tcnoInt));

        String okulNo = "234a";


    }
    }

