package learnJava.src.dersler.gun23;

import java.util.*;

public class C01ArrayList {
             /*
     Array List genel Tanimi:

            ArrayList<Type> arrayListName  =new ArrayList<Type>();
                 List<Type> arrayListName = new ArrayList<>();
                 <> : Diamond oparatörü type güvenşiğini (tek türde data saklamayı) sağlıyor.

             1. Type : String, Integer, Double, Long, Byte, Short, Boolean, Object, .... seklinde Class olmalidir
                - ArrayList<int> hatali bir tanimlamadir. Type Wrapper Class gibi object türünden olmalidir


            2.  - Arrayler degistirilemez sabit bir .length;'de tanimlanir.
                - ArrayList'ler degistirilebilir size(); belirleme zorunlulugu olmadan tanimlanır.
            3.  Intellij sonda bos biralikan <> yerine <~> seklinde ifade yazabilir bu ifade tanimdaki tür ile ayni anlamindadir.

    List declarations(tanımlama) :
    Array den farki boyut esnekleğidir.Array'lerde length sabittir, degistirilemez. ArrayList'lerde (List) length esnektir.
     eleman ekledikce List size'ini artirir,  eleman sildikce List size'ini azaltir.


    key word: List<Wrapper Class> name=

    List'e assaign etme(atama) :
    List'ler data type olarak primitive'leri kabul etmez. Primitive'lerde data type'ini non-primitive yapmak icin wrapper class'lari kullanilir.
    List<primitive Data Type> name = new List<>()      *****yanlışşşşşşş (<> :jenerik wrapper Class dan parametre alır.)
    List<wrapper Class> name = new ArrayList<>() *****doğru
    List<wrapper Class> name = new ArrayList<Wrapper Class>() *****doğru->best practice
    ArrayList<wrapper Class> name = new ArrayList<>()  *****doğru

    List'e ilk değer atama (initialize):....
    1.yol : asList();
    ArrayList<Integer> sayı= new ArrayList<>(Arrays.asList(1,2,3)) demek 1,2,3 elemanlarini array olarak al demektir.
    2.yol : Listof();
    ArrayList<String> ulkeler= new ArrayList<String>( List.of("Almanya", "Fransa", "Ingiltere", "Ispanya", "Italya") );

    ArrayList ler array'lerin aksine direkt olarak ekrana yazdirilabilirler-->  print için:  System.out.println(name);
    Array'ler Arrays.toString(arrayAdi); ile print edilir.


    Collections ==> Bir araya getirilmis parcalar anlamına gelir. ArrayList, Set, Vector, Queue ler java collections sınıfı nesneleridir.

 */

    public static void main(String[] args) {

       ArrayList<String > namesList =  new ArrayList<>(); // ArrayList data türünde
       List<String > countryList =  new ArrayList<String>(); // List data türünde data dönüşümünde (diğer list türlerine) avantajlı

        // Deger ataması yapma
        // 1. add() metodu ile

       namesList.add("John"); // [John]
       namesList.add("Tom");  // Yeni element listenin sona eklenir
       namesList.add("Hillary");
       namesList.add("Ted"); // [John, Tom, Hillary, Ted]

                // Herhangi bir sıraya eleman eklemek için add(index, element)
       namesList.addFirst("Marry");//[Marry, John, Tom, Hillary, Ted]
       namesList.add(3,"Ali");// [Marry, John, Tom, Ali, Hillary, Ted]
        //namesList.add(7,"Son"); // IndexOutOfBoundsException

              // addAll Metdodu toplu olarak bir arraylisti ekler:
        ArrayList<String> namesEkList = new ArrayList<>();
        namesEkList.add("Sen");
        namesEkList.add("Ben");
        namesEkList.add("O");
        namesList.addAll(namesEkList); // [Marry, John, Tom, Ali, Hillary, Ted, Sen, Ben, O]
        namesList.addAll(1,namesEkList); // [Marry, Sen, Ben, O, John, Tom, Ali, Hillary, Ted, Sen, Ben, O]

        // Arrays.asList() metoduyla başlangıçta toplu değer tanımlama
        List<String> countryArrList = Arrays.asList("Almanya","Belçika","İngiltere","Japonya");
                    // List görünümlü Array oluşturur.--> size değiştiren metodlar kullanılamaz.
        //countryArrList.add("Türkiye"); // UnsupportedOperationException

        List<String> countryArrList2 = new ArrayList<>(Arrays.asList("Almanya","Belçika","İngiltere","Japonya"));
        countryArrList2.add("Türkiye");
       // countryArrList.add("Türkiye");

       // List.of() metoduyla oluşturma
       List<String> countryList3 = new ArrayList<>(List.of("Almanya","Belçika","İngiltere","Japonya"));
        List<String> korunanCountryList = List.of("Almanya","Belçika","İngiltere","Japonya"); // Sadece okuma amaçlı kullanırsınız
        System.out.println("korunanCountryList.get(0) = " + korunanCountryList.get(0)); // Almanya
       // korunanCountryList.add("yeni"); // UnsupportedOperationException
       //korunanCountryList.set(0,"Germany"); // UnsupportedOperationException



        // For döngüsü ile element ekleme
        ArrayList <Integer> onlukList = new ArrayList<>();
        for (int i = 1;i<11;i++){
            onlukList.add(i*10);
        }

        // Arraylisti yazdırmak
        System.out.println("namesList = " + namesList);
        System.out.println("namesEkList = " + namesEkList);
        System.out.println("namesEkList = " + countryArrList2);
        System.out.println("onlukList = " + onlukList);

    }
}
