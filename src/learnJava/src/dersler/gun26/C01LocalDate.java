package learnJava.src.dersler.gun26;

import java.time.LocalDate;
import java.time.Month;

public class C01LocalDate {

    public static void main(String[] args) {
        // LocalDate  -> sadece gun-ay-yıl datalarını tutar(stored)

        LocalDate bugun = LocalDate.now();

        // LocalDate data türündeki veriler için kullanılabilecek yöntemler:
        System.out.println("bugun.getDayOfYear() = " + bugun.getDayOfYear());
        int year =bugun.getYear();
        System.out.println("year = " + year);
        Month ay =bugun.getMonth();
        System.out.println("ay = " + ay);
        System.out.println("bugun.getMonthValue() = " + bugun.getMonthValue());
        System.out.println("bugun.getDayOfMonth() = " + bugun.getDayOfMonth());
        System.out.println("bugun.getDayOfWeek() = " + bugun.getDayOfWeek());

        System.out.println("**********************");
        LocalDate mezuniyetTarihi = LocalDate.of(2000,8,19);
        LocalDate evlilikYili = LocalDate.of(2005,6,3);

        System.out.println("mezuniyetTarihi = " + mezuniyetTarihi);
        System.out.println("evlilikYili = " + evlilikYili);

        // Kaç tıldır evli olduğunu yazdıralım:
        int evlilikSuresi = bugun.getYear()-evlilikYili.getYear();
        System.out.println("evlilikSuresi = " + evlilikSuresi);

        // Tanımlanan tarihten istenildiği kadar ileri veya geri gidilebilir
         bugun.
                 minusYears(5).
                 minusMonths(3).
                 plusWeeks(5);

    }
}
