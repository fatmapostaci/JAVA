package learnJava.src.codeChallenge.gun5;

import java.util.ArrayList;
import java.util.Arrays;

public class Dummy {

    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>(Arrays.asList("yellow" , "red" , "blue" , "red" , "blue"));
        ArrayList<String> strList2 = new ArrayList<>(strList);
        ArrayList<String> strList1 = strList;

        strList.clear();
        strList.add("yeni");
        strList1.add("daha yeni");
        strList2.add("farklı");
        System.out.println("strList = " + strList);
        System.out.println("strList1 = " + strList1);
        System.out.println("strList2 = " + strList2);
    }
}
