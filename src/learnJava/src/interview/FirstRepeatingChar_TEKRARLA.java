package learnJava.src.interview;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatingChar_TEKRARLA {
    public static void main(String[] args) {
        //Bir string içinde ilk tekrar eden karakteri bulun.

        // Input:  "swiss"
        // Output: 's'


        String input = "swwiss";
        char output = ' ';
        outerLoop:
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j < input.length(); j++) {
                if (input.charAt(i) == input.charAt(j)) {

                    output = input.charAt(i);
                    break outerLoop;
                }
            }
        }
        System.out.println("output = " + output);

//ikinci yoll  ----SET YAPISINA EKLEME İLE
        char[] harfArr = "swiss".toCharArray();
        Set<Character> set = new HashSet<>();


        for (char harf : harfArr)
            if (set.contains(harf))
                output = harf;
            else
                set.add(harf);


        System.out.println("output = " + output);


    }
}
