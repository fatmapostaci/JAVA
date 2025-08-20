package learnJava.src.codeChallenge.ALLSUBJECTS;

public class Arrays {
    public static void main(String[] args) {
        //Bir integer dizisi tanımlayın ve 5 elemanla doldurun.
        int [] arr;
        arr= new int[]{1, 2, 3, 4, 5};
        System.out.println(arr[0]);

        //Bir String dizisi oluşturun ve 3 farklı şehir adı ekleyin.
        String []dizi = {"İst","Ank","İzm"};
        //İkinci elemanı ekrana yazdırın.
        System.out.println(dizi[1]);

        //Bir dizi oluşturun ve döngü kullanarak tüm elemanlarını ekrana yazdırın.
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        //Bir double dizisi oluşturun ve 4 değer ekleyin.
        double []dArr={2.0,3.6,4.5,4};
        //for-each döngüsü kullanarak elemanları yazdırın.


    }
}
