package learnJava.srcHoca.j30maps.tasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task01 {
         /*
        Task ->
         Key:isim ,email,adres,telefon
         Key'lere ait value'leri depolayan bir kartvizit  map ve isim Key'e kartvizit map'i value tanımlayan farklı bir map tanımlayıp
         print eden code create ediniz.
         */

    public static void main(String[] args) {

        HashMap<String,String> kartvizitMap = new HashMap<>();
        HashMap<String,String> kartvizitMap2 = new HashMap<>();

     // Mapleri Listeye atarak çözüm
        kartvizitMap.put("isim","Sengul Hanım");
        kartvizitMap.put("email","test@deneme.com");
        kartvizitMap.put("adres","Birmingham, London");
        kartvizitMap.put("telefon","0555 555 55 55");

        kartvizitMap2.put("isim","Mertay Bey");
        kartvizitMap2.put("email","test02@deneme.com");
        kartvizitMap2.put("adres","İzmir");
        kartvizitMap2.put("telefon","0555 555 55 56");

        List<HashMap<String,String>> kartvizitList = new ArrayList<>();
        kartvizitList.add(kartvizitMap);
        kartvizitList.add(kartvizitMap2);

        System.out.println("kartvizitMap = " + kartvizitMap);
        System.out.println("kartvizitList = " + kartvizitList);

        // Pojo ile çözüm
        Task01Pojo kv1 = new Task01Pojo("Sengul Hanım","test@deneme.com","Birmingham, London","0555 555 55 55");
        Task01Pojo kv2 = new Task01Pojo("Mertay Bey","test2@deneme.com","İzmir","0555 555 55 56");

        HashMap<String,Task01Pojo> kartvizitler = new HashMap<>();

        kartvizitler.put("Sengül Hanım",kv1);
        kartvizitler.put("Mertay Bey",kv2);

        System.out.println("kartvizitler.get(\"Sengül Hanım\").getEmail() = " + kartvizitler.get("Sengül Hanım").getEmail());
        System.out.println("kartvizitler.get(\"Mertay Bey\") = " + kartvizitler.get("Mertay Bey"));

        // Taskin orijinal olarak istediği çözüm

        // kartvizitMap ve kartvizitMap2 zaten oluşturuldu bu mapleri value olarak kullanan map oluşturacağız
        HashMap<String,HashMap<String ,String>> disMap = new HashMap<>();

        disMap.put("Sengül Hanım",kartvizitMap);
        disMap.put("Mertay Bey",kartvizitMap2);

        System.out.println("disMap = " + disMap);

        // nested yapılarda nested loop kullanımı
             // Data Type name : Collection

        for (Map.Entry<String,HashMap<String ,String>> disEntry : disMap.entrySet()){
            System.out.println("Key (isim) = " + disEntry.getKey());
            System.out.println("Kart vizit Detayları :");
            for (  Map.Entry<String,String> icEntry: disEntry.getValue().entrySet()){
                System.out.println("    "+icEntry.getKey() + " = " + icEntry.getValue());
            }
        }


        /*
        // İç mapteki datayı nasıl çağırırız:
        // Mertay beyin Tel nosunu getirin
        System.out.println("disMap.get(\"Mertay Bey\").get(\"telefon\") = " + disMap.get("Mertay Bey").get("telefon"));

        disMap.get("Mertay Bey").replace("telefon","500 000 00 00");
        System.out.println("disMap = " + disMap);

        kartvizitler.get("Mertay Bey").setTelefon("bu şekilde");
        System.out.println("kartvizitler = " + kartvizitler);

        */

    }
}
