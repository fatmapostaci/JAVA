package learnJava.src.codeChallenge.ALLSUBJECTS;

import dersler.gun19.Task12_MailFormat_Methods;
import dersler.gun19.Task12_MailFormat_Run;

import java.util.Collections;
import java.util.Scanner;

public class StringManipulations {

    public static void main(String[] args) {
        soru1();
        soru2();
        soru3();
        soru5();
        soru6();
        soru7();
    }


    public static void soru7() {
        //Bir cümledeki tüm kelimeleri ters çeviren bir Java programı yazın.
        String s = "Java is fun";
        String reversedS = "";
        int len = s.length();
        for (int i=len ; i > 0 ; i-- ){
           reversedS += s.substring(i-1,i);
        }
        System.out.println(reversedS);
    }

    public static void soru6() {
        //Bir kullanıcının girdiği e-posta adresini kontrol eden bir program yazın. Program aşağıdaki kuralları kontrol etmelidir:
        //
        //- E-posta "@" sembolü içermelidir.
        //- E-posta ".com" uzantısı ile bitmelidir.
        //- Boşluk karakteri içermemelidir.
        //
        boolean endOfLoop=false;
        while(endOfLoop==false){
            Scanner input = new Scanner(System.in);
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
    }

    private static void soru5() {
        //Aşağıdaki string’i boşluk karakterlerine göre ayırarak bir dizi oluşturun ve ardından kelimeleri virgülle birleştirerek ekrana yazdırın:
        String data = "Apple Banana Cherry Date";
        //**Beklenen Çıktı:** `Apple,Banana,Cherry,Date`
        String[] dizi = data.split(" ");
        String newData="" ;
        for(String s : dizi){
            newData += s.strip() + ", ";
        }
        System.out.println(newData);
    }

    static void soru1(){

        String text = "  Java String Manipulation Exercise ";
        //1. Boşlukları baştan ve sondan temizleyin.
        System.out.println("text.strip() = " + text.strip());
        //2. Tüm harfleri küçük harfe çevirin.
        System.out.println("text.toLowerCase() = " + text.toLowerCase());
        //3. Tüm harfleri büyük harfe çevirin.
        System.out.println("text.toUpperCase() = " + text.toUpperCase());
        //4. "Manipulation" kelimesini "Processing" ile değiştirin.
        text.replace("Manipulation","Processing");
        //5. String’in uzunluğunu ekrana yazdırın.
        System.out.println("text.length() = " + text.length());
    }
    static void soru2(){
        String sentence = "Java is fun, and Java is powerful!";
        //1. İlk geçen "Java" kelimesini "Python" ile değiştirin.
        System.out.println("sentence.replaceFirst(\"Java\",\"Python\") = " + sentence.replaceFirst("Java", "Python"));
        //2. Tüm "Java" kelimelerini "Python" ile değiştirin.
        System.out.println("sentence.replaceAll(\"Java\",\"Python\") = " + sentence.replaceAll("Java", "Python"));
        //3. String’in "powerful" kelimesiyle bitip bitmediğini kontrol edin.
        System.out.println("sentence.endsWith(\"powerful\") = " + sentence.endsWith("powerful"));
        //4. String’in içinde "fun" kelimesinin kaçıncı index'te başladığını bulun.
        System.out.println("sentence.indexOf(\"fun\") = " + sentence.indexOf("fun"));
    }
    static void  soru3(){
        String code = "WelcomeToJavaProgramming";
       //1. "Welcome" kelimesini ayırın.
        String welcome = "Welcome";
        int lastindexOfWelcome = code.indexOf(welcome)+welcome.length();
        code = code.substring(0,welcome.length()) + " " + code.substring(lastindexOfWelcome);
        System.out.println("code = " + code);
        //2. "Java" kelimesini ayırın.
        int indexJ = code.indexOf("J");
        System.out.println("code = " + code);
        //3. "Programming" kelimesini ayırın.
        int lastIndexofJava = indexJ + "Java".length();
        code = code.substring(0,indexJ) + " " + code.substring(indexJ,lastIndexofJava) + " " + code.substring(lastIndexofJava);
        System.out.println("code = " + code);
       //4. String'in son 5 karakterini yazdırın.
        System.out.println("code.substring(code.length()-5,code.length()) = " + code.substring(code.length() - 5));

    }
    static void soru4(){
        String password = "Secure@123";
        //1. String boş mu?
        System.out.println("password.isEmpty() = " + password.isEmpty());
        System.out.println("password.isBlank() = " + password.isBlank());
        //2. String "@" sembolünü içeriyor mu?
        for (int i = 0; i <password.length() ; i++) {
            if(password.charAt(i)=='@')
                System.out.println("@ işaretini içeriyor");
        }
        //3. String sadece sayılardan mı oluşuyor?
        try {
            Integer.parseInt(password);
            System.out.println("string sadece sayılardan oluşuyor");
        } catch (NumberFormatException e) {
            System.out.println("string sadece sayılardan olmuyor");
        }
        //4. String’in uzunluğu 8 karakterden fazla mı?
        boolean isLongerThanEight =  password.length()>7 ? true : false;
        System.out.println("LongerThanEight = " + isLongerThanEight);
    }
}
