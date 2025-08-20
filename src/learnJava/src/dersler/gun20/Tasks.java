package learnJava.src.dersler.gun20;

import java.util.Arrays;

public class Tasks {
    public static void main(String[] args) {
        String []isimler = {"asd","bs","c","ssssd"};
        String []isimler2 = new String[isimler.length];

        for (int i = 0,j=0; i < isimler.length; i++) {

            String isim = isimler[i];
            if(isim.length()<3) {
                isimler2[j] = isim;
                j++;
            }
        }
        System.out.println("Arrays.toString(isimler2) = " + Arrays.toString(isimler2));
        int [] sayilar = {3,7,5,6,3,33};
        Arrays.sort(sayilar);
        System.out.println("Arrays.binarySearch(sayilar,3) = " + Arrays.binarySearch(sayilar,7 ));
    }
}
