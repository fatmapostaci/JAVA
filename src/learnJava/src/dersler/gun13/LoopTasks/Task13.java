package learnJava.src.dersler.gun13.LoopTasks;

public class Task13 {

    public static void main(String[] args) {
         /*
        A
        B B
        C C C
        D D D D
        E E E E E
        F F F F F F
        şekli print eden code create ediniz..

        */

        for (int i = 'A'; i <='F' ; i++) {
            for (int j = 'A'; j <=i ; j++) {
                System.out.print((char)i+" ");
            }
            System.out.println();
        }


    }
}
