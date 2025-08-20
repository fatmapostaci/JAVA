package learnJava.srcHoca.j08_loops.L01forloop;

public class C03ForLoop {

    public static void main(String[] args) {
        // Loop larla sıklıkla kullanılan temel mantıklardan biri
        // "accumulator pattern" veya "accumulation" (biriktirme) olarak bilinir.
        // Bu yaklaşım, bir değişkenin döngü (loop) içinde sürekli
        // olarak güncellenmesini ifade eder.

      int sonDeger = 0;
      int sum =0;
      int faktoriyel = 1;
      String deger = "";

      for(int i = 1; i < 6 ; i++  ){
          sonDeger = i;
          System.out.println("loop içinde son deger = " + sonDeger);
      }
        System.out.println("sonDeger = " + sonDeger);

        // Toplam değer biriktirme:
        for(int i = 1; i < 6 ; i++  ){
            sum += i;
            // sum = sum + i;
            System.out.println("loop içinde sum = " + sum);
        }
        System.out.println("Toplam = " + sum);

        // Çarpma işlemini biriktirme:
        for(int i = 1; i < 6 ; i++  ){
            faktoriyel *= i;
            // faktoriyel = faktoriyel * i;
            System.out.println("loop içinde sum = " + faktoriyel);
        }
        System.out.println(" 5 sayısının faktoriyeli = " + faktoriyel);

        // String lerde biriktirme kullanımı:
        for(int i = 1; i < 6 ; i++  ){
            deger = deger + i ;
            System.out.println("loop içinde deger = " + deger);
        }
        System.out.println(" Stringin son degeri = " + deger);
 }
}
