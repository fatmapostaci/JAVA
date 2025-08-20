package learnJava.src.dersler.gun25;

import java.util.ArrayList;
import java.util.List;

public class C02ForEachLoop {
    // task-> iki string array elemanlarının ortak olmasını kontrol edip print eden code create ediniz..with for-each

    public static void main(String[] args) {

        String[] arr1={"Sema","Savfet","Saim","Saliha","Yucel","Dogukan","Halit"};
        String[] arr2={"Sema","Semra","JavaCan","Saliha","Savfet","Dogukan","JavaNur"};
        List<String > ortakIsimList = new ArrayList<>();

        for (String name : arr1){
            for (String isim : arr2){
                if (name.equals(isim)){
                    ortakIsimList.add(name);
                }
            }
        }

        System.out.println("ortak elamanların listesi = " + ortakIsimList);


    }
}
