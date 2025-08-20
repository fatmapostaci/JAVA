package learnJava.srcHoca.j25exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

import static j25exceptions.C03CheckedExeptions.readMyFile;

public class C02Exceptions {
    // Uygulamamız beklenmeyen bir durumla karşılaştığında çalışmayı durdurur ve Exception firlatır

    public static void main(String[] args)  {

        double result = 0;

        result = bolmeYap(); // InputMismatchException
        System.out.println(result);
       // System.out.println("result = " + result);
        System.out.println("Takip eden kodlar çalışmaya devam ediyor");



    }


    public static double bolmeYap(){
        double result =0;
        Scanner input = new Scanner(System.in);
        try { // Try block-> Block içindeki kodu çalıştırmaya çalışırız.
            System.out.println("try block çalışmaya başladı");
            System.out.println("İlk sayıyı giriniz");
            int a = input.nextInt();
            System.out.println("İkinci sayıyı giriniz");
            int b = input.nextInt();
            if (b == -1){
                throw new RuntimeException("sayı olarak -1 yazılır be kardeşim...");
            }
            result = a/b;
            System.out.println("Try block Exception lık bir durum ile karşılaşmadı");
        } // try blocktan sonra catch block veya finally block kullanmak zorundayız

        catch (ArithmeticException e) { // catch block exception yakalandığında çalışır.
            System.out.println("try block catch bloğu tetikledi");
            result = -1;
            System.out.println("Sıfır ile bölme işlemi yapılamaz !"+ e.getMessage());
            e.printStackTrace();  // Exception adını, açıklamasını ve hatanın göründüğü satırları
                                 // tüm kod çalıştıktan sonra en consolun en sonunda yayınlar.

        }
        catch (InputMismatchException e) { // catch block exception yakalandığında çalışır.
            System.out.println("try block catch bloğu tetikledi");
            System.out.println(" Lütfen sadece sayı giriniz!"+ e.getMessage());
            bolmeYap();
            e.printStackTrace();  // Exception adını, açıklamasını ve hatanın göründüğü satırları
            // tüm kod çalıştıktan sonra en consolun en sonunda yayınlar.

        }
        catch (Exception e) { // catch block exception yakalandığında çalışır.
            System.out.println("try block catch bloğu tetikledi");
            System.out.println("Tam olarak öngeremediğimiz bir Exception !"+ e.getMessage());
            e.printStackTrace();  // Exception adını, açıklamasını ve hatanın göründüğü satırları
            // tüm kod çalıştıktan sonra en consolun en sonunda yayınlar.

        }
                    /*
            1- try-catch kullanıldıgında try block hatasız çalışırsa catch block asla çalışmaz.catch block try block exception yakalarsa calışır
            2- try block catch veya finally block olmadan CTE verir. try block'tan sonra birden fazla catch block tanımlanabilir.
               aynı anda  sadece bir catch block çalışabilir hiç bir catch block çalışmaya da bilir
            3- parent - child ilişkisi olan catch'lerde child önce yazılmalı aksi halde CTE
             */
        finally {
            System.out.println("Bu block Exception yakalasak da yakalamasak da çalışır :) ");
            /*
            try - catch içinde yapılan işlemlerden sonra mutlaka çalışması gereken block varsa finally  blok tanımlanır.
            hata alınır ama finaly tanımlanırsa catch çalışmasa bile
            pr akışı devam eder.finally block hata olsa da olmasa da calışır.
            Cloud database ortamlarında bağlantı kesmek için kullanılır.cloud ile connection yazdıgınızda code
            başarılı bir şekilde çalışırsa işlem bitiiğinde finally block ile connection kapanmazsa maliyet pahalı olur :(
             */

        }

        return result;
    }

}
