package learnJava.srcHoca.InterviewQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class DuplicateCharacters {
    public static void main(String[] args) {
        // String te tekrarlayan karakterleri ve tekrarlama sayılarını yazdırın
        String input = "Test Automation";
        findDuplicates2(input);
    }


    public static void findDuplicates2 (String input){


        input = input.replace(" ","").toLowerCase();
        String[] arr = input.split("");

        Map<String, Integer> myMap = new LinkedHashMap<>();

        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = arr.length - 1; j >= 0; j--) {

                if (arr[i].equals(arr[j])) {
                    count++;
                    }
                if (count>1){
                    myMap.put(arr[i], count);
                }
            }
            count = 0;
        }
        System.out.println(myMap);


    }



    public static void findDuplicates(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        char[] charArr = str.
                strip().
                replace(" " , "").
                toLowerCase().
                toCharArray();

        System.out.println(Arrays.toString(charArr));

        for (char w : charArr){
            charCountMap.put(w,charCountMap.getOrDefault(w,0)+1);

        }

        for (Map.Entry<Character,Integer> entry : charCountMap.entrySet()){
            if (entry.getValue() >1){
                System.out.println( entry.getKey() + " = "+ entry.getValue());
            }
        }


    }
}



