package learnJava.srcHoca.j14varargs;

public class Task03 {
           /*
        Task ->  girilen bir sayı ile girilen String'lerin en uzun harf sayısını çarpıp print eden METHOD create ediniz.
         */

    public static void main(String[] args) {

        //Task ->  girilen bir sayı ile girilen String'lerin en uzun harf sayısını çarpıp print eden METHOD create ediniz.
        carpimMethodu(2,"a","ber","c");
        carpimMethodu(3,"defter","kalemlik");
        carpimMethodu(4,"String1","String2","String4");
        enUzunHarf(4,"String1","String2","String4");
    }

    private static void carpimMethodu(int a, String... s) {
        int strLen=0;
        for (String w : s) {
            if(strLen< w.length())
                strLen=w.length();
        }
        int sonuc = strLen*a;
        System.out.println("sonuc = " + sonuc);
    }

    public static void enUzunHarf(int a, String... str) {

        int enUzun = 0;
        String uzunKelime ="";

        int i = 0;

        for (String kelime : str) {
            if (kelime.length() > enUzun) {
                enUzun = kelime.length();
                uzunKelime=kelime;
            }

        }
        int carpim = enUzun * a;

        System.out.println("En uzun kelime : " + uzunKelime+"" +
                "\nuzunlugu : "+enUzun+"" +
                "\nUzunlugun girdiginiz "+a+" sayisiyla carpimi : "+carpim);
    }

}
