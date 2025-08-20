package learnJava.src.interview;

import java.util.*;

public class findDuplicatsOfString_TEKRARLA {

    public static void main(String[] args) {
        String input = "Teeest Auteeomation";

        findDuplicates3(input);
        findDuplicates(input);

        findDuplicates2(input);
    }

    private static void findDuplicates(String input) {

        char[] inputCharArr = input.
                toLowerCase().
                replace(" ", "").
                toCharArray();

        Map<Character, Integer> duplicateChars = new HashMap<>();

        for (char c : inputCharArr) {
            // if(!charCounter.containsKey(inputCharArr[i]))
            duplicateChars.put(c, duplicateChars.getOrDefault(c, 0) + 1);
        }
        System.out.println("duplicateChars  =   " + duplicateChars);

        for(Map.Entry<Character,Integer>  entry: duplicateChars.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }

    private static void findDuplicates2(String input) {

        String[] arrInput = input.toLowerCase().replace(" ", "").split("");
        int counter = 0;
        Map<String, Integer> duplicates = new HashMap<>();
        for (int i = 0; i < arrInput.length; i++) {

            for (int j = 0; j < arrInput.length; j++) {
                if (arrInput[i].equals(arrInput[j])) {
                    counter++;

                }
            }
            if (counter > 1)
                duplicates.put(arrInput[i], counter);
            counter = 0;
        }

        System.out.println("t " +duplicates);
    }


    private static void findDuplicates3(String input) {
        input = input.toLowerCase().replace(" ", "");
        Map<Character, Integer> counterOfDuplicates = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {

            char temp = input.charAt(i);
            if(counterOfDuplicates.containsKey(temp))
                counterOfDuplicates.put(temp, counterOfDuplicates.get(temp) + 1);
            else
                counterOfDuplicates.put(temp,1);
        }
        System.out.println("counterOfDuplicates = " + counterOfDuplicates);
    }


}