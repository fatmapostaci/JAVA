package learnJava.src.dersler.gun19;

import java.util.Scanner;

public class Task12_MailFormat_Run {
    static Scanner input = new Scanner(System.in);//gunes eyledim ki herkeşler erişebile
    /*
        Task-> girilen meyılın doğrulugunu aşağıdaki şartlarda  control eden METHOD create ediniz.
        Example:
        "@gmail.com"-> false
        "@gmailcom"-> false
        "gmail.com"-> false
        "ebıkGabık@gmail.com"-> true
         */
    public static void main(String[] args) {
        boolean endOfLoop=false;
        while(endOfLoop==false){
            System.out.print("Enter mail adress: ");
            final String mail = input.next();
            Task12_MailFormat_Methods methods = new Task12_MailFormat_Methods();
            boolean isMailValid = methods.isFormatAccepted(mail);
            if(isMailValid){
                System.out.println("Mail accepted");
                endOfLoop=true;
            }
            else System.out.println("Format Error!");
        }

    }//main sonu



}//Class sonu
