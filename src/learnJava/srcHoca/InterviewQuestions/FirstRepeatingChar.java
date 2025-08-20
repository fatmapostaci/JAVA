package learnJava.srcHoca.InterviewQuestions;

import java.util.HashSet;

public class FirstRepeatingChar {

    public static void main(String[] args) {
        //  Bir string içinde ilk tekrar eden karakteri bulun.

        String str = "iswiss";
        char sonuc = firstRepeatingChar(str);
        char sonuc2 = firstRepeatingChar(str);
        System.out.println("sonuc = " + sonuc);
        System.out.println("sonuc2 = " + sonuc2);
    }

    private static char firstRepeatingChar(String str) {
        HashSet<Character> set = new HashSet<>();
        char[] harfArr = str.toCharArray();
        for (char harf : harfArr){
            if (set.contains(harf)){
                return harf;
            } else {
                set.add(harf);
            }
        }
        return '\0';
    }
    public static char firstRepeatingChar2(String word) {

        char harf = 0;

        outer_loop:
        for (int i = 0; i < word.length(); i++) {

            for (int j = word.length() - 1; j > i; j--) {

                if (word.charAt(i) == word.charAt(j)) {
                    harf = word.charAt(i);
                    break outer_loop;
                }
            }
        }
        return harf;
    }
}
