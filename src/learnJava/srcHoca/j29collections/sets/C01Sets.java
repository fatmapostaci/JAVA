package learnJava.srcHoca.j29collections.sets;

import java.util.*;

public class C01Sets {
         /*
     Set :  1) unique(benzersiz tek) elemanlardan olusur, Set'lerin icinde bir eleman sadece bir kere kullanilabilir. mükerrer(duplicate) eleman olmaz.
            2) sadece bir null değeri alabilir.(treeSet hariç).Java elementleri unique yapmak icin HASH ALGORITMASI kullanir.
                 Java her data icin hashing teknigini kullanarak bir code uretir.Bu code'u almak icin hashCode() methodu kullanilir.
                 Hashing, farklı büyüklükteki girdilerden sabit büyüklükte bir çıktı oluşturma sürecine verilen isimdir.
                 Universitelerdeki ogrenci numaralari gibi bir ogrenci ismi soruldugunda numarasini bulursaniz onunla ilgili tum datalara ulasilabilir.


            Set     --> HashSet         : 1) HashSet, duplication’a(tekrarlı eleman) izin vermez.
                                            Eger bir elemani tekrar HashSet’e eklemek isterseniz eski olan silinip, yeni olan uzerine yazilir.
                                          2) Haset'ler Set'ler arasinda en hizli olanıdir. bir algoritmaya göre kayit eder.
                                           değerlerin giriş sırasına dikkat edilmez. (LinkedHashSet hariç)
                                          3) HashSet "null" object'ini eleman olarak kullanabilir.
                                          Ancak birden fazla null degerini bir HashSet’e eklemek isterseniz sadece bir tane null degeri olur.

                        LinkedHashset   : 1) Tekrarli eleman kabul etmezler. Elemanlari ekleme sirasina(insertion order) gore dizerler.
                                          2) LinkedHashSet, HashSet'den daha yavas calisir.
                                          3) LinkedHashSet "null" object'ini eleman olarak kullanabilir.
                                          4) Ekleme ve remove islemlerinde hizlidirlar.

                        TreeSet         : 1) TreeSet tekrarli eleman kabul etmez, cunku Set'dir.
		                                  2) Elemanlari natural Order'a(String ise alfabetik, sayi ise kucukten buyuge) gore dizer.
		 	                              3) TreeSet, setlerin en yavasidir. Bu yuzden TreeSet kullanirken dikkatli olunmalı...
		 	                              4)AHAN DA TRİCK :TreeSet "null" object'ini eleman olarak kullanilamaz.


         Set Methods :
            .add(eleman);-->Set’e eleman ekler
            .addAll(collection);-->istenen collection’in tum elemanlarini ekler
            .contains(eleman);-->istenen eleman set’te varsa true, yoksa false return eder.
            .containsAll(collection);-->istenen collection’in tumu aranan sette var ise true, yoksa false return eder.
            .remove(eleman);-->istenen eleman bulursa siler ve true dondurur, bulamazsa false return eder.
            .removeAll(collection);-->istenen collection’in herhangi bir elemanlanini bulursa siler ve true dondurur, hiç bir eleman bulamazsa false return eder.
            .equlas(set2);-->istenen set2’le tum elemanlar ayni ise true, yoksa false return eder.
            .retainAll(collection1);-->collection1’nin elemanlarinin disindaki tum elemanlari siler, silme islemi yapti ise true, yoksa false return eder.
              (kesişen ortak elemanları döndürür.)
            .clear();-->sett'teki Tum elemanlari siler
            .isEmpty();-->Sette hic eleman yoksa true, varsa false return eder
            .size();-->set’in eleman sayisini verir

     */

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>(List.of("küşleme", "göveç", "soğan kebap", "ankara doner", "kuzu gerdan","acıl antep tava", "şaşlık"));
        // Set tanımlama:
        HashSet<String> yemekSet = new HashSet<>(); // Boş bir set oluşturuldu
        yemekSet.add("Menemen");
        yemekSet.add("Omlet");
        yemekSet.add("Sahanda Yumurta");
        yemekSet.add("küşleme");

        // Set nasıl yazdırılır
        System.out.println("yemekSet = " + yemekSet); // [Menemen, Omlet, Sahanda Yumurta]

        HashSet<String> yemekHashSet = new HashSet<>(linkedList); // Collection dan hasset oluşturma
        LinkedHashSet<String> yemekLinkedSet = new LinkedHashSet<>(linkedList); // Collection dan LinkedHashSet oluşturma
        TreeSet<String> yemekTreeSet = new TreeSet<>(linkedList); // Collection dan TreeSet oluşturma


        // Eleman ekleme:
        yemekHashSet.add("Kuzu pirzola");
        yemekLinkedSet.add("Kuzu pirzola");
        yemekTreeSet.add("Kuzu pirzola");

        // tekrarlı eleman ekleme
        yemekHashSet.add("Kuzu pirzola");
        yemekLinkedSet.add("Kuzu pirzola");
        yemekTreeSet.add("Kuzu pirzola");

        // null değer ekleme
        yemekHashSet.add(null);
        yemekLinkedSet.add(null);
        //yemekTreeSet.add(null); // NullPointerException

        yemekHashSet.add(null);
        yemekLinkedSet.add(null);

        // Collecsion ekleme: (addAll())

        yemekHashSet.addAll(yemekSet);
        yemekLinkedSet.addAll(yemekSet);
        yemekTreeSet.addAll(yemekSet);

        // eleman çıkarma:
        yemekHashSet.remove("kuzu gerdan");
        yemekLinkedSet.remove("kuzu gerdan");
        yemekTreeSet.remove("kuzu gerdan");

        // Collection silme:
        System.out.println("yemekHashSet.removeAll(yemekSet) = " + yemekHashSet.removeAll(yemekSet));

        // retainAll() metodu --> kesişen elemanlar olarak listeyi güncelliyor
        System.out.println("yemekLinkedSet.retainAll(yemekSet) = " + yemekLinkedSet.retainAll(yemekSet));



        // "küşleme", "göveç", "soğan kebap", "ankara doner", "kuzu gerdan","acıl antep tava", "şaşlık"
        System.out.println("yemekHashSet = " + yemekHashSet); // [göveç, kuzu gerdan, şaşlık, ankara doner, acıl antep tava, küşleme, soğan kebap]
        System.out.println("yemekLinkedSet = " + yemekLinkedSet); // [küşleme, göveç, soğan kebap, ankara doner, kuzu gerdan, acıl antep tava, şaşlık]
        System.out.println("yemekTreeSet = " + yemekTreeSet); // [acıl antep tava, ankara doner, göveç, kuzu gerdan, küşleme, soğan kebap, şaşlık]

        HashSet<Integer> hs5=new HashSet<Integer>(Arrays.asList(16,54,67,63,47,20));
        HashSet<Integer> copy=new HashSet<Integer>(Arrays.asList(16,54,67,63,47,20));
        HashSet<Integer> hs6=new HashSet<Integer>(Arrays.asList(6,54,61,63,17,20));
        HashSet<Integer> hs7=new HashSet<Integer>(Arrays.asList(6,61,17));

       //  System.out.println("hs5.removeAll(hs6) = " + hs5.removeAll(hs6));
        System.out.println("hs5 = " + hs5);

        System.out.println("hs5.removeAll(hs7) = " + hs5.removeAll(hs7));
        System.out.println("hs5 = " + hs5);

    }

}
