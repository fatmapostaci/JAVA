package learnJava.src.dersler.gun48;

import java.util.Arrays;
import java.util.HashSet;

public class Task8 {
        /* TASK :
    Main method altinda bir double hashSet olusturunuz.
    ve bu seti, adi setOlustur ve return tipi hashSet double olan
    ayri bir metod altinda 3.23 , 3.10 , 5.12 , 10.12 , 23.12 degerlerini kullanarak doldurun.
    Adini toplaminiAl koyacagimiz ve parametre olarak bir Double(Çift) hashSet kabul edecek ayri bir method olusturarak
    hashSetin degerlerinin toplamini alınız.

    Çıktı--> sonuc = 44.69
     */
        public static void main(String[] args) {
            HashSet<Double> hashSet = new HashSet<>();

            System.out.println(toplaminiAl(setOlustur(hashSet)));


        }

    private static HashSet<Double> setOlustur(HashSet<Double> hashSet) {
            hashSet.addAll(Arrays.asList(3.23 , 3.10 , 5.12 , 10.12 , 23.12));
            return hashSet;

    }

    private static Double toplaminiAl(HashSet<Double> hashSet) {
            Double toplam=0.0;
            for (Double d : hashSet){
                toplam+=d;
            }
            return toplam;
    }
}
