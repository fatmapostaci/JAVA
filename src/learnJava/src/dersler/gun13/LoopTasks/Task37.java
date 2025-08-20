package learnJava.src.dersler.gun13.LoopTasks;

import java.util.Scanner;

public class Task37 {
    public static void main(String[] args) {

        /*
 Type code to ask user to enter the number of row
 and print the shape below according to that number:

  1
  2 3
  4 5 6
  7 8 9 10
  11 12 13 14 15
  16 17 18 19 20 21
  */
        Scanner sc = new Scanner(System.in);
        //ilk başta alltakini (sayıya göre) yapmıştım, sonra soru satıra göre istediği için bunu da düzenledim
        //satır sayısına göre birinci yol
        System.out.println("Kaç satır boyunca sayılar üçgen oluştursun istersiniz?");
        int satir = sc.nextInt();
        for (int i = 1, k = i; k <= satir; k++) {
            for (int j = k; j > 0; j--, i++)
                System.out.print(i + " ");
            System.out.println();
        }
        //girilecek en büyük değere göre ikinci bir yol
        System.out.println("Kaça kadar saymak istersiniz? (Print edilecek en büyük değeri girin)");
        int sayi = sc.nextInt();
        // (j) değişkeni satır(k) sayısına atanır ve 0 olana kadar azaltılır
        // (i) değişkeni de sayıları girilen değere kadar sayıyor.
        // (j) değişkeni sıfırlanınca (i) değişkeni alt satıra geçip yazmaya devam ediyor
        for (int i = 1, k = i; i < sayi; k++) {
            for (int j = k; j > 0; j--, i++)
                System.out.print(i + " ");
            System.out.println();
        }


    }
}












