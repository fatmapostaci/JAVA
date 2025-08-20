package learnJava.src.interview;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class letterCounter {
    public static void main(String[] args) {

        // String te tekrarlayan karakterleri ve tekrarlama sayılarını yazdırın
        String input = "Test Autoooomation";
        findDuplicateLetters(input);

    }

    private static void findDuplicateLetters(String input) {
        char [] charArrayOfInput =input.toLowerCase().replace(" ","").toCharArray();
        Map<Character, Integer> foundCharsMap = new TreeMap<>();

        for (char c : charArrayOfInput){

            if(foundCharsMap.containsKey(c))
                foundCharsMap.put(c,foundCharsMap.get(c)+1);
            else
                foundCharsMap.put(c,1);

        }

        for (Map.Entry<Character,Integer> entry : foundCharsMap.entrySet() )
                System.out.println(entry.getKey() + " : " + entry.getValue());
    }
}
