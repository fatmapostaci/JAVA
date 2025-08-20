package learnJava.src.dersler.gun17;

import java.util.Scanner;

public class Mentoring {
    public static void main(String[] args) {
//        Task 02 ) 1’den 10’a kadar olan sayılarda yalnızca çift sayıları ekrana yazdıralım

        Scanner sc = new Scanner(System.in);
        int sayi;
        while (true){
            System.out.print("sayı girin: ");
            sayi = sc.nextInt();

            boolean cift_1_10_arasinda = sayi%2==0 && (sayi>1&&sayi<10);
            if(cift_1_10_arasinda)
                break;
            else
                continue;
            }


    //       Task 01 ) bir sayıyı 1 ile 10 arasında bir sayı olana kadar kullanıcıdan isteyecektir.
        //       Kullanıcı uygun aralığı girerse döngü sonlanacak, aksi halde döngü devam edecektir.
/*
        do {
            sayi = sc.nextInt();
            System.out.println(sayi);
        }while(!(sayi>1 && sayi<10));

        do {
            sayi = sc.nextInt();
            if((sayi>1 && sayi<10))
                break;
            System.out.println(sayi);
        }while(true);
*/
    }
}

