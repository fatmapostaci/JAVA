package learnJava.src.dersler.gun13.LoopTasks;

public class Task31 {

    public static void main(String[] args) {
        /*
            1
            1  2
            1  2  3
            1  2  3  4.

         */
        int row=4;
        int num=1;
        for (int i = 0; i <= row; i++) {
            int temp=num;
            for (int j = 0; j < i; j++) {
                System.out.print(temp+j+" ");

            }
            System.out.println();
        }


    }
}
