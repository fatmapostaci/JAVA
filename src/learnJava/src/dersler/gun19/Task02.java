package learnJava.src.dersler.gun19;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {// main level
        //task-> girilen ad ve soyadın ilk harfleri buyuk diğer harflerini küçük print eden METHOD create ediniz

        String str1= "SafFet";
        String str2= "DenIz";
        String fullName = fullNameFormatter(str1,str2);
        System.out.println("fullName = " + fullName);

    }//main sonu

    private static String fullNameFormatter(String name , String surmane){
        name = name.
                substring(0,1).
                toUpperCase().
                concat(name.substring(1).toLowerCase());
        surmane = surmane.
                substring(0,1).
                toUpperCase().
                concat(surmane.substring(1).toLowerCase());

        return name.
                concat(" ").
                concat(surmane);
    }
}// Class sonu
