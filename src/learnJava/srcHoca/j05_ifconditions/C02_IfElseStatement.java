package learnJava.srcHoca.j05_ifconditions;

import java.util.Scanner;

public class C02_IfElseStatement {

    public static void main(String[] args) {
        int age;
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz ....");
        age = scan.nextInt();

        if (age >= 18){
            System.out.println("Tebrik ederim oyunuzu kullanabilirsiniz");
        } else {
            System.out.println("Oy kullanamazsınız");
        }
    }
}
