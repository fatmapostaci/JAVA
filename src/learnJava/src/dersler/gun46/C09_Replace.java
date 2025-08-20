package learnJava.src.dersler.gun46;

import java.util.HashMap;

public class C09_Replace {
    //map.replace();-> girilen  value değeri ilgili Key'de update edilip oldValue(update öncesi eski value) return edilir.

    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();

        map.put("tester1@tes.com","tester1"); // --> Entry girildi
        map.put("tester2@tes.com","tester2");
        map.put("tester3@tes.com","tester1");
        map.put("tester4@tes.com","tester4");
        map.put("tester5@tes.com","tester5");

        // İki parametreli replace() key varsa değeri update eder ve değiştirilen değeri döner
        System.out.println("replace öncesi map = " + map);

        String oldStrFalse = map.replace("tester2",null); // Key uymadığı için güncelleme yapmaz
        String oldStrTrue = map.replace("tester2@tes.com",null); // Key uyduğu için güncelleme yapar

        System.out.println("oldStrFalse = " + oldStrFalse);
        System.out.println("oldStrTrue = " + oldStrTrue);

        System.out.println();
        // Üç parametreli replace key ve value değerlerinin ikiside uyumlu ise güncelleme yapar
        map.replace("tester2",null,"tester"); // key uymadığı için güncelleme yapılmaz
        map.replace("tester2@tes.com","null","tester"); // value uymadığı için güncelleme yapılmaz
        map.replace("tester2@tes.com",null,"tester"); // key ve value uyumu oldu için güncelleme yapılır

        System.out.println("replace sonrası map = " + map);


    }
}
