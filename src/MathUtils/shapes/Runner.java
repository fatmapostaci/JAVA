package MathUtils.shapes;

import java.util.Scanner;

/*
Task 01 >
fields: width, length ve cevre ve alan hesaplayaan methodolan Rectangle isminde Class create ediniz.
Runeer class'da obj ile cevre ve alan değelerini print eden code create ediniz.
*/
public class Runner {
    public static void main(String[] args) {




        Scanner sc = new Scanner(System.in);

        //boş constructor ile hesaplama

        System.out.println("Dikdörtgenin kenar uzunluklarını girin: ");
        //dışarıdan alınan verileri objenin özelliği olarak set eder
        Rectangle islem = new Rectangle();
        islem.setA(sc.nextInt());
        islem.setB(sc.nextInt());

        islem.calculateArea();
        islem.calculatePerimeter();

        System.out.println(islem);


        //2 parametreli constructor ile hesaplama
        System.out.println("Dikdörtgenin kenar uzunluklarını girin: ");
        Rectangle islem2 = new Rectangle(sc.nextInt(),sc.nextInt());
        islem2.calculateArea();
        islem2.calculatePerimeter();

        System.out.println( islem2 );

    }

}
