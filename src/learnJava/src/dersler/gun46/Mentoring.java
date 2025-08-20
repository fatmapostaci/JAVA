package learnJava.src.dersler.gun46;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Mentoring {
    public static void main(String[] args) {

        //       Bir HashMap'de öğrenci adlarını ve notlarını saklıyoruz.
//        Öğrenciler ve notları aşağıdaki gibidir:
//        Ali = 85, Ayşe = 90, Mehmet = 75, Fatma = 95
//        Öğrencinin adını kullanıcıdan alın (örneğin: "Ali").
//        get metodunu kullanarak bu öğrencinin notunu ekrana yazdırın.
//        Eğer öğrenci haritada yoksa "Bu öğrenci bulunamadı." mesajını gösterin.

        Map<String, Integer> studentGrades = new HashMap<>();
        studentGrades.put("Ali", 85);
        studentGrades.put("Ayşe", 90);
        studentGrades.put("Mehmet", 75);

//    Bir şirketin çalışanlarının departman bilgileri bir HashMap ile saklanmaktadır:
//    Ahmet = IT, Ayşe = HR, Mehmet = Finance, Fatma = IT
//    entrySet metodunu kullanarak bu çalışanları ve departmanlarını ekrana yazdırın.
//    Çıktı, her bir çalışan ve departmanını yeni bir satırda göstermelidir.

        Map<String , String> employes = new HashMap<>();
        employes.put("Ahmet" , "IT");
        employes.put("Ayse" ,"HR");
        employes.put("Mehmet" , "Finance");
        employes.put("Fatma" , "IT");

       // Set<Map.Entry<String, String>>  entrySet = employes.entrySet();

        for (Map.Entry<String,String>  entry: employes.entrySet()){
            System.out.println(entry.getKey() +" , " + entry.getValue());
        }

        //        Öğrenci ve Notlarının Map'te İşlenmesi
//        Bir Map<String, Integer> kullanarak öğrencilerin isimlerini (anahtar) ve notlarını (değer) saklayın.
//        Görevler:


        Map<String, Integer> students = new HashMap<>();
        students.put("Ali", 45);
        students.put("Ayşe", 78);
        students.put("Mehmet", 90);
        students.put("Fatma", 65);
        students.put("Cem", 30);

        Set<Map.Entry<String, Integer>> studentsEntrySet = students.entrySet();
//        Öğrencilerin not ortalamasını hesaplayın.
//        En yüksek notu alan öğrenciyi bulun.
        Integer ortalama=0;
        int sayi = studentsEntrySet.size();
        int enbuyukNot=0;
        Map.Entry< String, Integer> basariliOgrenci = null;
        for (Map.Entry<String, Integer>  studentEntry :  studentsEntrySet ){

            ortalama += studentEntry.getValue();
            
            if( studentEntry.getValue()>enbuyukNot ){
                enbuyukNot=studentEntry.getValue();
                basariliOgrenci = studentEntry;
            }
        }
        ortalama = ortalama / sayi;
        System.out.println("ortalama = " + ortalama);
        System.out.println("basariliOgrenci = " + basariliOgrenci.getKey());


        //        50'nin altındaki notları silin.
        Iterator<Map.Entry<String, Integer>> iterator = studentsEntrySet.iterator();
       while (iterator.hasNext()){
            if( iterator.next().getValue() < 50 ){
                iterator.remove();
            }
        }
        System.out.println("students = " + students);
    }
}
