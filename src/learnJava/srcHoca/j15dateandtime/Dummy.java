package learnJava.srcHoca.j15dateandtime;

import java.time.LocalTime;

public class Dummy {
    public static void main(String[] args) {
        LocalTime start = LocalTime.now();
        for (int i = 0; i < 100; i++){
            if (i %2 == 0){
                System.out.print(i + " ");
            }
        }
        LocalTime end = LocalTime.now();
        System.out.println();
        System.out.println("start = " + start);
        System.out.println("end = " + end);
        int time = end.getNano()- start.getNano();
        System.out.println("time = " + time);

    }
}
