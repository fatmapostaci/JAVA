package learnJava.src.dersler.gun20;

import java.util.Arrays;

public class C03ArrayBinarySearch {
            /*
            Arrays.binarySearch(arr,value);-> girilen arraydeki istenen eleman kontrolu
        Eğer sayi2 dizide bulunursa, bu öğenin indeksini döner.
        Eğer sayi2 dizide bulunmazsa, negatif bir değer döner. Bu değer:
                −(insertionPoint+1) olarak hesaplanır.
                 insertionPoint, öğenin ekleneceği indeks konumudur.
         */

    public static void main(String[] args) {
        int sayiArr[]={23,44,2,11,55,60,32,34,58,22,9,64,42};

        int control = -24;
        // Acemi Yöntemi
        boolean flag = false;
        for (int i= 0; i < sayiArr.length; i++){
            if (sayiArr[i] == control){
                flag = true; // Eger değer varsa true olur
                System.out.println((i+1) + ". eleman");
                break;
            }
        }
        System.out.println("sonuç =" + flag);

        // Daha Uygun yöntem ile
        // Eğer binarySearch Kullanılacak ise önce Array Sort edilir...
        System.out.println("before sorting = " + Arrays.toString(sayiArr));
        Arrays.sort(sayiArr); // Arrayi natural order da sıralar.
                             // Sayı değerleri için küçük -> büyük doğru karakter alfebetik sıralama a -> z
        System.out.println("after sorting = " + Arrays.toString(sayiArr));

        System.out.println("Arrays.binarySearch(sayiArr,control) = " + Arrays.binarySearch(sayiArr, control));
    }

}
