package learnJava.srcHoca.j08_loops.L01forloop.Tasks;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        /* task ->
        girilen bir ifadenin istenen harf sayısını print eden code create ediniz

        input : selam javaCAN'lar
        output : a sayısı :4
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Metni giriniz....");
        String txt = input.nextLine();
        System.out.println("harfi giriniz...");
        char harf = input.next().charAt(0);
        int counter = 0;

        for (int i = 0; i< txt.length()-1; i++){

            if (harf == txt.charAt(i)){
                counter+=1;
            }
        }
        System.out.println("counter = " + counter);

    }
}
