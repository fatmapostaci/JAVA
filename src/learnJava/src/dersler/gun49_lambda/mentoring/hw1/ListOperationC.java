package learnJava.src.dersler.gun49_lambda.mentoring.hw1;

import java.util.ArrayList;
import java.util.List;

public class ListOperationC {

  //  T01) Kendi Arayüzümüzü Oluşturma
 /*
A R A Y Ü Z --> ListOperation
*List<String> parametreli
*Return olmasın
*Tek metodlu fonksiyonel arayüz (perform())
C L A S S  --> ListOperationC
addItem: Listeye yeni eleman ekleme işlemini gerçekleştiren lambda.
removeItem: Belirli bir elemanı silen lambda.
printList: Listenin tüm elemanlarını yazdıran lambda.

  */

    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>(List.of("Fatma","Bilal"));
        ListOperation addItem = (s,list) ->{
            list.add(s);
        };

        ListOperation removeItem = (s,list) ->{
          list.remove(s);
        };



        addItem.perform("Zeynep", nameList);
        addItem.print(nameList);

        removeItem.perform("Fatma",nameList);
        removeItem.print(nameList);


    }




}
