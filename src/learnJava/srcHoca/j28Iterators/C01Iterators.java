package learnJava.srcHoca.j28Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C01Iterators {
        /*
            1)Iterator'lar loop'larin yaptigi ayni isi yapar.
            2)Iterator'larda sonsuz loop olusma ihtimali yoktur.
            3)Iterator'lar ile loop'lar arasinda performans farki yoktur.
            4)Iterator'lar bir collection'dan eleman silme ve bir collection'daki elemani degistirme konusunda daha basrilidir.
            5)Iki tip iterator var; i)Iterator: Bu sadece eleman silmede(remove) kullanilir,
                                                eleman eklemek veya elemani degistirmek mumkun degildir.
                                    ii)ListIterator:eleman silebilir(remove), ekleyebilir(add) ve degistirebilir(set).
                                    Note:"Iterator" sadece soldan saga(ilk elemandan son elemana) calisir.
                                         "ListIterator" ise iki yonlu calisabilir.
         */

    public static void main(String[] args) {

        ArrayList<String> classList = new ArrayList<>(List.of("Azize","Fatma","Mehmet","Mertay","Rabia","Şengül","Tugba"));

        System.out.println("classList = " + classList); // [ Azize, Fatma, Mehmet, Mertay, Rabia, Şengül, Tugba ]

        System.out.println("*** Task 01 ***");
        //Task01-> l1 elemanlarını for loop ile print eden code create ediniz.
        for (int i = 0; i< classList.size(); i++){
            System.out.print(classList.get(i) + " ");
        }  // Azize Fatma Mehmet Mertay Rabia Şengül Tugba
        System.out.println();

        System.out.println("*** Task 02 ***");
        //Task02-> l1 elemanlarını for each ile print eden code create ediniz.
        for (String a : classList){
            System.out.print(a+" ");
        } // Azize Fatma Mehmet Mertay Rabia Şengül Tugba
        System.out.println();

        System.out.println("*** Task 03 ***");
        //Task03-> l1 her bir elemanını for loop ile  :-) update edip print eden code create ediniz.
        for (int i = 0; i< classList.size();i++){
           String eleman = classList.get(i)+ " :-)";
           classList.set(i, eleman);
        }
        System.out.println("Update sonrası classList = " + classList); // [Azize :-), Fatma :-), Mehmet :-), Mertay :-), Rabia :-), Şengül :-), Tugba :-)]
        System.out.println();

        System.out.println("*** Task 04 ***");
        //Task04-> l1 her bir elemanını for each ile  :-( update edip print eden code create ediniz.
        for (String isim: classList){  // classList = [Azize :-) :-(, Fatma :-) :-(, Mehmet :-) :-(, Mertay :-) :-(, Rabia :-) :-(, Şengül :-) :-(, Tugba :-) :-(]
            classList.set(classList.indexOf(isim),isim + " :-(");
        }
        System.out.println("classList = " + classList);

         /*
        index desteklemeyen yapılarda(collection) tekrarlayan(loop) action'ları için for-each loop update yapamayabilir->task04
        Bu durumda java iterator interface'den tanımlanacak bir variable ile tekrarlanması gereke action'lar kullanmadan tanımlanabilir
         */

        /*
        iterator nasil calisir
        bir iterator objesi olusturmak icin collection uyesi bir obje kullanılır.
        Iterator itr =  liste.iterator();
        iterator collection'in ilk elementinin oncesine gidip bekler

        [ (itr)5, 7, 8, 6, 9]

        itr.hasNext() ===> true  iterator'a yaninda eleman varlığını kontrol eder, true veya false return eder.

        itr.next(); ==> iterator bir sonraki elementin yanina geçirir.
                        ve uzerinden gectigi elementi return eder.
         [ 5, (itr)7, 8, 6, 9]   ===>  5 return eder.

         itr.next(); ==>

         [ 5, 7, (itr)8, 6, 9]   ===>  7 return eder.

         itr.remove(); // iterator'in elinde olan elementi sildi
         dolayisiyla ust uste iki kere itr.remove(); KULLANILAMAZ

         once itr.next(); methodunu calistirip
         iterator'in bir element return etmesi  saglanmalı..

         */
        ArrayList<Integer> sayiList = new ArrayList<>(List.of(5, 7, 8, 6, 9));
        Iterator<Integer> itr2 = sayiList.iterator();  // [ (itr)5, 7, 8, 6, 9]
        System.out.println(itr2.hasNext()); // true
        System.out.println(itr2.next());  // 5  -->  [ 5, (itr)7, 8, 6, 9]

        System.out.println(itr2.hasNext()); // true
        System.out.println(itr2.next());  // 7  -->  [ 5, 7, (itr)8, 6, 9]

        System.out.println(itr2.hasNext()); // true
        System.out.println(itr2.next());  // 8  -->  [ 5, 7, 8, (itr)6, 9]

        System.out.println(itr2.hasNext()); // true
        System.out.println(itr2.next());  // 6  -->  [ 5, 7, 8, 6, (itr)9]

        System.out.println(itr2.hasNext()); // true
        System.out.println(itr2.next());  // 9  -->  [ 5, 7, 8, 6, 9(itr)]

        System.out.println(itr2.hasNext()); // false
        //System.out.println(itr2.next());  // NoSuchElement  -->  [ 5, 7, 8, 6, 9(itr)]

        Iterator<Integer> itr3 = sayiList.iterator();
        while (itr3.hasNext()){
            System.out.println(itr3.next());
        }
        System.out.println("*** Iterator ***");
        //iterator icin
        //1.step->iterator tanimlama
        Iterator<String> itr = classList.iterator();

        //2. Step While Loop tanımla
        while (itr.hasNext()){
            //hasNext()->it1 elemanları için pointer(cursor:imleç) oldugu yern sonrasında eleman varlıgını kontrol edip true-false return eder
            //next()-> pointer mevcut elemanın sonrasına konumlanıp mevcut eleman return eder
            System.out.print(itr.next() + "  ");
        }

        System.out.println();

        System.out.println("*** Task 05 ***");
        //Task05-> l1 her bir elemanlarını silip  print eden code create ediniz.
        Iterator<String> itr4 = classList.iterator();
        while (itr4.hasNext()){
            itr4.next();
            itr4.remove();
        }

        System.out.println(classList);


    }
}
