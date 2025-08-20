package learnJava.src.dersler.gun50.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tasks_Filter {
    public static void main(String[] args) {
        List<Integer> sayiList = new ArrayList<>(Arrays.asList(7, 58, 17, 54, 33, 3, 13, 35, 65, 18, 61, 46, 25, 16, 6));


        //Task01->"Structured Programming"--> AMELE Programming kullanarak  listin çift elemanlarını aynı satırda aralarında bosluk ile print ediniz
        System.out.println("\n      ************** Task01**************");
        //task02-> "Functional Programming"--> CINCIX Programming kullanarak  listin çift elemanlarını aynı satırda aralarında bosluk ile print ediniz
        ciftsayilarıFonksiyonelYazdır(sayiList);

        //task03-> "Functional Programming"--> CINCIX Programming kullanarak  listin 35'den kucuk çift elemanlarını aynı satırda aralarında bosluk ile print ediniz
        ndenKucukCiftSayilariYazdir(sayiList,35);


        //task04-> "Functional Programming"--> CINCIX Programming kullanarak  listin 34'den buyuk yada  tek elemanlarını aynı satırda aralarında bosluk ile print ediniz

        ciftsayilarıFonksiyonelYazdır(sayiList);

    }

    private static void ndenKucukCiftSayilariYazdir(List<Integer> sayiList,int num) {

        sayiList.
                stream().
                filter(SeedMethods::isEven).      //filter(t -> t<num  && t%2 == 0)
                filter( t -> t<num ).
                forEach(SeedMethods::yazdir);

    }

    private static void ciftsayilarıFonksiyonelYazdır(List<Integer> sayiList) {

        sayiList.
                stream().     //collection akışa alındı
                filter(SeedMethods::isEven).    //filter(t -> t % 2 == 0).
                forEach(SeedMethods::yazdir);
    }

}
