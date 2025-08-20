package learnJava.src.dersler.gun49_lambda.mentoring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ListArayuzClass {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>(List.of("fatmaP","bilal","ahmet"));

        //Task1: bir list verdiğimizde listin size ını verir.
        ListArayuz  sizeOflist = t -> {  return t.size();  };

        Integer size = sizeOflist.getLengthAbstractMethod(stringList);
        System.out.println("Arraylist size = " + size);

        //Task2: toplam size ını bulalım
        ListArayuz  lenghtToplamları = listeStrings -> {
            Integer sum=0;
             for( String s :  listeStrings ){
                 sum += s.length();
             }

            return sum;
          };

        Integer toplam = lenghtToplamları.getLengthAbstractMethod(stringList);
        System.out.println("toplam = " + toplam);

        //Task3: 1.elemanının size ını alalım
        ListArayuz sizeOfFirstElement = T -> { return T.get(0).length(); };

        Integer getFirstSize = sizeOfFirstElement.getLengthAbstractMethod(stringList);
        sizeOfFirstElement.concreteSoutMethod(getFirstSize);


        //Task4: string al , string i arr olarak dönüştür
        Function<String, String[]> arrayeCevir = s -> {
            return s.replaceAll("\\p{Punct}","").replace(" ","").split("");
        };

        String[] outputArr = arrayeCevir.apply("telefonum kırıldı, çok üzgünüm");
        System.out.println("Arrays.toString(outputArr) = " + Arrays.toString(outputArr));


        Function<String, String> birlestir = s ->  { return s.concat("Fatma"); };
        String birlesikKelime = birlestir.apply("Bilal ");
        System.out.println(birlesikKelime);

    }

}
