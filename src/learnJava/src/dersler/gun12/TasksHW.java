package learnJava.src.dersler.gun12;

import java.util.Scanner;

public class TasksHW {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);


        //Task->  Girilen  String'deki space haric kac tane character kullanildigini print eden code create ediniz.
        System.out.print("Girdi: ");
        String metin4 = scan.nextLine();
        metin4 = metin4.replace(" ","");
        System.out.println("metnin uzunluğu= " + metin4.length());
    }
}
