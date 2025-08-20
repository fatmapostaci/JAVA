package learnJava.src.dersler.gun13.LoopTasks;

public class Task20 {

    public static void main(String[] args) {


//        1
//        2 6
//        3 7 10
//        4 8 11 13
//        5 9 12 14 15   şekli print eden code create ediniz.
        int rows = 5;
        int num = 1;

        for (int i = 1; i <= rows; i++) {
            int temp = num;
            for (int j = 1; j <= i; j++) {
                System.out.print(temp + " ");
                temp += (rows - j);
            }
            num++;
            System.out.println();
        }


        int n = 5;

        for (int i = 1; i <= n; i++) {
            num = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num += (n - j);
                System.out.println("num = " + num);
            }
            System.out.println();
        }
    }
}
