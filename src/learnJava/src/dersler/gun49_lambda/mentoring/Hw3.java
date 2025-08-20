package learnJava.src.dersler.gun49_lambda.mentoring;

import java.util.function.BiFunction;

public class Hw3 {

    // BiFunction <T , T , R>
// T A S K 01) İki Sayıyı Toplamak
// T A S K 02) İki Sayının Büyük Olanını Bulmak
// T A S K 03) İki Sayıyı Bölmek ve Sonucu Döndürmek

    public static void main(String[] args) {
        // T A S K 01) İki Sayıyı Toplamak
        BiFunction<Integer,Integer,Integer>  toplamaYap = (a,b) -> {return (a+b);};
        Integer toplam = toplamaYap.apply(3, 6);
        System.out.println("toplam = " + toplam);


        // T A S K 02) İki Sayının Büyük Olanını Bulmak
        BiFunction<Integer,Integer,Integer>  findBigOne = (a,b) -> { return   a > b ? a : b;  };
        Integer bigNumber = findBigOne.apply(6,12);
        System.out.println("bigNumber = " + bigNumber);

        // T A S K 03) İki Sayıyı Bölmek ve Sonucu Döndürmek
        BiFunction <Double,Double,Double>  bolmeYap = (a,b) -> { return a/b; };
        Double bolum = bolmeYap.apply(22.0,4.0);
        System.out.println("bolum = " + bolum);

    }
}
