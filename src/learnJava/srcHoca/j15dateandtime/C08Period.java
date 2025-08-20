package learnJava.srcHoca.j15dateandtime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class C08Period {

    public static void main(String[] args) {

        LocalDate bugun = LocalDate.now();
        LocalDate baslangic = LocalDate.of(2024,9,30);

        Period bootCampSuresi = Period.between(baslangic,bugun);
        System.out.println("bootCampSuresi = " + bootCampSuresi);

        int yil =bootCampSuresi.getYears();
        int ay =bootCampSuresi.getMonths();
        int gun =bootCampSuresi.getDays();

        System.out.println("yil = " + yil);
        System.out.println("ay = " + ay);
        System.out.println("gun = " + gun);

        // Farkı gün olarak bulmak istersek:
        int kacGundur = (int)(bugun.toEpochDay() - baslangic.toEpochDay());
        System.out.println("kacGundur = " + kacGundur);

        // Task-> 30 Eylül 2024 başlayan sdet kursu 11 aylık planlanırsa bitiş tarihini gun sayısını print eden code create ediniz.

        Period periodCW = Period.of(0,11,0);
        //Period kursPeriod = Period.ofMonths(11);
        LocalDate kursBaslangic = LocalDate.of(2024,9,30);
        System.out.println(kursBaslangic);
        String kursBitisi = kursBaslangic.plus(periodCW).format(DateTimeFormatter.ISO_LOCAL_DATE);
        //LocalDate kursBitisi2 = kursBaslangic.plus(kursPeriod);

        // ISO -> International Organization for Standardization

        System.out.println("kursBitisi = " + kursBitisi);
        //System.out.println("kursBitisi2 = " + kursBitisi2);

        // ahan da trick-> period tanımında birden çok tarih zaman girildiğinde daima sonuncu parametre derlenir. önceki parmetler ezilir
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String str = "2024-12-02";
        String strNew = "02/12/2024";
        System.out.println("LocalDate.parse(strNew,f1) = " + LocalDate.parse(strNew, f1).format(f1));
        System.out.println("LocalDate.parse(str) = " + LocalDate.parse(str));

    }
}
