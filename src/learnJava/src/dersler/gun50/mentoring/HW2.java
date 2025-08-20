package learnJava.src.dersler.gun50.mentoring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HW2 {

    public static void main(String[] args) {

        //  map() --> M E T H O D  R E F E R A N S  ile çözelim

        List<Integer> sayiList = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        //  listedeki sayıların her birine 3 ekleyip , karekokunu alıp 7 azaltalım

        List<Integer> updatedList =sayiList.stream()
                .map(MethodReference::ucEkle)
                .map(MethodReference::kareKokAl)
                .map(MethodReference::yediAzalt)
                .toList();
        System.out.println("updatedList = " + updatedList);

        //  her bir elemana 3 ekleme methodu olsun :: method referansı kullanacak şekilde cevaba entegra edelim
        //  her bir elemanın karekökünü alma methodu olsun :: method referansı kullanacak şekilde cevaba entegra edelim
        //  her bir elemanadan 7 azaltma methodu olsun :: method referansı kullanacak şekilde cevaba entegra edelim



    }
}
