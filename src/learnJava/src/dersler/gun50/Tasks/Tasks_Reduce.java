package learnJava.src.dersler.gun50.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Tasks_Reduce {
              /*
        reduce()-->azaltmak ... bir cok datayi tek bir dataya(max min carp top vs islemlerde) cevirmek icin kullanilir.
        kullanımı yaygındır pratiktir.
        Bir Stream içerisindeki verilerin teker teker işlenmesidir. Teker teker işleme sürecinde, bir önceki adımda elde edilen sonuç
        bir sonraki adıma girdi olarak sunulmaktadır. Bu sayede yığılımlı bir hesaplama süreci elde edilmiş olmaktadır.
        reduce metodu ilk parametrede identity değeri, ikinci parametrede ise BinaryOperator türünden bir obj kullanılır.
        reduce işleminde bir önceki hesaplanmış değer ile sıradaki değer bir işleme tabi tutulmaktadır.
        İşleme başlarken bir önceki değer olmadığı için bu değer identity parametresinde tanımlanmaktadır.

        */

    public static void main(String[] args) {

        List<Integer> sayiList = new ArrayList<>(Arrays.asList(7, 58, 17, 35, 32, 25, 1));

        System.out.println("****Task01****");
        //Task01-> list çift elemanlarının karelerinin en buyugunu print code create ediniz...


        Integer max = sayiList.stream()
                .filter(SeedMethods::isEven)
                .map(SeedMethods::karesiniAl)

                        //.reduce(Math::max)
                        //.reduce(Integer::compare)
                        //.reduce( (t,u)-> t>u ? t : u )
                .reduce(SeedMethods::maxBul)
                .get();
        System.out.println("max = " + max);


        Optional<Integer>  max2 =
                        sayiList.stream()
                        .filter(SeedMethods::isEven)
                        .map(SeedMethods::karesiniAl)
                        //.reduce(Math::max)
                        //.reduce(Integer::compare)
                        .reduce( (t,u)-> t>u ? t : u )
                        //.reduce(SeedMethods::maxBul)
                        ;
        System.out.println("max2.orElse(0) = " + max2.orElse(0));


        if(max2.isPresent()) {
            System.out.println("max2.get() = " + max2.get());
        }
        else System.out.println("max2.isEmpty() = " + max2.isEmpty());


        System.out.println("max = " + max);

        Integer maximum =
                sayiList
                        .stream()
                        .reduce( sayiList.getFirst() , (Math::max) );   //

        //max2.ifPresent();
        //max2.orElseGet();

        System.out.println("maximum = " + maximum);

        System.out.println("\n****Task02****");
        //Task02-> list elemanlarının toplamını  print code create ediniz...
        listElemanlarininToplami(sayiList);
        System.out.println("\n****Task03****");
        //Task03-> list'in çift elemanlarının çarpımını  print code create ediniz...
        listElemanlarininCarpimi(sayiList);

        System.out.println("\n****Task04****");
        //Task04-> list elemanlarının en küçüğünü  print code 4 farklı code create ediniz...
        listElemanlarininEnKucugu(sayiList);

        System.out.println("\n****Task05****");
        // Task05-> List elemanlarının 25'den buyuk en kucuk tek elemanını print eden code create ediniz...  public static void main(String[] args) {

    }

    private static void listElemanlarininCarpimi(List<Integer> sayiList) {

    }

    private static void listElemanlarininEnKucugu(List<Integer> sayiList) {
        Integer enKucuk =
                sayiList.stream()
                        .reduce((u,v)->u>v?v:u)
                        .get();
        System.out.println("enKucuk = " + enKucuk);

        Optional<Integer> min =  sayiList.stream().reduce(Math::min);
        System.out.println("min = " + min);

        Integer min2 = sayiList.stream().reduce(Integer.MAX_VALUE,Math::min);
        System.out.println("min2 = " + min2);

    }

    private static void listElemanlarininToplami(List<Integer> sayiList) {

        Integer sum =
                sayiList.stream()
                        .filter(SeedMethods::isEven)
                        .map(SeedMethods::karesiniAl).reduce(0,Math::addExact);

    }
}
