package learnJava.src.dersler.gun45collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
        Set<Double> hashSet = setOlustur(dArr);
        System.out.println(toplaminiAl(hashSet));


//LAMBDA İLE COZUM
        double toplam = hashSet.stream().reduce((a, b) -> a + b).get();
        System.out.println("lambda ile toplam = " + toplam);
    }

    private static Set<Double> setOlustur(Double [] arr) {
        return  new HashSet<>(Arrays.asList(arr));
    }

    private static Double toplaminiAl(Set<Double> hashSet) {

         Double toplam=0.0;
        for (Double d : hashSet){
            toplam+=d;
        }
        return toplam;
    }
}
