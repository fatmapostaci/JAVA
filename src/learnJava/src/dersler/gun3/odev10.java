package learnJava.src.dersler.gun3;

import java.util.Scanner;

public class odev10 {
    public static void main(String[] args) {
        /*Task->
                Write a Java program to convert temperature from Fahrenheit to Celsius degree.
                formula :  c = (f-32)*5/9
                */
        float Celcius, Fahreneit;
        Scanner scanf = new Scanner(System.in);
        System.out.print(" Enter Fahreneit:");
        Fahreneit = scanf.nextFloat();
        Celcius = (Fahreneit-32)*5/9;
        System.out.printf(" Celcius degree of %.2f F is %.2f ", Fahreneit, Celcius );

    }
}
