package learnJava.src.dersler.gun28;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Mentoring_Period {
    public static void main(String[] args) {

        System.out.println("Period Tasks-1 : İki Tarih Arasındaki Farkı Yıl, Ay ve Gün Olarak Hesaplama");
        LocalDate birthDate = LocalDate.of(1990, 5, 15);
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(birthDate,currentDate);
        System.out.println("age.toString() = " + age.getYears() );

        System.out.println("Period Tasks-2 : Üyelik Süresi Hesaplama");
        LocalDate startDate = LocalDate.of(2022, 11, 1);
        LocalDate endDate = LocalDate.of(2024, 3, 15);
        Period uyelikSuresi = Period.between(startDate,endDate);
        System.out.print("Üyelik süreniz "+uyelikSuresi.getYears() +" yıl ");
        System.out.print(uyelikSuresi.getMonths()+" ay ");
        System.out.print(uyelikSuresi.getDays() + " gun");
        System.out.println();

        System.out.println("Period Tasks-3 : Gelecekteki Bir Etkinlik İçin Geri Sayım");
        LocalDate today = LocalDate.now();
        LocalDate eventDate = LocalDate.of(2025, 12, 25);
        Period geriSayim = Period.between(today,eventDate);
        System.out.println("Etkinliğin başlaması için "+geriSayim.toTotalMonths()+"  ay " +
                geriSayim.getDays() +" gun kaldı.");


        /*Bir öğrenci, 4 yıl, 3 ay ve 10 gün süren bir üniversite eğitimine başlamıştır.
Bu eğitim süresinin sonunda mezuniyet tarihi tam olarak hesaplanmalıdır.
Program, başlangıç tarihi ile mezuniyet tarihine kadar olan süreyi
"yıl, ay ve gün" olarak gösterecek ve her ayın başında kaç yıl, ay ve gün kaldığını gösterecektir.

Örneğin:
Başlangıç tarihi: 2024-09-15
Mezuniyet tarihi: 2028-12-25
Her ayın başında ne kadar süre kaldığını yazdıran bir program hazırlayın.*/
        System.out.println("Her ayın başında Mezuniyete ne kadar süre kaldığını yazdıran program.");
        LocalDate uniBaslangicTarihi = LocalDate.of(2024,9,15);
        Period egitimsuresi = Period.of(4,3,10);
        LocalDate mezuniyetTarihi=uniBaslangicTarihi.plus(egitimsuresi);
        System.out.println("mezuniyetTarihi = " + mezuniyetTarihi);

        long monthDuration = egitimsuresi.toTotalMonths();
        for (long i = 0; i<monthDuration;i++){
            Period kalanSure =Period.between( uniBaslangicTarihi.plusMonths((int) i) , mezuniyetTarihi);
            System.out.println("Tarih: " +mezuniyetTarihi.minus(kalanSure) +
                    " Mezuniyete kalan süre: "+ kalanSure.getYears() + " yıl " +
                    kalanSure.getMonths() + "  ay ");
        }


    }
}
