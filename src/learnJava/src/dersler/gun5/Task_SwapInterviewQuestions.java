package learnJava.src.dersler.gun5;

public class Task_SwapInterviewQuestions {
    /*
        TASK :
        Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP)
        code create edip print ediniz.
        a) 3. bir variable kulanarak
        b) 3. bir variable kullanmadan

	     input	: sayi1=20 ve sayi2=34;
		 output  :  sayi1=34 ve sayi2=20

         */
    public static void main(String[] args) {
        // a) 3. bir variable kulanarak

        int sayi1 = 20, sayi2 = 34;
        int temp;
        System.out.println("sayı1 = " + sayi1 + " sayı2 = " + sayi2);
/*
        temp = sayi1;
        sayi1 = sayi2;
        sayi2 = temp;
        System.out.println("sayı1 = " + sayi1 + " sayı2 = " + sayi2);
 */

        sayi1 = sayi2+sayi1;
        sayi2=sayi1-sayi2;
        sayi1=sayi1-sayi2;



        // b) 3. bir variable kullanmadan

        //sayi1 = sayi1 + sayi2;


        sayi1 += sayi2;

        sayi2 = sayi1 - sayi2;

        //sayi1 = sayi1 - sayi2;
        sayi1 -= sayi2;




    }
}
