package learnJava.src.dersler.gun13.LoopTasks;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        /* task ->
        girilen bir ifadenin istenen harf sayısını print eden code create ediniz

        input : selam javaCAN'lar
        output : a sayısı :4
         */
        int counter = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir metin giriniz");
        String metin = scanner.nextLine();
        char c = scanner.next().charAt(0);
        for (int i = 0; i < metin.length(); i++) {
            if (Character.compare(c, metin.charAt(i)) == 0)
                counter++;
        }
        System.out.println("counter = " + counter);



    }
}
