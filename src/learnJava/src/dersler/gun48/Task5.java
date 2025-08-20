package learnJava.src.dersler.gun48;

import java.util.HashSet;

public class Task5 {
    public static void main(String[] args) {
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

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("banana");
        hashSet.add("strawberry");
        hashSet.add("kiwi");

    }


}
