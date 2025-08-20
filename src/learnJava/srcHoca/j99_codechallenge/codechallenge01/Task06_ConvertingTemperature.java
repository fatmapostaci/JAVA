package learnJava.srcHoca.j99_codechallenge.codechallenge01;

import java.util.Scanner;

public class Task06_ConvertingTemperature {
    /*  task->
         girilen sıcaklık değerini Fahrenhayt'tan Santigrat derecesine çeviren code create ediniz.
         formül
         c = (f-32)*5/9
     */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Fahrenayt cinsinden bir sicaklik degeri giriniz");
        double temp=scan.nextDouble();
        double celcius= (temp-32)*5/9;
        //System.out.println("Celcius = " + celcius);
        System.out.printf("Santigrat sicaklik degeri: %.3f",celcius);



















    }
}
