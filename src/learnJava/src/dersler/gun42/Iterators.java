package learnJava.src.dersler.gun42;


import java.util.ArrayList;
import java.util.*;

public class Iterators {
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

        Iterator<String> itr = classList.iterator();

        System.out.println("*** Task 01 ***");
        //Task01-> l1 elemanlarını for loop ile print eden code create ediniz.
        for(int i=0; i< classList.size();i++)
            System.out.println(classList.get(i));

        System.out.println("*** Task 02 ***");

        //Task02-> l1 elemanlarını for each ile print eden code create ediniz.
        for(String s : classList)
            System.out.print(s +" " );
        System.out.println();

        System.out.println("*** Task 03 ***");
        //Task03-> l1 her bir elemanını for loop ile  :slightly_smiling_face: update edip print eden code create ediniz.
        for(int i=0; i< classList.size();i++){
            String s=(String) (classList.get(i).concat( ":)"));
            classList.set(i,s);
        }
        System.out.println(classList.toString());

        System.out.println("*** Task 04 ***");
        //Task04-> l1 her bir elemanını for each ile  :disappointed: update edip print eden code create ediniz.
        for(String s : classList){
            String tempS = s.replace(":)",":(");
            classList.set(classList.indexOf(s),tempS  );
        }
        System.out.println(classList.toString());
        /*
        index desteklemeyen yapılarda(collection) tekrarlayan(loop) action'ları için for-each loop update yapamayabilir->task04
        Bu durumda java iterator interface'den tanımlanacak bir variable ile tekrarlanması gereke action'lar kullanmadan tanımlanabilir
         */
        ArrayList<Integer> sayiList = new ArrayList<>(List.of(5, 7, 8, 6, 9));
        Iterator<Integer> itr3 = sayiList.iterator();
        while (itr3.hasNext()){
            System.out.print(itr3.next() +" ");
        }
        System.out.println();
        //Task05 l1 her elemanını silip print eden code create edin
        Iterator<String> itr4 = classList.iterator();
        while (itr4.hasNext()){
            System.out.println(itr4.next() + " Siliniyor");
            itr4.remove();

        }
        System.out.println(classList);
    }
}
