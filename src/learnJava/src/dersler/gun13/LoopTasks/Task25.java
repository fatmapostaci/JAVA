package learnJava.src.dersler.gun13.LoopTasks;

import java.util.Scanner;

public class Task25 {

    /*
           TASK  :
           Bir String içindeki tüm karakterleri en fazla bir kez print eden code create ediniz.
           Test Data:
           input: "aabbcccccddddaaa"
           output: abcd
        */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Girilen String içindeki tüm karakterleri bulalım");
        System.out.print("Input: ");
        String metin=sc.nextLine();
        //ascii tablodaki değerleri sırayla arıyorum
        for (int i = 0; i < 127; i++) {
            if(metin.contains(String.valueOf((char)i)))
                System.out.print(String.valueOf((char)i));
        }
    }
}
