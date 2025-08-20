package learnJava.src.dersler.gun24;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Tasks {
    public static void main(String[] args) {
        List<String> isimler = new ArrayList<>(Arrays.asList("fatma","bilal","zeynep","ahmet"));
        List<String> ulkeler = new ArrayList<>(List.of("sdff","asd","asd"));

//nCopies(int n, Obj)-> n elemanlı sabit obj'den oluşan list tanımlar
        List<String> ekulkeler = new ArrayList<>(Collections.nCopies(3,"tanzanya"));
        System.out.println("ekulkeler = " + ekulkeler);

        System.out.println("ulkeler = " + ulkeler);
//bir listin sonuna başka bir listi ekler
        ulkeler.addAll(ekulkeler);
        System.out.println("ulkeler = " + ulkeler);
//bir list e başka bir listi verilen index in olduğu konumdan itibaren araya ekler
        ulkeler.addAll(1,ekulkeler);  //1.index in olduğu yere ekler

        System.out.println("ulkeler = " + ulkeler);

        // names ArrayListine names i ekleyiniz...
        isimler.addAll(isimler);
        System.out.println("isimler = " + isimler);
    }
}
