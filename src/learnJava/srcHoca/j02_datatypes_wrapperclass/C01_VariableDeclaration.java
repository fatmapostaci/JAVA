package learnJava.srcHoca.j02_datatypes_wrapperclass;

public class C01_VariableDeclaration {

    /*Variable
          bellekte (memory) ayrilmis olan alanin (reserved area) adidir.
          Variable icinde deger saklayan bir container'dir
          bir variable oluştururken içerisine koyacağimiz datanın değer alabileceği değerlere uygun bir data türü seçmeliyiz
         örneğin bir okulun öğrenci sayısı için variable data türü String,boolean,char veya double alınmamalı.
         geriye kalan tamsayı  turlerınden okulun öğrenci sayısını içine alabilecek büyüklükte bir data turu secilir
         *** genelde tam sayılar için int ondalıklı sayılar için double kullınılır..
         */
    public static void main(String[] args) {

        // Değişken tanımlamak içim :
        // 1. yol: tanımlama ve atama farklı adımlarda
        // 1.Data type yazılır               isim verilir
        int                             age;     // Değer tanımlaması yapıldı (declaration)

        // Değer atamak için :
        age = 18;

        // 2. Yol -> tavsiye edilen
        int yas = 35;
        int maas = 40000;

        System.out.println(yas); // 35
        System.out.println("yas"); // yas

        System.out.println("Öğrenci yası = " + yas);
        System.out.println("Veli Beyin maası = " + maas);

        //3. Yol -> Birden fazla aynı data türünde değişken oluştururken
        int yil, boy, kilo;
        yil = 1997;
        boy = 175;
        kilo = 78;

        System.out.println("kilonuz: " + kilo +
                " \nboyunuz :" + boy +
                " \ndogum yılınız: " + yil);

        // 4.Yol :
        int yaS = 38,
                yevmiye = 200,
                aylik = 15; // oldukça iyi bir yöntem

        int yaS1 = 38;
        int yevmiye1 = 200;
        int aylik1 = 15;
        // CTRL + ALT + L veya command + option + L codeları otomatik düzenler.
        //hataa->oncesinden tanimlanmis bir variable tekrar tanimlanamaz ->CTE
        // int yas; // Variable 'yas' is already defined in the scope (zaten tanımlanmış tekrarlayamazsın !)

    }

}
