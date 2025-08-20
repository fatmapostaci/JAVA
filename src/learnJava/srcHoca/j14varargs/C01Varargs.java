package learnJava.srcHoca.j14varargs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01Varargs {
         /*
        VARARGS :diva...  :)
        var----variety: cesitlilik args---arguments
        SYNTAX ->
        mathodName(parametre1,parametre2, dataType... dataName) {
        method body....

        }

	        1) Method parametre parantezi icinde birden çok parametre varsa, varargs daima en sona tanımlanmalıdır .CISSS -> Diva en son sahne alır
		    2) Method parametre parantezi icinde 1'den fazla varargs ifade TANIM-LA-NA-MAZZZ :CISS -> diva tek olur.iki diva bir ipte yurumez

           Gunun TRICK'i  köşesinde böyün :
           Method'da  argument sayisi sabitse standart normal  method tanımlanmalı..
           ancak argument sayisi belirli değilse  VARARGS ifade tercih edilmeli...
  */

    public static void main(String[] args) {
        int sayi1=15;
        int sayi2=34;
        int sayi3=59;
        int sayi4=38;

        // task01-> verilen 2 int variable toplamını print eden METHOD create ediniz..
        toplamYazdir(5,8); //13
        toplamYazdir(sayi1,45);
        toplamYazdir(sayi1,sayi4);

        // task02-> verilen 3 int variable toplamını print eden METHOD create ediniz..
        toplamYazdir(4,sayi2,sayi4);
        toplamYazdir(5,2,87);

        // task03-> verilen 5 int variable toplamını print eden METHOD create ediniz.
        toplamYazdir(4,8,6,9,3);
        toplamYazdir(sayi1,sayi3,sayi4,sayi2,8,9);
        toplamYazdir(sayi1,sayi3,sayi4,4,5,3,2,8,9);

        List<Integer> sayiList = new ArrayList<>(Arrays.asList(4,8,6,9,3));
        Integer[] sayilarArr = {4,6,3,7,9,0,4,3,2};
        toplamYazdir(sayiList.toArray(new Integer[0])); // List arraye dnüştürülerek varargs ta kullanılabilir
        toplamYazdir(sayilarArr);  // Array datalar da varargta çağrılabilir.

        // task04-> verilen String variable'rın  en fazla karakter bulunduranı  print eden METHOD create ediniz..
        uzunKelimeyiYazdir("kelime","melimemen", "akıllı","araya çıkıyoruz şimdi :)");



    }
    private static void uzunKelimeyiYazdir(String ... kelimeler){
        String enUzunKelime = "";
        for (String kelime: kelimeler){
            if (kelime.length() > enUzunKelime.length()){
                enUzunKelime = kelime;
            }
        }
        System.out.println("En uzun Kelime = "+ enUzunKelime);
    }

    private static void toplamYazdir(int a, int b){
        System.out.println(a + " ve " + b+ " sayılarının toplamı =  " + (a+b));
    }

    private static void toplamYazdir(int a, int b,int c){
        System.out.println(a + ", " + b+ " ve " + c+ " sayılarının toplamı =  " + (a+b+c));
    }

    private static void toplamYazdir(Integer ... sayilar){
        int sum = 0;
        for (int sayi : sayilar){
            System.out.print(sayi + " ");
            sum += sayi;
        }
        System.out.println("sayılarının toplamı vararg ile =  " + sum);

    }

}
