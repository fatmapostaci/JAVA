package learnJava.srcHoca.j99_codechallenge.codechallenge04;

public class Task01 {
    //Interview Question
    // Task->0-255 e kadar olan sayıların karakter değerini print eden code create ediniz...

    public static void main(String[] args) {

        // for loop ile
        System.out.println("   ***** For Loop ******   ");
        char a;
        for (int i = 0; i < 255; i++) {
            a = (char) i;
            System.out.println(i +" sayısının karakter karşılığı = " + a);
        }
        System.out.println();

        // while loop ile
        System.out.println("   ***** While Loop ******   ");
        int j = 0;
        while (j < 255){
            char b = (char) j;
            System.out.println(j +" sayısının karakter karşılığı = " + b);
            j++;
        }
        System.out.println();

        // do-while loop ile
        System.out.println("   ***** Do-While Loop ******   ");
       int k =0;

        do {
            char c = (char) k;
            System.out.println(k +" sayısının karakter karşılığı = " + c);
            k ++;
        } while (k < 255);

    }
}
