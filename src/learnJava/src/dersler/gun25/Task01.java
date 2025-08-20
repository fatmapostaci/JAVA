package learnJava.src.dersler.gun25;

public class Task01 {
        /*
        Task -> verilen Stringleri birlestiren concat isimli METHOD create ediniz.

        input : "h", "a", "l", "u", "k";
        output : haluk

        input : "a", "l", "i";
        output : ali
         */

    public static void main(String[] args) {
        System.out.println(concatStr("H", "a", "l", "u", "k"));
        System.out.println(concatStr("a", "l", "i"));
    }
    public static String concatStr(String ... harfler){
        String kelime = "";
        for (String harf:harfler){
            //kelime+=harf;
            kelime = kelime.concat(harf);
        }
        return kelime;

       /*  Tuğba Hanımın katkılarıyla...
        String kelime = "";
        List<String> harfList =  Arrays.asList(harfler);
        kelime =kelime.concat(harfList.getFirst().toUpperCase());
        for (String harf:harfList.subList(1,harfList.size())){
            //kelime+=harf;
            kelime = kelime.concat(harf);
        }
        return kelime;

        */
    }
}
