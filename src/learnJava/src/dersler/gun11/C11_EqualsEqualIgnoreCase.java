package learnJava.src.dersler.gun11;

public class C11_EqualsEqualIgnoreCase {

    /* equals()
     * 2 String metnin birbirine esit olup olmadigina bakar. büyük küçük harf farkı vardır. Sonuc boolean dir.
     *
     *  equals() method’u verilen iki String’in içeriğinin birbirine eşit olup olmadığını kontrol eder.
     * == karşılaştırma operatörü ise verilen iki String objesinin değerinin yanında reference(adres)’lerine de bakar.
     * Aynı değere sahip olsa da farklı iki objeyi == ile karşılaştırdığımızda sonuç FALSE olur.

     * equalsIgnorecase()
     * equals() ile ayni islevi gorur, tek farki buyuk kucuk harfe duyarliligi yoktur. Sonuc boolean dir.
     */

    public static void main(String[] args) {
        String isim = "Mehmet Bey";
        String isim2 = "mehmet bey";
        String ad = "Mehmet";
        String unvan = "Bey";
        String isim3 = new String("Mehmet Bey");

        System.out.println("isim.equals(isim2) = " + isim.equals(isim2)); // false
        System.out.println(isim.equals(ad.concat(unvan))); // false
        System.out.println(isim.equals(ad.concat(" ").concat(unvan))); // true

        System.out.println("isim.equalsIgnoreCase(isim2) = " + isim.equalsIgnoreCase(isim2));
        System.out.println("isim.equals(isim3) = " + isim.equals(isim3)); // True
        System.out.println("isim == isim3 = " + (isim == isim3 ) );  // False

        String a = "akil";
        String b ="aenimlesin";
        Integer c =12;
        Integer d = 15;
        c.compareTo(d);

        System.out.println("a.compareTo(b) = " + a.compareTo(b));
    }
}
