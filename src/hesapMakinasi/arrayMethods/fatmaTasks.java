package hesapMakinasi.arrayMethods;

import java.util.Arrays;
import java.util.Scanner;

public class fatmaTasks {
    public static void main(String[] args) {
        soru1();
        soru2();
        soru3();
        soru4();
        soru5();
        soru6();
        soru7();
    }

    static void soru1() {
        int[] arr = {5, 10, 15, 20, 25, 30, 35};
        System.out.println(arr.length);
        System.out.println("soru1");
        // array'inin ilk 5 elemanını kopyalayarak yeni bir array oluşturun ve her elemanını 2 ile çarpıp yazdırın.
        int[] arrCopy = Arrays.copyOf(arr, 5);
        for (int i = 0; i < arrCopy.length; i++) {
            System.out.print(" " + arrCopy[i] * 2);
        }
        System.out.println();
    }

    static void soru2() {
        System.out.println("soru2");
        // array'ini sıralayın. Ardından, en büyük 2 elemanın toplamını ve en küçük 2 elemanın toplamını bulun.
        int[] arr = {8, 3, 15, 6, 10, 2};
        Arrays.sort(arr);
        System.out.println("arr[arr.length-1]+arr[0] = " + (arr[arr.length - 1] + arr[0]));
    }

    static void soru3() {
        int[] arr = {12, 5, 20, 8, 15};
        System.out.println("soru3");
        // array'ini sıralayın. Ardından, kullanıcıdan bir sayı alıp bu sayının array içinde bulunup bulunmadığını
        // binarySearch() kullanarak kontrol edin.
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        Scanner scanf = new Scanner(System.in);
        System.out.print("Sayi array içinde var mı?  Sayı girin: ");
        int sayi = scanf.nextInt();
        System.out.println((Arrays.binarySearch(arr, sayi) >= 0) ? "Sayi arrayde var" : "Sayı array içinde yok");
    }

    static void soru4() {

        // Soru 4 : Bir kullanıcıdan virgülle ayrılmış sayılar alarak bu sayıları bir array'e atayın.
        // Array'i sıralayın ve en büyük ile en küçük sayıyı yazdırın.
        System.out.println("Soru4");
        Scanner scanf = new Scanner(System.in);
        System.out.print("virgülle ayrılmış sayılar girin: ");
        String[] metin = scanf.nextLine().split(",");
        System.out.println(Arrays.toString(metin));
        int[] sayilar = new int[metin.length];
        for (int i = 0; i < metin.length; i++) {
            sayilar[i] = Integer.parseInt(metin[i].trim());
        }
        System.out.println(Arrays.toString(metin));
        Arrays.sort(sayilar);
        System.out.println("En küçük sayı : " + sayilar[0] + "\nEn büyük sayı : " + sayilar[sayilar.length - 1]);
    }

    static void soru5() {
        System.out.println("Soru5");
        // Soru 5 : Uzunluğu 10 olan bir array oluşturun.
        // Arrays.fill() metodunu kullanarak tüm elemanları 7 ile doldurun.
        // Ardından, her elemanını 3 ile çarparak yeni değerleri yazdırın.
        int[] arr = new int[10];
        Arrays.fill(arr, 7);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i] * 3);
        }
        System.out.println();
    }

    static void soru6() {
        System.out.println("Soru6");
    /* Soru 6 :
       Uzunluğu 10 olan bir int[] arr array'i oluşturun.
       başlangıçta tüm elemanları 0 yapın.
       Daha sonra her bir elemanı şu kurala göre güncelleyin:
       --> Eğer indeks çift ise: Değer indeks * 2 olsun.
       --> Eğer indeks tek ise: Değer indeks * 3 olsun.
       Array'in tüm elemanlarının toplamını hesaplayın ve yazdırın.
       Bonus: Array'deki en büyük değeri ve indeksini bulun.
       */
        int[] arr = new int[10];
        Arrays.fill(arr, 0);
        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] *= 2;
            } else {
                arr[i] *= 3;
            }
            toplam += arr[i];
        }
        System.out.println("toplam = " + toplam);
        System.out.println("En büyük değer 0 index de hepsi");
    }

    static void soru7() {
        System.out.println("Soru7");
    /* Soru 7 :
      Bir kullanıcıdan pozitif tam sayılardan oluşan bir array girmesini isteyin.
      Bu array üzerinde şu işlemleri yapın:

      Array'in ilk yarısını alın ve bunu bir başka array'e atayın.
      İkinci yarısını alın ve bir başka array'e atayın.
      İlk ve ikinci yarıyı birleştirip yeni bir array oluşturun ve bu array'i sıralayın.
      En büyük 3 elemanını yazdırın.
      Not: Array'in uzunluğu tek sayıysa, orta eleman ikinci yarıya dahil edilmelidir.
      */
        Scanner scanf = new Scanner(System.in);
        System.out.print("boşlukla ayrılmış sayılar girin: ");
        String[] metin = scanf.nextLine().split(" ");
        int[] sayilar = new int[metin.length];
        for (int i = 0; i < metin.length; i++) {
            sayilar[i] = Integer.parseInt(metin[i]);
        }

        int[] ilk_yarisi = new int[sayilar.length / 2];
        Arrays.setAll(ilk_yarisi, i -> sayilar[i]);  //???????lambda nasıl çalışıyor
        int[] son_yarisi = new int[sayilar.length - ilk_yarisi.length];
        Arrays.setAll(son_yarisi, i -> sayilar[i + ilk_yarisi.length]);
        System.out.println("Arrays.toString(sayilar) = " + Arrays.toString(sayilar));
        System.out.println("Arrays.toString(ilk_yarisi) = " + Arrays.toString(ilk_yarisi));
        System.out.println("Arrays.toString(son_yarisi) = " + Arrays.toString(son_yarisi));
        int boyut = ilk_yarisi.length + son_yarisi.length;
        int[] birlesik_arr = new int[boyut];
        System.arraycopy(ilk_yarisi, 0, birlesik_arr, 0, ilk_yarisi.length);
        System.arraycopy(son_yarisi, 0, birlesik_arr, ilk_yarisi.length, son_yarisi.length);
        System.out.println("Arrays.toString(birlesik_arr) = " + Arrays.toString(birlesik_arr));
    }

}
