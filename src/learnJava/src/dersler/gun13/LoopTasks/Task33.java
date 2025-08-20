package learnJava.src.dersler.gun13.LoopTasks;

import java.util.Scanner;

public class Task33 {
    /*
        Bir sayinin mükemmel olup olmadiğini bulan bir program yaziniz.
        Mükemmel sayi : bir sayinin kendisi hariç bölenlerinin toplamı, kendisine eşitse o sayi mükemmeldir.
        ORNEK:
        INPUT     : 6
        OUTPUT : 1,2,3
                      1+2+3 = 6 = 6 (Mükemmel)



        */
    public static void main(String[] args) {
    //üniversite sınavına girdiğim sene 2005 yılında bu soru çıkmıştı :)
        Scanner sc = new Scanner(System.in);
        int muk_sayi = sc.nextInt(), bolen=0;
        for (int i = 1; i < muk_sayi; i++) {
            if(muk_sayi%i==0)
                bolen += i;
        }
        System.out.println("bolenleri toplamı = " + bolen);
        if(muk_sayi==bolen) System.out.println(muk_sayi + " Mükemmel sayıdır");
        else System.out.println(muk_sayi + " Mükemmel sayı değildir");

    }


}
