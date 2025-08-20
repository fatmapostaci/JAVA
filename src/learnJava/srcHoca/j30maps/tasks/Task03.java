package learnJava.srcHoca.j30maps.tasks;

import java.util.TreeMap;

public class Task03 {

    //Task->   TreeMap Kullanarak Bir cumlenin içindeki harflerin frekansını(adetini) hesaplayıp print  code create ediniz

    public static void main(String[] args) {

        String cumle = "TreeMap Kullanarak bir cumlenin icindeki harflerin frekansını hesaplayınız.";

        TreeMap<Character,Integer> frequencyMap = new TreeMap<>();

        for (char harf : cumle.toCharArray()){
            harf = Character.toLowerCase(harf); // harfleri lowercase çevirerek büyük küşük ayrımını kaldırdık
            if (Character.isLetter(harf)){  // Harflerin kontrolünü sağladık
                frequencyMap.put(harf,frequencyMap.getOrDefault(harf,0)+1);
            }
        }

        System.out.println(frequencyMap);
    }
}
