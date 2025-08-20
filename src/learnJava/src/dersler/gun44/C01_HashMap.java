package learnJava.src.dersler.gun44;

import java.util.ArrayList;
import java.util.HashMap;

public class C01_HashMap {
            /*  Map bir interface'dir. Map interface'inin 3 tane child class'i vardir

        1) HashMap: HashMap key-value yapisini kullanir. Key ve value   programci tarafindan yazilir. Key değeri benzersiz(unique) olmalı
                    dublicate kabul etmez.
                    Key ve value'da null degeri kullanilabilir. Key'de  1'den fazla null degeri kullanilirsa Java son kullanilan
                    null'i kabul eder. Value'da 1'den fazla null degeri kullanilabilir.
                    HashMap  print edildiğinde hem key degerleri hem de value degerleri aralarina = sembolu konularak print eder
                    HashMap'ler tanımlanırken rastgele(hurra style) siralama yapar  HasMap map'ler arasinda en hizlisidir.
                    HashMap'ler "thread safe" degildir.
         */
            public static void main(String[] args) {

                // Hash map Tanımlama:
                HashMap<Integer,String> map1 = new HashMap<>();
                HashMap<String,String> map2 = new HashMap<>();
                HashMap<String, ArrayList<String>> map3 = new HashMap<>(); // Map farklı data türlerininde tanımlanabilir.

                // Map'e Entry girme: (Entry = girdi) --> put(),putIfAbsent(),putAll();
                map2.put("tester1@tes.com","tester1"); // --> Entry girildi
                map2.put("tester2@tes.com","tester2");
                map2.put("tester3@tes.com","tester1"); // dublicate value girilebilir
                map2.put("tester3@tes.com","tester3"); // dublicate key olmaz, yeni value önceki value yu ezer.
               // map2.putIfAbsent("tester3@tes.com","tester785"); // key mapte varsa atama yapmaz yoksa oluşturur
                map2.put(null,"tester2");
                map2.put(null,"tester56"); // Key için dublicate null olmaz sadece bir tane null key olur

                map2.put("tester4@tes.com",null);
                map2.put("tester5@tes.com",null); // value için dublicate null olur

     // Map nasıl yazdırılır:
                System.out.println("map2 = " + map2);


            }

}
