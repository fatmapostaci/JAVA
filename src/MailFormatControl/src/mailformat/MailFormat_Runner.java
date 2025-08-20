package MailFormatControl.src.mailformat;

import java.util.Scanner;

public class MailFormat_Runner {

    static Scanner input = new Scanner(System.in);
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
        while(!endOfLoop){
            System.out.print("Enter mail adress: ");
            final String mail = input.next();
            MailFormat_Methods methods = new MailFormat_Methods();
            boolean isMailValid = methods.isFormatAccepted(mail);
            if(isMailValid){
                System.out.println("Mail accepted");
                endOfLoop=true;
            }
            else System.out.println("Format Error!");
        }

    }//main sonu



}//Class sonu
