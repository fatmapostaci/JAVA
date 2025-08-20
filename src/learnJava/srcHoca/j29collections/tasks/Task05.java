package learnJava.srcHoca.j29collections.tasks;

import java.util.*;

public class Task05 {

        /*
    changeSet() isminde bir method oluşturun.
    Parametre olarak bir String HashSet   ve  iki String
    return hashset olmalı
    Eğer HashSet String 1 e sahipse, String 1 ile String 2 yi değiştirin.

    ÖRNEK:
    hashset = "banana" , "strawberry" , "kiwi" , "pineapple"
    String 1 = banana
    String 2 = peach
    CEVAP: "peach" , "strawberry" , "kiwi" , "pineapple"
     */

    public static void main(String[] args) {
        HashSet<String > hs = new HashSet<>(Arrays.asList("banana" , "strawberry" , "kiwi" , "pineapple"));
        String str1 = "banana";
        String str2 = "peach";
        System.out.println(hs);

        changeSet(hs,str1,str2);
        System.out.println(hs);

        changeSet2(hs,str1,str2);
        //System.out.println(hs);

/*
1. changeSet2 (Return Etmeyen Metot)
Avantajlar:
Basitlik: Metodun amacı sadece verilen HashSet üzerinde değişiklik yapmaksa,
gereksiz bir dönüş işlemi yapılmaz. Daha az kod ve daha doğrudan bir kullanım sağlar.
Bellek Kullanımı: Mevcut HashSet üzerinde değişiklik yaptığı için yeni bir nesne oluşturmaz,
bu da bellek açısından daha verimli olabilir. Yan Etkilerden Haberdarlık: Eğer metot üzerinde
çalışılan orijinal HashSet'i değiştiriyorsa, bu durum metodu çağıran tarafın farkında olması
gereken bir durumdur. Bu, bazen kullanışlı olabilir.

Dezavantajlar:
Görünürlük Eksikliği: Değişiklikler doğrudan HashSet üzerinde yapıldığı için, metodu çağıran kişi değişikliğin başarılı olup olmadığını açık bir şekilde göremez. Bu durum hata ayıklamayı zorlaştırabilir.
Test Edilebilirlik: Metot, çıktıyı döndürmediği için, test ederken HashSet'in değişip değişmediğini kontrol etmek ekstra çaba gerektirir.

Ne Zaman Tercih Edilmeli?
HashSet'in doğrudan değiştirilmesi kabul edilebilir bir durum olduğunda.
Dönüş değerine ihtiyaç duyulmadığında veya değişikliklerin sonucunu kontrol etmek önemli olmadığında.

 */

 /*
 2. changeSet (Return Eden Metot)
Avantajlar:
Görünürlük ve Anlaşılabilirlik: Metot, sonucu döndürdüğü için değişikliğin başarılı olup olmadığını daha net bir şekilde görmenizi sağlar.
Fonksiyonel Programlama Yaklaşımı: Yeni bir durum döndürmek, yan etkileri azaltır. Eğer HashSet üzerinde başka bir işlem yapılacaksa, dönüş değeri kullanılarak daha düzenli bir akış sağlanabilir.
Test Edilebilirlik: Metot, sonucu döndürdüğü için birim testlerde daha kolay kontrol edilebilir.
Dezavantajlar:
Performans Maliyeti: Eğer yeni bir HashSet yaratılıp döndürülürse, bu ekstra bellek ve işlem maliyeti oluşturabilir. (Ancak bu örnekte böyle bir durum yok.)
Karmaşıklık: Metodun dönüş değerinin her zaman doğru şekilde ele alınması gerekir. Göz ardı edilirse, değişikliklerin fark edilmemesi gibi sorunlar doğabilir.
Ne Zaman Tercih Edilmeli?
Değişikliğin sonucunun kontrol edilmesi gerektiğinde.
HashSet'in durumunun birden fazla yerden erişilebilir olduğu bir senaryoda, doğrudan yan etkiler yerine fonksiyonel bir yaklaşım kullanmak istediğinizde.
Özellikle değişiklik başarılı olmadığında bir bilgilendirme ya da geri dönüş gerekiyorsa.
  */




    }

    private static void changeSet2(HashSet<String> hs, String str1, String str2) {
        // Set
        for (String meyve:hs){
            if (meyve.equals(str1)){
                hs.remove(str1);
                hs.add(str2);
                return;
            }
        }
    }

    private static HashSet<String> changeSet(HashSet<String> hs, String str1, String str2) {
        // Set
        for (String meyve:hs){
            if (meyve.equals(str1)){
                hs.remove(str1);
                hs.add(str2);
                return hs;
            }
        }
        System.out.println("verilen "+ str1+ "listede bulunamadı");
        return hs;
    }
}
