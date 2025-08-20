package learnJava.srcHoca.j99_codechallenge.codechallenge02;

import java.util.Scanner;

public class Task04_IfStatement {
    /* Task->
    Girilen jobTitle data için : Eger jobTitle
    qa ise print "is unvaniniz Quality Analyst."
    dev ise print "is unvaniniz Developer."
    ba ise print "is unvaniniz Business Analyst."
    pm ise print "is unvaniniz Project Manager."
    code create ediniz...
   */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Job title ınızı giriniz : (qa, dev, ba, pm)");
        String secim = input.next();

        if (secim.equalsIgnoreCase("qa")){
            System.out.println("is unvaniniz Quality Analyst.");
        } else if (secim.equalsIgnoreCase("dev")){
            System.out.println("is unvaniniz Developer.");
        } else if (secim.equalsIgnoreCase("ba")){
            System.out.println("is unvaniniz Business Analyst.");
        } else if (secim.equalsIgnoreCase("pm")){
            System.out.println("is unvaniniz Project Manager.");
        } else {
            System.out.println("Lütfen geçerli title giriniz");
        }

    }
}
