package learnJava.srcHoca.j25exceptions;

public class C01Exceptions {
    // Uygulamamız beklenmeyen bir durumla karşılaştığında çalışmayı durdurur ve Exception firlatır

    public static void main(String[] args)  {
        int a = 12;
        int b = 0;
        double result = 0;
        result = bolmeYap(a,b);
        System.out.println(result);
       // System.out.println("result = " + result);
        System.out.println("Takip eden kodlar çalışmaya devam ediyor");

    }



    public static double bolmeYap(int a, int b){
        double result =0;
        try { // Try block-> Block içindeki kodu çalıştırmaya çalışırız.
            System.out.println("try block çalışmaya başladı");
            result = a/b;
            System.out.println("Try block Exception lık bir durum ile karşılaşmadı");
        } // try blocktan sonra catch block veya finally block kullanmak zorundayız
        catch (ArithmeticException e) { // catch block exception yakalandığında çalışır.
            System.out.println("try block catch bloğu tetikledi");
            System.out.println("Sıfır ile bölme işlemi yapılamaz !"+ e.getMessage());
            e.printStackTrace();  // Exception adını, açıklamasını ve hatanın göründüğü satırları
                                 // tüm kod çalıştıktan sonra en consolun en sonunda yayınlar.

        }
        return result;
    }

}
