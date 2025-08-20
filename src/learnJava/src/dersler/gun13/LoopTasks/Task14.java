package learnJava.src.dersler.gun13.LoopTasks;

public class Task14 {

    public static void main(String[] args) {

        //  Task->  0 ile 100 arasındaki bütün çift sayıları print eden code create ediniz.
        //Not: 0 ve 100 dahildir.
        for (int i = 0; i <= 100; i++) {
            if(i%2==0)  System.out.print(i+" ");
            if(i==50) System.out.println();
        }


    }
}
