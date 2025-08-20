package learnJava.srcHoca.j08_loops.L02whileloop.Tasks;

import java.util.Scanner;

public class Task08WithMethod {
    static String password= "";
    public static void main(String[] args){
                /*
         task-> girilen şifrenin asagidaki sartlari kontrol edin
         ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
         eger tum sartlari saglarsa, "sifre basariyla kaydedildi" print edin
         - ilk harf kucuk harf olmali
         - son karakter rakam olmali
         - sifre bosluk icermemeli
         - uzunlugu en az 10 karakter olmali

         */

        Scanner scn = new Scanner(System.in);
        System.out.println("Lütfen şifrenizin belirleyiniz:\n"+
                "         - ilk harf kucuk harf olmali\n" +
                "         - son karakter rakam olmali\n" +
                "         - sifre bosluk icermemeli\n" +
                "         - uzunlugu en az 10 karakter olmali");

        boolean correctPassword = false;
        while (!correctPassword){
          //  password = scn.next();// boşluğa kadar okuyacağı için alttaki yöntemi tercih ettik
            password = scn.nextLine();
            correctPassword =isPasswordValid(password);

        }
        System.out.println("Şifreniz başarı ile kaydedildi :)");
 }














    public  static boolean isPasswordValid(String password)  {
        int flag =0;
        int lengthOfPass = password.length();
        char initial = password.charAt(0);
        char lastLetter = password.charAt(lengthOfPass-1);

        //- ilk harf kucuk harf olmali
        boolean isInitialLowercase = Character.isLowerCase(initial);
        if (!isInitialLowercase){
            System.out.println("Ilk karakter kucuk harf olmali");
            flag++;
        }


        //- son karakter rakam olmali
        boolean isLastDigit = Character.isDigit(lastLetter);
        if (!isLastDigit){
            System.out.println("Son karakter rakam olmali");
            flag++;

        }

        //- sifre bosluk icermemeli
        boolean isPassContainsSpace = password.contains(" ");
        if (isPassContainsSpace){
            System.out.println("Şifre bosluk icermemeli");
            flag++;

        }

        //- uzunlugu en az 10 karakter olmali
        boolean lengthAtLeastTenDigits = lengthOfPass > 9;
        if (!lengthAtLeastTenDigits){
            System.out.println("Uzunlugu en az 10 karakter olmali");
            flag++;

        }
        System.out.println("flag " + flag);

        //   if (isInitialLowercase && isLastDigit && !isPassContainsSpace && lengthAtLeastTenDigits){
        //       correctPassword = true;
        //   }
        if (flag ==0){
            return  true;
        } else {
            return false;
        }

    }
}
