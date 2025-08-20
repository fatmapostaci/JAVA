package learnJava.src.dersler.gun5;

public class C01_ComparisonOperators_ONEMLI {
    /*
 Comparator : Karsilastirma islemleri.
 Java'da iki variable'in degeri karlilastirildiginda Java sonuc olarak boolean(true-false) return eder

 ==	    Esit	            x == y
 !=	    Esit degil	        x != y
 >	    buyuk	            x > y
 <	    kucuk	            x < y
 >=	    buyuk esit        	x >= y
 <=	    kücük esit  	    x <= y
Unlem isareti (!) olumsuzluk anlaminda kullanilir.
  */

    public static void main(String[] args) {
        int semaYas = 27;
        int abdYas=30;

        System.out.println("semaYas esit mi abdYas = " + (semaYas == abdYas));//false
        System.out.println("semaYas esit degil mi abdYas = " + (semaYas != abdYas));//true
        System.out.println("semaYas buyuk mu abdYas = " + (semaYas > abdYas));//false
        System.out.println("semaYas kucuk mu abdYas = " + (semaYas < abdYas));//true

        /* s1 ve s2 String constant pool içerisinde aynı referans değere (reference) sahiptir.
    s1 == s2 , s1 ve s2 ‘nin hafızadaki adres değerlerini karşılaştırır ve
     String constant pool üzerinde aynı adresi gösterirler.
     Böylece ekrana TRUE yazdırır.
        */

        String s1="Enes Ay";
        String s2="Enes Ay";
        System.out.println(s1==s2);//true
        System.out.println(s1=="Enes Ay"); //true
        String s3=new String("Enes Ay");
        System.out.println(s1==s3);//false
        System.out.println("s1.equals(s2) = " + s1.equals(s2));
        System.out.println("s1.equals(s3) = " + s1.equals(s3)); // true


    }
}
