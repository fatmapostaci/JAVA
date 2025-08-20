package learnJava.src.dersler.gun32.shopping;

import java.time.LocalDate;

public class Shop {
    //
    static double shoes =100;

    static {
        //class çağırıldığında ilk olarak static block çalışır.
        //belirli bir gün için fiyatta indirim yapmasını sağlar
        if (LocalDate.now().isEqual(LocalDate.of(2024,12,12)))
            shoes = shoes * 0.9;
    }
}
