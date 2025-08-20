package learnJava.src.codeChallenge.gun1;

public class WrapperClass {
    public static void main(String[] args) {

        //videoda 1.33 ten devam edeceğim
        // 1. Temel Wrapper Class Kullanımı
        int x = 5;
        // x'i Integer class'ı ile sarmalayın ve ekrana yazdırın.
        Integer wrapped_x = Integer.valueOf(x);
        Integer wrapped_x2 = x;

        // 2. Autoboxing ve Unboxing
        Integer y = 10;
        // y'yi int'e unbox edip bir int değişkene atayın ve ekrana yazdırın.
        int unboxed_y = y.intValue();
        int unboxed_y2 = y;

        // 3. String'den Wrapper Class'a Dönüştürme
        String str = "123";
        // str'yi Integer kullanarak int'e dönüştür ve ekrana yazdır.
        Integer wrapped_str = Integer.valueOf(str);
        int wrapped_str2 = Integer.parseInt(str);

        // 4. Wrapper Class Metodları
        Integer z = 20;
        // intValue() metodunu kullanarak z'yi int'e dönüştür ve ekrana yazdır.
        int intValue_z = z.intValue();

        // 5. Karşılaştırma
        Integer a = 25;
        Integer b = 30;
        // Integer.compare() metodunu kullanarak a ve b'yi karşılaştırın.
        int compare_Int = Integer.compare(a,b);

        // 6. Null Değerle Çalışma
        Integer nullValue = null;
        // nullValue'yi int'e unbox etmeye çalışın ve ne olacağını görün.

        // 7. Double Wrapper Class Kullanımı
        double d = 12.34;
        // d'yi Double class'ı ile sarmalayın ve doubleValue() kullanarak ekrana yazdırın.

        // 8. Boolean Wrapper Class
        String boolStr = "true";
        // boolStr'yi Boolean.parseBoolean() kullanarak boolean'a dönüştürün.

        // 9. Maximum ve Minimum Değerleri Kullanma
        // Integer.MAX_VALUE ve Integer.MIN_VALUE'yu ekrana yazdırın.

        // 10. Char Wrapper Class
        char ch = '9';
        // Character.isDigit() metodunu kullanarak ch'nin rakam olup olmadığını kontrol edin.
    }
}
