package learnJava.src.dersler.gun3;

import java.util.Scanner;

public class odev2 {
    public static void main(String[] args) {

        // ************************** Task 02 ***********************************
           /*
          TASK ->
          Kullanicidan boyunu cm olarak, kilosunu kilogram olarak alin
          ve vucut kutle endeksini bulun.
          Sonucu tamsayi ve ondalikli sayi olarak yazdirin
          VKE= kilo/(boy*boy) …….. Kilo : kilogram , Boy : metre olmalidir
          Ornek : Input : boy :180 kilo : 80
                  Output : Vucut kutle endeksiniz : 24
                           Vucut kutle endeksiniz : 24.691…
            */
        double boy;
        double kilo;
        double vucutKitleEndexi;
        Scanner scan = new Scanner(System.in);

        System.out.print("Boy: ");        boy = scan.nextDouble();

        System.out.print("Kilo: ");       kilo = scan.nextDouble();

        vucutKitleEndexi = kilo/(boy*boy );

        System.out.println("Vücut Kitle Endeksiniz = " + (int)(vucutKitleEndexi));
        System.out.println("Vücut Kitle Endeksiniz = " + vucutKitleEndexi);

    }
}
