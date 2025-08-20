package learnJava.srcHoca.j08_loops.L01forloop.Tasks;

import java.util.Scanner;

public class Dummy {

    public static void main(String[] args) {
        int satır = 5;


        for (int i = 1; i <= satır; i++) {

            int number = i;

            for (int j = 0; j < i; j++) {
                System.out.print(number + " ");
                number += satır - j - 1;
            }

            System.out.println();


        }
    }
}
