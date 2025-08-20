package learnJava.srcHoca.j11arrays;

import java.util.Arrays;

public class C02ArraysPractice {

    public static void main(String[] args) {
        //Runner-> sayıArr cift index elemanlarını print eden code create ediniz...

        int[] sayiArr = {1,2,3,4,5,6,7,8,9,10,11,12};

        for (int i = 0 ; i< sayiArr.length ; i++){
            if( i % 2 == 0){
                System.out.print(" " + sayiArr[i]);
            }
        }

        System.out.println();
        for (int i = 0 ; i< sayiArr.length ; i+=2){
                System.out.print(" " + sayiArr[i]);
        }

        System.out.println();
        //Runner-> isimArray de 5 karakterden fazla olan elemanları print eden code create ediniz...
        String[] isimler = {"ali","velinimet","ahmet","mehmet","mert"};
        String[] names = new String[]{"ali","veli","ahmet","mehmet","mert"};
        int count=0;
        for (int i = 0; i < isimler.length ; i++){
            String isim = isimler[i];
            if (isim.length() > 5){
                System.out.print(isim + " ");
                count ++;
            }
        }
        System.out.println();
        System.out.println("Toplam "+ count+ " adet isim 5 harfden fazla");

        //Task03-> isimArray de 6 karakterden az olan elemanı depolayan(store eden) arrayı print eden code create ediniz..
        String [] isimArray = {"Tugba", "Sengul", "Mehmet", "Fatma", "Azize", "Mertay", "Rabia"};
        String [] yeniIsımListeArr = new String[isimArray.length];
        String [] yeniIsımListeArr2 = new String[isimArray.length];

        System.out.println("Arrays.toString(isimArray) = " + Arrays.toString(isimArray));
        for (int i = 0; i < isimArray.length ; i++){
            String isim = isimArray[i];
            if (isim.length() < 6){
                yeniIsımListeArr[i] = isim;
            }
        }

        int sayac =0;
        for (int i = 0; i < isimArray.length ; i++){
            String isim = isimArray[i];
            if (isim.length() < 6){
                yeniIsımListeArr2[sayac] = isim;
                sayac++;
            }
        }
        System.out.println("Arrays.toString(yeniIsımListeArr) = " + Arrays.toString(yeniIsımListeArr));
        System.out.println("Arrays.toString(yeniIsımListeArr2) = " + Arrays.toString(yeniIsımListeArr2));

        for (int i =0; i < yeniIsımListeArr.length; i++){
            if (yeniIsımListeArr[i]!= null){
                System.out.print(yeniIsımListeArr[i]+ " ");
            } else {
                System.out.print("Zeliha"+ " ");
            }
        }
        String isimListStr = Arrays.toString(yeniIsımListeArr);
        System.out.println("isimListStr = " + isimListStr);
        System.out.println("isimListStr.replace(\" null,\",\"\") = " + isimListStr.replace(" null,", ""));
    }
}
