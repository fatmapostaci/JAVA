package learnJava.srcHoca.j26abstraction.abstraction05;

import java.time.LocalDate;

public class Kedi extends Hayvan {

    @Override
    void yiyecegi() {
        System.out.println("Mama veya fare ");
    }

    @Override
    void yemekMiktari() {
        System.out.println("250g ");
    }

    @Override
    void gunlukUykuSuresi() {
        System.out.println("10 saat");
    }

    @Override
    void sesi() {
        System.out.println("Miyavlar");
    }

    void yumakIleOynar(){
        System.out.println(getIsim() + " Yumak ile oynayarak eğlenirler");
    }
    int uykusaati(String str){
        System.out.println(getIsim() + " uyumaya başladı");
        return str.length();
    }



}
