package learnJava.srcHoca.j08_loops.L01forloop.Tasks;

import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {
        // task-> girilen iki tamsayı arasındaki çift sayıları print eden code create ediniz...

        Scanner input = new Scanner(System.in);
        System.out.println("ilk sayıyı giriniz:");
        int num1 = input.nextInt();
        System.out.println("İkinci sayıyı giriniz:");
        int num2 = input.nextInt();

        int smallNum ,bigNum;

        bigNum = num1 > num2 ? num1 : num2;
        smallNum = num1 < num2 ? num1 : num2;

        for (int i = smallNum; i<= bigNum; i++){
            if (i%2==0) System.out.print(i + " ");
        }
 }
}
