package learnJava.src.dersler.gun27;

import java.time.Duration;
import java.time.LocalTime;

public class C06Duration {

    public static void main(String[] args) {
        LocalTime t1 = LocalTime.of(20,25,30);
        LocalTime t2 = LocalTime.of(18,25,30);
        LocalTime t3 = LocalTime.of(20,20,30);
        LocalTime t4 = LocalTime.of(20,25,34);
        LocalTime t5 = LocalTime.of(12,11,8);

        System.out.println("Duration.between(t1,t2) = " + Duration.between(t1, t2));
        System.out.println("Duration.between(t2,t1) = " + Duration.between(t2, t1));
        System.out.println("Duration.between(t5,t1) = " + Duration.between(t5,t1));

        Duration d1 = Duration.between(t5,t1);
        Duration d2 = Duration.between(t2,t1);

        System.out.println("d2.toMinutes() = " + d2.toMinutes()); // 2 saat 120 dk
        System.out.println("d2.toSeconds() = " + d2.toSeconds()); // 2 saat 7200 sn

        System.out.println("d1.toHours() = " + d1.toHours());
        System.out.println("d1.toMinutes() = " + d1.toMinutes());
        System.out.println("d1.toSeconds() = " + d1.toSeconds());

        System.out.println("d1.getSeconds() = " + d1.getSeconds());

    }
}
