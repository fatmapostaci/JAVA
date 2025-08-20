package learnJava.src.dersler.gun25;

import java.util.Arrays;
import java.util.List;

public class C15ArrayConvertToList {
    //King of Trick -> Array'dan liste cevirme yapıldıgında list kaynagı array oldugu için list array gibi davranır:
    //eleman akleme ve silme yapılamaz-> add() remove() method çalışmaz RTE verir.

    public static void main(String[] args) {
        String [] ulkeArr = {"Alamanya","Isvec","Danimarka","Belcika","Hollanda","Finlandiya"};
        List<String> ulkeList = Arrays.asList(ulkeArr);
        ulkeList.set(0,"Almanya");
        System.out.println("ulkeList.size() = " + ulkeList.size());
        //ulkeList.add("Türkiye"); // UnsupportedOperationException
        System.out.println("ulkeList = " + ulkeList);
    }
}
