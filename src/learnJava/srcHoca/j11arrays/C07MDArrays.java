package learnJava.srcHoca.j11arrays;

import java.util.Arrays;

public class C07MDArrays {
            /*
		Çok Boyutlu Diziler
        Java'da Çok Boyutlu Diziler varsayılan bir veri tipi olarak bulunmazlar ve matris olarak adlandırılırlar.
         Dizilerin 2 boyutlu halleri şeklinde tanımlanırlar. Matrisler satır ve sütun şeklinde tablo verisi
         formatındaki verileri tutmak için kullanılır. Diziler liste halinde veriler için uygunken,
         matrisler tablo şeklindeki veriler için uygundur. Oluşturulan tabloda bir değere ulaşmak istersek
         satır ve sütun sayısını girmemiz yeterli olacaktır.
        * TRICK :)İki boyutlu dizilerde tek boyutlu diziler gibi indis değeri 0'dan başlar.
        Dizide tutulacak veri tipleri aynı olmak zorundadır farklı veri tiplerini aynı matriste tutamayız.

		 * 1- Ic Icice olusturulan  array'lerde   disardaki ana array'e outer-> Kat  array
		 *  icerdeki  array'lere  inner->Daire array denir
		 * 2- TRICK->  icerdeki array'lerin boyutlari birbirinden farkli ise
		 *  Array'i ancak tum elemenlari atanarak declare edilmeli
		 * 3- Multi dimensional array'de bir elemanin indexi icin
		 *  en distaki array haric, elemana kadar ic ice olan tum arraylerin indexlerini yazmak gerekir
		 */

    public static void main(String[] args) {
        int [][] arr = new int[3][2]; // Üç kaylı her katta 2 daire olan bine

        // 7 sınıflı ve her sınıfta 18 öğrenci olan okulda öğreciAdıArr
        String [][] ogrenciAdıArr = new String[7][18];
         // 3. sınıftaki 5. ogrenciye isim verelim
        ogrenciAdıArr[2][4] ="Mehmet Bey";
        // Son sınıfın ilk ogrencisi
        ogrenciAdıArr[6][0] ="Fatma Hanim";

        //   {  {  ,  },  {  ,  },   {  ,  }  }
        //MD Arrayi yazdırma:
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr)); // iç araylerin referanslarını dündürür -> [[I@a09ee92, [I@30f39991, [I@452b3a41]
        System.out.println("Arrays.toString(arr[0]) = " + Arrays.toString(arr[0])); // ilk iç arrayi yazdırdı
        System.out.println("Arrays.deepToString(arr) = " + Arrays.deepToString(arr));
        System.out.println("arr[1][0] = " + arr[1][0]); // 2. iç arrayin ilk elemanını yazdırdık

        int [][] daireler = {
                {1,2,3,4},
                {5,6,7},
                {8,9,10,11},
                {12,13}};

        int [][] daireler2 = {
                {1,2,3,4},
                {5,6,7,3},
                {8,9,0,1},
                {2,3,4,4}
        };

        // 6 elemanını 16 olarak update edelim
        daireler[1][1] = 16;

        System.out.println("Arrays.deepToString(daireler) = " + Arrays.deepToString(daireler));

        // Daireler arryınde 3. katı kopyalayıp yeni bir arraye atayalım
        int [] copy = Arrays.copyOf(daireler[2],daireler[2].length);
        System.out.println("Arrays.toString(copy) = " + Arrays.toString(copy));
        System.out.println("Arrays.toString(daireler[2]) = " + Arrays.toString(daireler[2]));

    }

}
