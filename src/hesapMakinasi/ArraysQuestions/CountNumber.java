package hesapMakinasi.ArraysQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class CountNumber {

    // Kullanıcıdan bir sayı alın ve bu sayının array içinde kaç kez geçtiğini bulun. --> Tugba
        // System.out.println("Arrayde kullanicinin istedigi sayinin adedi ");
    // countNumber(arr);


    static int sayi;







    public static void countNumber(int [] arr){
    Scanner scan = new Scanner(System.in);

    System.out.println("Lütfen bir sayi girin");
    sayi= scan.nextInt();

    Arrays.sort(arr);
    int count =0;

    for (int i = 0; i < arr.length; i++) {

        if(arr[i]==sayi){
            count++;
        }

    }
    System.out.println("Array icinde arattiginiz "+ sayi+" sayisi arrayde "+count+" adet bulunuyor");


}


}
