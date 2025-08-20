package learnJava.src.dersler.gun3;

import java.util.Scanner;

public class odev12 {
    public static void main(String[] args) {
            /*
    Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
    (Not : KDV tutarını 18% olarak alın)
    KDV'siz Fiyat = 10;
    KDV'li Fiyat = 11.8;
    KDV tutarı = 1.8;
    Ödev
    Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı print eden code create ediniz
     */


        String ucretString;
        boolean isInteger;
        int kdvOrani;
        Scanner scanf = new Scanner(System.in);
        do {
            System.out.print("Ucreti girin: ");
            isInteger = scanf.hasNextInt();   //integer mı diye sormak için boolean değer dönüyor,
            ucretString = scanf.nextLine();   //input değeri string olarak alıyorum
            if (!isInteger)  //girilen input değeri string mi sayısal değer mi kontrol ediyor
                System.out.println("String değer girdiniz... Input kabul edilmedi! ");
        }while (!isInteger);   //integer değer girildiğinde while sonlanacak

        System.out.println("Sayısal değer kabul edildi....");
        int ucretInt = Integer.parseInt(ucretString) ;  //string değeri imprimitive integer değişkenine atıyoruz

        //sorunun cevabı-------------------
        if (ucretInt>1000)  kdvOrani=18;  else kdvOrani=8;
        System.out.println("\"KDV'siz Fiyat\" = " + ucretInt );
        System.out.println("\"KDV'li Fiyat\" = " + ( ucretInt + ucretInt*kdvOrani/100) );
        System.out.println("\"KDV tutarı \" = " + ( ucretInt*kdvOrani/100) );

    }
}
