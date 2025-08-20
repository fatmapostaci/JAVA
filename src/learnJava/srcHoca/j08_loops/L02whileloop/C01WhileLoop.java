package learnJava.srcHoca.j08_loops.L02whileloop;

import java.util.Scanner;

public class C01WhileLoop {
            /*
        Başlangıç bitiş ve değişim değerleri net  bilinen tekrarlarda for loop ama adım sayısı değişim değeri
        net bilinmeyen belli bir şarta(durum-boolean) bağlı olan tekrarlarda while loop kullanılır.
         */

    public static void main(String[] args) {
        //Runner-> 3'den 20'ye kadar olan tamsayıları print eden code create ediniz.

        System.out.println("************ For Loop ***************");
        for (int i = 3; i <20 ; i++) {
            System.out.print(i+ " ");
        }

        System.out.println();
        System.out.println("************* While Loop ************");
        int counter= 3; // While loop un başlangıç değerini belirledik
        while (counter < 20){  // While loopu kıracak şartı belirttik
            System.out.print(counter+ " ");
            counter++;  // şartı bozacak yapıyı oluşturduk
        }

        System.out.println();
        System.out.println("************* task 02****************");

        // task02-> 7 kere javaCAN print eden code create ediniz
        int count = 0;
        while (count < 7) {
            System.out.println((count+1) +". javaCAN");
            count++;
        }

        System.out.println("************* task 03****************");
        // task03->2 basamaklı tek sayıları print eden code create ediniz
        int sayac = 11;
        while(sayac < 100){
            if (sayac %2 ==1) {
                System.out.print(sayac + " ");
            }
            sayac+=1;
        }

        System.out.println("************* task 04****************");

        // task04->girilen ifadeyi tersten  print eden code create ediniz
        Scanner scn = new Scanner(System.in);
      //  System.out.println("Bir ifade giriniz");
      //  String txt = scn.nextLine();
      // String reverseTxt= "";
       // int basla = txt.length()-1;
       // while (basla >= 0){
       //     reverseTxt = reverseTxt + txt.charAt(basla);
       //     basla--;
       // }
       // System.out.println("ifadenin tersi = " + reverseTxt);

        System.out.println("************* task 05****************");
        // task05->girilen pozitif  tamsayıya kadar sayıların toplamını  print eden code create ediniz

        int baslaSayisi= 1,sum = 0,sayı;
        System.out.println("Bir sayı giriniz:..");
        sayı = scn.nextInt();

       /* while (numbasl < sayı){
            sum = sum +numbasl;
           // sum +=numbasl;
            numbasl++;
        }
        System.out.println("1 den girdiğiniz sayıya kadar olan sayıların toplamı = " + sum);

        */

        // task06->girilen tamsayının faktöriyelini  print eden code create ediniz

        int factoriel =1;

        while (sayı >1 ){
            System.out.print(sayı + "*");
            factoriel *= sayı;
            sayı--;
        }
        System.out.println("1 = " + factoriel);


    }
}
