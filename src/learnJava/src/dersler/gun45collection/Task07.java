package learnJava.src.dersler.gun45collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Task07 {
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

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(List.of("germany","france","USA"));
        if(linkedHashSet.contains("germany"))
            linkedHashSet.remove("germany");
        else System.out.println("SİLİNECEK ÖGE BULUNAMADI");

        System.out.println("linkedHashSet.remove() = " + linkedHashSet.removeAll(List.of("germany","france")));
        System.out.println("linkedHashSet = " + linkedHashSet);
        List<String> a = new ArrayList<>(linkedHashSet.reversed().stream().toList());
        System.out.println("a = " + a);
        System.out.println("a.remove(0) = " + a.remove("sdf"));


            LinkedHashSet<String> linkedHashSe = new LinkedHashSet<>(List.of("Germany", "France", "USA", "Canada", "Mexico", "Brazil"));
            String s1 = "Germany";
            String s2 = "USA";
            System.out.println("method öncesi linkedHashSet = " + linkedHashSe);
            removing(linkedHashSe, s1, s2);
            System.out.println("methos sonrası linkedHashSet = " + linkedHashSe);
        }

    private static LinkedHashSet<String> removing(LinkedHashSet<String> linkedHashSet, String s1, String s2) {
        if (linkedHashSet.contains(s1)) {
            linkedHashSet.remove(s1);
        } else {
            System.out.println(s1 + " setimizde kayıtlı değil");
        }
        if (linkedHashSet.contains(s2)) {
            linkedHashSet.remove(s2);
        } else {
            System.out.println(s2 + " setimizde kayıtlı değil");
        }
        return linkedHashSet;
    }

}
