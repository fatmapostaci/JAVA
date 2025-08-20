package learnJava.src.dersler.gun44;

import java.util.*;

public class Task_Sets {

             /*
     Set :  1) unique(benzersiz tek) elemanlardan olusur, Set'lerin icinde bir eleman sadece bir kere kullanilabilir. mükerrer(duplicate) eleman olmaz.
            2) sadece bir null değeri alabilir.(treeSet hariç).Java elementleri unique yapmak icin HASH ALGORITMASI kullanir.
                 Java her data icin hashing teknigini kullanarak bir code uretir.Bu code'u almak icin hashCode() methodu kullanilir.
                 Hashing, farklı büyüklükteki girdilerden sabit büyüklükte bir çıktı oluşturma sürecine verilen isimdir.
                 Universitelerdeki ogrenci numaralari gibi bir ogrenci ismi soruldugunda numarasini bulursaniz onunla ilgili tum datalara ulasilabilir.


            Set     --> HashSet         : 1) HashSet, duplication'a(tekrarlı eleman) izin vermez.
                                            Eger bir elemani tekrar HashSet'e eklemek isterseniz eski olan silinip, yeni olan uzerine yazilir.
                                          2) Haset'ler Set'ler arasinda en hizli olanıdir. bir algoritmaya göre kayit eder.
                                           değerlerin giriş sırasına dikkat edilmez. (LinkedHashSet hariç)
                                          3) HashSet "null" object'ini eleman olarak kullanabilir.
                                          Ancak birden fazla null degerini bir HashSet'e eklemek isterseniz sadece bir tane null degeri olur.

                        LinkedHashset   : 1) Tekrarli eleman kabul etmezler. Elemanlari ekleme sirasina(insertion order) gore dizerler.
                                          2) LinkedHashSet, HashSet'den daha yavas calisir.
                                          3) LinkedHashSet "null" object'ini eleman olarak kullanabilir.
                                          4) Ekleme ve remove islemlerinde hizlidirlar.

                        TreeSet         : 1) TreeSet tekrarli eleman kabul etmez, cunku Set'dir.
		                                  2) Elemanlari natural Order'a(String ise alfabetik, sayi ise kucukten buyuge) gore dizer.
		 	                              3) TreeSet, setlerin en yavasidir. Bu yuzden TreeSet kullanirken dikkatli olunmalı...
		 	                              4)AHAN DA TRİCK :TreeSet "null" object'ini eleman olarak kullanilamaz.


         Set Methods :
            .add(eleman);-->Set'e eleman ekler
            .addAll(collection);-->istenen collection'in tum elemanlarini ekler
            .contains(eleman);-->istenen eleman set'te varsa true, yoksa false return eder.
            .containsAll(collection);-->istenen collection'in tumu aranan sette var ise true, yoksa false return eder.
            .remove(eleman);-->istenen eleman bulursa siler ve true dondurur, bulamazsa false return eder.
            .removeAll(collection);-->istenen collection'in tum elemanlarini bulursa siler ve true dondurur, bulamazsa false return eder.
            .equlas(set2);-->istenen set2’le tum elemanlar ayni ise true, yoksa false return eder.
            .retainAll(collection1);-->collection1’nin elemanlarinin disindaki tum elemanlari siler, silme islemi yapti ise true, yoksa false return eder.
              (kesişen ortak elemanları döndürür.)
            .clear();-->sett'teki Tum elemanlari siler
            .isEmpty();-->Sette hic eleman yoksa true, varsa false return eder
            .size();-->set'in eleman sayisini verir

     */
             public static void main(String[] args) {
                 LinkedList<String> linkedList = new LinkedList<>(List.of("küsleme","antep doner","kuzu pirzola","Menemen"));

                 HashSet<String> yemekSet = new HashSet<>();
                 yemekSet.add("Menemen");
                 yemekSet.add("Omlet");
                 yemekSet.add("Sahanda Yumurta");
                 yemekSet.add("küsleme");

                 System.out.println("yemekSet = " + yemekSet);

                 HashSet<String> yemekHashSet = new HashSet<>(linkedList);
                 LinkedHashSet<String> yemekLinkedSet = new LinkedHashSet<>(linkedList);
                 TreeSet<String> yemekTreeSet = new TreeSet<>(linkedList);

                 System.out.println("yemekHashSet = " + yemekHashSet);
                 System.out.println("yemekLinkedSet = " + yemekLinkedSet);
                 System.out.println("yemekTreeSet = " + yemekTreeSet);

                 yemekHashSet.add("Kuzu Pirzola");
                 yemekLinkedSet.add("Kuzu Pirzola");
                 yemekTreeSet.add("Kuzu Pirzola");

                 System.out.println("ekleme yemekHashSet = " + yemekHashSet);
                 System.out.println("ekleme yemekLinkedSet = " + yemekLinkedSet);
                 System.out.println("ekleme yemekTreeSet = " + yemekTreeSet);

                 yemekHashSet.add("Kuzu Pirzola");
                 yemekLinkedSet.add("Kuzu Pirzola");
                 yemekTreeSet.add("Kuzu Pirzola");

                 System.out.println("tekrarlı yemekHashSet = " + yemekHashSet);
                 System.out.println("tekrarlı yemekLinkedSet = " + yemekLinkedSet);
                 System.out.println("tekrarlı yemekTreeSet = " + yemekTreeSet);


                 yemekHashSet.add(null);
                 yemekLinkedSet.add(null);
                // yemekTreeSet.add(null); tree set e null eklenemez

                 System.out.println("null yemekHashSet = " + yemekHashSet);
                 System.out.println("null yemekLinkedSet = " + yemekLinkedSet);
                 System.out.println("null yemekTreeSet = " + yemekTreeSet);

                 yemekHashSet.addAll(yemekSet);
                 yemekLinkedSet.addAll(yemekSet);
                  yemekTreeSet.addAll(yemekSet);

                 System.out.println("Collection ekleme yemekHashSet = " + yemekHashSet);
                 System.out.println("Collection ekleme yemekLinkedSet = " + yemekLinkedSet);
                 System.out.println("Collection ekleme yemekTreeSet = " + yemekTreeSet);

                 yemekHashSet.remove("kusleme");
                 yemekLinkedSet.remove("kusleme");
                 yemekTreeSet.remove("kusleme");

                 System.out.println("remove yemekHashSet = " + yemekHashSet);
                 System.out.println("remove yemekLinkedSet = " + yemekLinkedSet);
                 System.out.println("remove yemekTreeSet = " + yemekTreeSet);

                 System.out.println("yemekHashSet.removeAll(yemekSet) = " + yemekHashSet.removeAll(yemekSet));
                 System.out.println("yemekLinkedSet.removeAll(yemekSet) = " + yemekLinkedSet.removeAll(yemekSet));
                 System.out.println("yemekTreeSet.removeAll(yemekSet) = " + yemekTreeSet.removeAll(yemekSet));

                 System.out.println("removeAll yemekSet yemekHashSet = " + yemekHashSet);
                 System.out.println("removeAll yemekSet yemekLinkedSet = " + yemekLinkedSet);
                 System.out.println("removeAll yemekSet yemekTreeSet = " + yemekTreeSet);






             }
}
