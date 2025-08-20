package learnJava.src.codeChallenge.ALLSUBJECTS;

import java.util.Scanner;

public class Donguler {
    /*
    Mini Proje Ödevi
Bir sayı tahmin oyunu yapın:

Program rastgele bir sayı (1-50 arasında) tutar.
Kullanıcı bu sayıyı tahmin etmeye çalışır.
Doğru tahmin edilene kadar program kullanıcıya ipuçları verir ("Daha büyük bir sayı girin" veya "Daha küçük bir sayı girin").
Doğru tahmin edildiğinde kullanıcıyı tebrik eder ve tahmin sayısını ekrana yazdırır.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Guess the romdon number: ");
        int guess = sc.nextInt();
        guessTheNumber(guess);
    }
    static void guessTheNumber(int guess){
        double random =getRandom(1,50);
        while (true){
            if (guess == random){
                System.out.println("Congratulations. Number is "+ random);
                break;
            }
            else if (guess<random){
                System.out.println("Try a bigger number");
                continue;
            } else if (guess > random) {
                System.out.println("Try a smaller number");
                continue;
            }

        }
    }
    static int  getRandom(int min,int max){
        return (int) (Math.random()*(max-min)+min);
    }

}
