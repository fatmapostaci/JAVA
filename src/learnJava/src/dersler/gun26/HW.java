package learnJava.src.dersler.gun26;

import java.time.LocalTime;
import java.time.ZoneId;

public class HW {
    /*
    Task :
    Bir for döngüsü oluşturun.
    Döngüde, herhangi bir işlem yapabilirsiniz.
    Döngünün başlamasından hemen önce zamanı alın
    Döngü tamamlandıktan sonra tekrar zamanı alın.
    Döngünün çalışma süresini hesaplayarak kullanıcıya yazdırın.
*/
    public static void main(String[] args) {

        LocalTime start = LocalTime.now(ZoneId.systemDefault());
        System.out.println("başlangıç zamanı = " + start.toString());
        int nanoSecondsStartPoint = start.getNano();
        int secondsStartPoint = start.getSecond();

        for (int i = 1; i <= 30000; i++) {
            for (int j = 1; j <= 300000; j++) {
            }
        }
        LocalTime end = LocalTime.now(ZoneId.systemDefault());
        int nanoSecondsEndPoint = end.getNano();
        int secondsEndPoint = end.getSecond();

        int nanoSecondFarki = nanoSecondsEndPoint-nanoSecondsStartPoint;
        int secondsFarki = secondsEndPoint-secondsStartPoint;

        System.out.println("bitiş zamanı = " + end.toString());
        System.out.println("\nnano saniye farkı = " + nanoSecondFarki);
        System.out.println("saniye farkı = " + secondsFarki);

    }
}

