package learnJava.src.dersler.gun13.LoopTasks;

public class Task32 {
    public static void main(String[] args) {
        /*

        *
        * *
        * * *
        * * * *
        * * *
        * *
        *
        şeklipriint eden code create ediniz

         */

       // ipucu : artis ve azalis kisimlarini 2 ayri nested loop ile yapmalisiniz
        int row=4;
        for (int i = 1; i <= row; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < row-1; i++) {
            for (int j = 0; j <row-1-i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
