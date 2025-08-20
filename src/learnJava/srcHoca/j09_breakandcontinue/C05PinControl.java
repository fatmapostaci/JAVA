package learnJava.srcHoca.j09_breakandcontinue;

import java.util.Objects;
import java.util.Scanner;

public class C05PinControl {
    // Task -> Girilen String data type bir pin datasının 3 giriş hakkında kontrol eden code create ediniz.

    public static void main(String[] args) {
        String pin = "JavvaCan";
        Scanner scn = new Scanner(System.in);
        boolean isPinCorrect = false;
        int trial = 3;

        while (!isPinCorrect){
            System.out.println("Lütfen pin numaranızı giriniz");
            String text = scn.next();
            if (text.equals(pin)){
                System.out.println("Pin doğru giriş yapabilirsiniz...");
                isPinCorrect = true;
            } else {
                System.out.println("Yanlış pin girdiniz");
                trial--;
                if (trial ==0){
                    System.out.println("Deneme hakkınız bitti, cihazınız bloke edildi");
                    break;
                } else {
                    System.out.println(trial + " adet deneme hakkınız kaldı");
                }
            }
        }
 }
}
