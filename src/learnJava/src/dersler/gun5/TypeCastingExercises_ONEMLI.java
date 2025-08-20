package learnJava.src.dersler.gun5;


public class TypeCastingExercises_ONEMLI {

    public static void main(String[] args) {

        // 1. Tam sayıyı ondalıklı sayıya dönüştürme
        int a = 10;
        // a'yı float tipine dönüştür ve ekrana yazdır.
        float x = a;
        System.out.println("x = " + x);

        // 2. Ondalıklı sayıyı tam sayıya dönüştürme
        double b = 5.99;
        // b'yi int tipine dönüştür ve ekrana yazdır.
        int y = (int)b;  //hata aldı (int) ekledim
        System.out.println("y = " + y);

        // 3. Char'dan int'e dönüşüm
        char c = 'A';
        // c'yi int tipine dönüştür ve ekrana yazdır.
        int z = c;
        System.out.println("z = " + z);

        // 4. int'ten long'a genişletme dönüşümü
        int num = 100;
        // num'u long tipine dönüştür ve ekrana yazdır.
        long numL = num;
        System.out.println("numL = " + numL);

        // 5. int'ten byte'a daraltma dönüşümü
        System.out.println(" // 5. int'ten byte'a daraltma dönüşümü");
        int largeNum = 130;  // byte a dönüşürken 127 den sonrasında eksi değerlere döner
        // largeNum'u byte tipine dönüştür ve sonucu ekrana yazdır.
        byte largeNumByte = (byte) largeNum;
        System.out.println("largeNumByte = " + largeNumByte); //

        // 6. float'tan int'e dönüşüm
        System.out.println("// 6. float'tan int'e dönüşüm");
        float f = 8.75f;
        // f'yi int'e dönüştür ve sonucu ekrana yazdır.
        int fInt = (int) f;
        System.out.println("fInt = " + fInt);

        // 7. short'tan double'a genişletme dönüşümü
        System.out.println("// 7. short'tan double'a genişletme dönüşümü");
        short s = 3200;
        // s'yi double'a dönüştür ve ekrana yazdır.
        double sDouble = s;
        System.out.println("sDouble = " + sDouble);

        // 8. String'den int'e dönüşüm (parse)
        System.out.println("// 8. String'den int'e dönüşüm (parse)");
        String str = "123";
        // str'yi int'e çevir ve ekrana yazdır.
        int strInt = Integer.parseInt(str);
        System.out.println("strInt = " + strInt);
        int strInt2 =  Integer.valueOf(str);
        System.out.println("strInt2 = " + strInt2);
        int strInt3 = Integer.decode(str);
        System.out.println("strInt3 = " + strInt3);

        // 9. int'ten String'e dönüşüm
        System.out.println("// 9. int'ten String'e dönüşüm");
        int number = 456;
        // number'ı String'e çevir ve ekrana yazdır.
        String numberStr = String.valueOf(number);  //****** =number dediğimde kabul etmedi, ide valueOf methodu ile düzenledi
        System.out.println("numberStr = " + numberStr);
        String numberStr2 = Integer.toString(number);//****
        System.out.println("numberStr2 = " + numberStr2);

        // 10. boolean'dan String'e dönüşüm
        System.out.println("// 10. boolean'dan String'e dönüşüm");
        boolean isJavaFun = true;
        // isJavaFun'ı String'e dönüştür ve sonucu ekrana yazdır.
        String isJavaFunString = String.valueOf(isJavaFun); //ValueOf methodu ile güncelledi.
        System.out.println("isJavaFunString = " + isJavaFunString);
        String isJavaFunString2 = Boolean.toString(isJavaFun); //****
        System.out.println("isJavaFunString2 = " + isJavaFunString2);
    }
}
