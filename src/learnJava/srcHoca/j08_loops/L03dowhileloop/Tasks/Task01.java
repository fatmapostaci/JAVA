package learnJava.srcHoca.j08_loops.L03dowhileloop.Tasks;

import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {
          /*
  Task-> Girilen sayıyı 0 olmadıgı sürece girilen sayıların toplamını print eden code create ediniz.
   */

        Scanner scan =new Scanner(System.in);
        int sum=0;
        int num=0;

        do {
            System.out.println(" Lütfen bir sayi giriniz : ");
            num =scan.nextInt();
            if (num != 0){
                sum+=num;
            }

        } while (num !=0);


        System.out.println("Girilen sayilarin toplami : " + sum );
    }

    }

