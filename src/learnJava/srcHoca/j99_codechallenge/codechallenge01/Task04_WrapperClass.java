package learnJava.srcHoca.j99_codechallenge.codechallenge01;

public class Task04_WrapperClass {
    public static void main(String[] args) {


        // 1. Temel Wrapper Class Kullanımı
        int x = 5;
        // x'i Integer class'ı ile sarmalayın ve ekrana yazdırın.
        Integer wrappedx = Integer.valueOf(x);
        System.out.println(wrappedx);


        // 2. Autoboxing ve Unboxing
        Integer y = 10;
        // y'yi int'e unbox edip bir int değişkene atayın ve ekrana yazdırın.
        int unboxedy = y.intValue();
        System.out.println("unboxedy = " + unboxedy);

        // 3. String’den Wrapper Class’a Dönüştürme
        String str = "123";
        // str'yi Integer kullanarak int'e dönüştür ve ekrana yazdır.
        // int yeni = Integer.valueOf(str);
        int donusenStr =Integer.parseInt(str);
        System.out.println("donusenStr = " + donusenStr);

        // 4. Wrapper Class Metodları
        Integer z = 20;

        // intValue() metodunu kullanarak z'yi int'e dönüştür ve ekrana yazdır.
        //int unboxedZ =Integer.valueOf(z);
        int unboxedZ = z.intValue();

        // 5. Karşılaştırma
        Integer a = 25;
        Integer b = 30;
        // Integer.compare() metodunu kullanarak a ve b'yi karşılaştırın.
        System.out.println("Integer.compare(a,b) = " + Integer.compare(a, b)); //
        // 1-> ilk sayı büyükse, 0 -> eşit iseler , -1 -> ikinci sayı büyük ise

        // 6. Null Değerle Çalışma
        Integer nullValue = null;
        // nullValue'yi int'e unbox etmeye çalışın ve ne olacağını görün.
        //System.out.println("nullValue.intValue() = " + nullValue.intValue()); // Null pointer exception

        // 7. Double Wrapper Class Kullanımı
        double d = 12.34;
        // d'yi Double class'ı ile sarmalayın ve doubleValue() kullanarak ekrana yazdırın.
        //Double boxedD = Double.valueOf(d);
        Double boxedD =d;
        System.out.println("boxedD.doubleValue() = " + boxedD.doubleValue());


        // 8. Boolean Wrapper Class
        String boolStr = "true";
        // boolStr'yi Boolean.parseBoolean() kullanarak boolean'a dönüştürün.
        boolean strToBool = Boolean.parseBoolean(boolStr);
        System.out.println("strToBool = " + strToBool);

        // 9. Maximum ve Minimum Değerleri Kullanma
        // Integer.MAX_VALUE ve Integer.MIN_VALUE'yu ekrana yazdırın.

        // 10. Char Wrapper Class
        char ch = '6';
        // Character.isDigit() metodunu kullanarak ch'nin rakam olup olmadığını kontrol edin.
        System.out.println("Character.isDigit(ch) = " + Character.isDigit(ch));
        System.out.println("Character.isAlphabetic(ch) = " + Character.isAlphabetic(ch));

    }
}