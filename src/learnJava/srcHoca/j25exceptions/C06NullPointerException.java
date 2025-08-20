package learnJava.srcHoca.j25exceptions;

public class C06NullPointerException {
    // NullPointerException -> null ataması yapılan bir değişken kullanıldığında oluşan RTE

    public static void main(String[] args) {
        String str1 = "";
        String str2 = null;
        //System.out.println("str2.length() = " + str2.length()); // NullPointerException

        System.out.println("strUzunlugunuBul(str1) = " + strUzunlugunuBul(str1));
        System.out.println("strUzunlugunuBul(str2) = " + strUzunlugunuBul(str2));



    }
    public static int strUzunlugunuBul(String str){
        int uzunluk = 0;
        try {
            System.out.println("Try block kodu deniyor ....");
            System.out.println("str2.length() = " + str.length());
            uzunluk = str.length();
            System.out.println("Try block sorun yaşamadı");
        } catch (Exception e){
            System.out.println("Try block exception bulup Catch bloğu çalıştırdı");
            System.out.println("Stringe henüz değer atanmadı ");
            uzunluk =0;
        }
        return uzunluk;
    }
}
