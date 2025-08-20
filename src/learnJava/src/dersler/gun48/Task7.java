package learnJava.src.dersler.gun48;

import java.util.LinkedHashSet;
import java.util.List;

public class Task7 {
        /*
    removing() isminde bir method oluşturun.
    Parametre olarak bir LinkedHashset ve iki String ten oluşmalı.
    Eğer Stringler LinkedHashset 'in içinde varsa, sil.
    Return tipi linkedhashset
    Örneğin,
    linkedhashset : Germany , France , USA , Canada , Mexico , Brazil
    String 1= Germany
    String 2 = USA
     Germany ve USA 'i sil.
    Set'i döndür.
     */
        public static void main(String[] args) {
            LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(List.of("Germany" , "France" , "USA" , "Canada" , "Mexico" , "Brazil"));
            String s1 = "Germany";
            String s2 = "USA";
            removing(linkedHashSet,s1,s2);
        }

    private static LinkedHashSet<String> removing(LinkedHashSet<String> linkedHashSet, String s1, String s2) {


            if (linkedHashSet.contains(s1) )
                linkedHashSet.remove(s1);
            else System.out.println(s1 + "silinemedi");
            if (linkedHashSet.contains(s2) )
                linkedHashSet.remove(s2);
            else System.out.println(s2 + "silinemedi");

            return linkedHashSet ;
    }
}
