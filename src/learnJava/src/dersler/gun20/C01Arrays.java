package learnJava.src.dersler.gun20;

import java.util.Arrays;

public class C01Arrays {
    /*
        Array (Dizi): Java'da birden fazla aynı type variable depolamak (store etmek) icin kullanilan bir objedir.
        Array tanımlamak için:
        1- data type (Bir array'in icerisinde sadece ayni data tipinden variable olmalıdır.)
        2- length (length array'e depolanacak  max eleman sayisini belirtir ve length'den  fazla eleman  koyulursa RTE verir)

         Array'de primitive datalar veya non-primitive datalarin referanslari store edilebilir
         isimler array'inin icinde isim degerleri degil, isimlerin referanslari saklanır
         */

    public static void main(String[] args) {
        // Array declaration
        int number; // int data tanımlandı
        int [] numbers; // int data türünde çoklu data kaydedeceğimiz arrayi tanımladık

        // Array Creation
        numbers = new int [5]; //  [0,0,0,0,0]

        Integer [] numbersWrap = new Integer[5]; // [null,null,null,null,null] hem decleration hem creation beraber yapıldı//System.out.println("Arrays.toString(numbersWrap) = " + Arrays.toString(numbersWrap));
        String names[] = new String[3];

        // Array lere değer attaması yapmak
        // Arrayin Son elemanına değer atama
        numbers[numbers.length-1] = 10;

        // Arrayin ilk elemanına değer atama
        numbers[0] = 6;
        System.out.println("(numbers[1]*5) = " + (numbers[1] * 5));

        // Tüm elemanlara değer ataması yaparak Array oluşturma
        int [] sayilar = new int[]{23,7,43,95,8};

        // Array elemanlarına ulaşmak: --> array_name[index]
        numbers[3] = 23;  // 4. elemana 23 değerini atadık

        // Arrayi yazdırma  --> önce Stringe çevrilip sonra yazdırılır
        System.out.println("numbers = " + numbers); // bize arayi yazdırmaz referansını yazdırır -- [I@30f39991
        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));
        System.out.println("Arrays.toString(names) = " + Arrays.toString(names));
        System.out.println("Arrays.toString(sayilar) = " + Arrays.toString(sayilar));

        // Arrayde olmayan elemanı yazdırma
        //System.out.println("numbers[5] = " + numbers[5]);// ArrayIndexOutOfBoundsException


        // Arrayin eleman sayısını bulmak array_name.length
        System.out.println("numbers.length = " + numbers.length);// 5

        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));
        // Arraydeki değerleri loop ile tektek ulaşma
        for (int i =0; i < numbers.length ; i++){
            int num = numbers[i];
            System.out.println("Döngü esnasında " + (i+1) + ". array elemanının değeri = "+ num );
        }

        //char [] array
        String isim = "Fatma Postacı";
        char[] karakterler = new char[5];
        isim.getChars(0,5,karakterler,0);
        System.out.println(karakterler);
    }

}
