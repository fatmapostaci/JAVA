package learnJava.srcHoca.j29collections.tasks;

import java.util.Arrays;
import java.util.HashSet;

public class Task08 {
        /* TASK :
    Main method altinda bir double hashSet olusturunuz.
    ve bu seti, adi setOlustur ve return tipi hashSet double olan
    ayri bir metod altinda 3.23 , 3.10 , 5.12 , 10.12 , 23.12 degerlerini kullanarak doldurun.
    Adini toplaminiAl koyacagimiz ve parametre olarak bir Double hashSet kabul edecek ayri bir method olusturarak
    hashSetin degerlerinin toplamini alınız.

    Çıktı--> sonuc = 44.69
     */

    public static void main(String[] args) {
        Double[] dArr = new Double[]{3.23 , 3.10 , 5.12 , 10.12 , 23.12};
        HashSet<Double> hashSet = setOlustur(dArr);
        System.out.println(toplaminiAl(hashSet));
    }

    private static HashSet<Double> setOlustur(Double [] arr) {
        return  new HashSet<>(Arrays.asList(arr));
    }

    private static Double toplaminiAl(HashSet<Double> hashSet) {
        Double toplam=0.0;
        for (Double d : hashSet){
            toplam+=d;
        }
        return toplam;
    }
}
