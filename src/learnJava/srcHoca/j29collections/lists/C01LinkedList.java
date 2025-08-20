package learnJava.srcHoca.j29collections.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class C01LinkedList {

             /*
        LinkedList .....
        1- LinkedList'de elemanlar "data" ve "adress"(next) olmak uzere iki kısımdan oluşur ve eleman yerine "node" olarak tanımlanır.
        2- LinkedList'te ilk node data barındırmayan sadece adres bulunduran "head" node tanımlanmıştır.
        3- LinkedList'te son node adres kısmı null olan sadece data bulunduran "tail" node tanımlanmıştır.
        4- ArrayList searching LinkedList node ekleme(add) ve silmede(remove) daha avantıjlıdır.
        5- LİnkedLİst -> tren vagon ilşikisi baglantısı gibi düşünülebilir
        6- Collection obj tanımlanırken cons Class(LinkedList,ArrayList...) olmalı interface(List, Queue ...) olmamasına dikkat edilmeli
            Ancak obj DataType olarak parent interface tanımlanabilir.
        7- LinkedList class iki tane parent interface'den(List,Queue) implement etmiştir.
         */

    public static void main(String[] args) {
        /*
Hangi Durumda Hangisini Kullanmalıyım?

LinkedList:
Ekleme ve silme işlemleri sıkça yapılacaksa.
Rastgele erişim gerekmiyorsa.
Bellek kullanımı kritik değilse.

ArrayList:
Rastgele erişim gerekiyorsa.
Elemanlar sık sık eklenip silinmeyecekse.
Bellek kullanımı önemliyse.

Bir müzik çalma listesi (Playlist):
LinkedList: Şarkılar arasında sık geçiş yapılacaksa ve ekleme/silme çoksa.
ArrayList: Şarkı listesi sabitse ve hızlı erişim gerekiyorsa.
 */

        ArrayList<String> arrList = new ArrayList<>();
        arrList.add("mesela");

        LinkedList<String> linkedList = new LinkedList<>(List.of("küşleme", "göveç", "soğan kebap", "ankara doner", "kuzu gerdan", "acıl antep tava", "şaşlık"));
        LinkedList<String> linkedList2 = new LinkedList<>(List.of("künefe","baklava","tulumba"));

        // Linked listi yazdırmak:
        System.out.println("linkedList = " + linkedList);

        // Node eklemek:
        linkedList.add("Tepsi Kebabı"); // [küşleme, göveç, soğan kebap, ankara doner, kuzu gerdan, acıl antep tava, şaşlık, Tepsi Kebabı]

        linkedList.addFirst("İskender"); // [İskender, küşleme, göveç, soğan kebap, ankara doner, kuzu gerdan, acıl antep tava, şaşlık, Tepsi Kebabı]

        linkedList.addLast("Sarma");

        linkedList.addAll(linkedList2);

        linkedList2.addAll(1,linkedList2);

        System.out.println("linkedList2 = " + linkedList2);

        System.out.println("linkedList = " + linkedList);

        ArrayList<String> arr = new ArrayList<>(linkedList); // LinkedListi arrayListe dönüştürdük
        System.out.println("arr = " + arr);

    }
}
