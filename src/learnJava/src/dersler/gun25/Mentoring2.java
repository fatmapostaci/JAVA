package learnJava.src.dersler.gun25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mentoring2 {
    //  double[] arr = {23, 55, 66.5, 35, 55.7, 90};
    //  yukarıdaki şekilde bir array içerisinde öğrencilerin notları verilmiştir
    //  49.5 ve üstü alan öğrenciler sınıfı geçmiştir,
    //  ayrıca ortalamadan daha yukarı not alanlar da sınıfı geçmiştir
    //  sınıfı geçemeyenlerin notlarını yazdırın , for-each ile yapın
    public static void main(String[] args) {
        double[] arr = {23, 55, 66.5, 35, 55.7, 90};
        List<Double> kalanlar = new ArrayList<>();
        List<Double> gecenler = new ArrayList<>();

        double ortalama = notOrtalamasi(arr);
        System.out.println("ortalama = " + ortalama);

        for (double i : arr )
            if(i>49.5 || i>ortalama)
                gecenler.add(i);
        System.out.println("gecenler = " + gecenler);

        for (double i : arr )
            if (i<49.5)
                kalanlar.add(i);
        System.out.println("kalanlar = " + kalanlar);
    }

    private static double notOrtalamasi(double[] arr) {
        return sum(arr)/ arr.length;
    }
    public static double sum(double[] arr){
        double toplam=0.0;
        for (double i : arr)   toplam+=i;
        return toplam;
    }
}
