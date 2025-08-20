package learnJava.src.dersler.gun13.LoopTasks;

public class Task34 {

    public static void main(String[] args) {

//        1 2 3 4 5 6
//         2 3 4 5 6
//          3 4 5 6
//           4 5 6
//            5 6
//             6

        int row = 6;
        for (int i = 1; i <= row; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= row; j++) {
                System.out.print(j +" ");
            }
            System.out.println();
        }

    }
}


