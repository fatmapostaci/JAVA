package learnJava.src.dersler.gun25;

public class HW {
    public static void main(String[] args) {

        //Task -> Girilen ilk sayı hariç diğerlerini toplayan ve toplam ile ilk sayıyı çarpan METHOD create ediniz.
        toplamaMethodu(1,2,3,4,5);
        toplamaMethodu(2,3,4);

        //Task ->  girilen bir sayı ile girilen String'lerin en uzun harf sayısını çarpıp print eden METHOD create ediniz.
        carpimMethodu(2,"a","ber","c");
        carpimMethodu(3,"defter","kalemlik");


    //stringlerin istenilen kadar ilk harflerini yazdıran METHOD create ediniz.
    stringYazdir(5,"dfs","ass","serm","k","lkum");
    }

    private static void stringYazdir(int istenen,String... strings) {
        int len=istenen;
        for (String s : strings){
            //eğerki stringin uzunluğu istenen sayıdan küçükse kelime uzunluğu kadar yazması için kontrol ediyor
            if(s.length()<istenen)
                len=s.length();
            else
                len=istenen;
            System.out.println("s.substring(0,istenen) = " + s.substring(0,len));
        }
    }

    private static void carpimMethodu(int a, String... s) {
        int strLen=0;
        for (String i : s) {
            if(strLen< i.length())
                strLen=i.length();
        }
        int sonuc = strLen*a;
        System.out.println("toplam sonuc = " + sonuc);
    }

    private static void toplamaMethodu(int a,int... b) {
        int sum =0;
        for (int i : b ) {
            sum+=i;
        }
        int sonuc= sum*a;
        System.out.println("çarpım sonuc = " + sonuc);
    }

}
