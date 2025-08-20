package learnJava.src.Lambda;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class study1 {
    public static void main(String[] args) {


        Function<Integer, Integer> sayininKaresi = n -> {
            return n * n;
        };
        System.out.println("sayininKaresi.apply(3) = " + sayininKaresi.apply(3));

        Function<Character, Character[]> charArr =n-> new Character[] {n,(char)(n+1),(char)(n+2)};
        System.out.println("charArr.apply(r) = " + Arrays.toString(charArr.apply('r')));

        Integer[] intARR={3,4,5,6,7,8};
        Function<Integer[],String> intToString = Arrays::toString;
        System.out.println("intToString.apply(intARR) = " + intToString.apply(intARR));

        BiPredicate<String,Character> startWith = (s, c) -> s.charAt(0) == c;
        String s = "asd";
        System.out.println("startWith.test(\"a\") = " + startWith.test(s,'b'));

        Map<String,Integer> score = new HashMap<>();
        score.put("aaa",23);
        score.compute("asd2",23)

    }
}
