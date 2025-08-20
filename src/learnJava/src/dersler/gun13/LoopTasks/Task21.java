package learnJava.src.dersler.gun13.LoopTasks;

public class Task21 {

    /*
             *
            * *
           * ! *
          * ! ! *
         * ! ! ! *
        * ! ! ! ! *
       * ! ! ! ! ! *
      * * * * * * * *
      şekli print eden code create ediniz.
     */

    public static void main(String[] args) {
        int height=10;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - 1 - i; j++) {
                System.out.print(" ");

            }
            for (int k = 0; k <= i; k++) {
                if (k == 0 || k == i || i == height-1)
                    System.out.print("* ");
                else
                    System.out.print("! ");
            }
            System.out.println();
        }


    }

}
































