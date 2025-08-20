package learnJava.src.dersler.gun29.mentoring.market;

import java.time.LocalDate;

public class UrunClass {
    public static void main(String[] args) {
        Product makarna = new Product();
        makarna.marka = "Mutlu";
        makarna.ID = 12123;
        makarna.agirlik = 500;
        makarna.sonKullanmaTarihi= LocalDate.now();

        System.out.println("makarna = " + makarna);
        System.out.println(makarna.toString(" ..Spagetti"));



    }
}
