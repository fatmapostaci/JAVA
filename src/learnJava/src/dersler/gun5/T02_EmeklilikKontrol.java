package learnJava.src.dersler.gun5;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import static java.time.LocalDate.parse;

public class T02_EmeklilikKontrol {

    /*
  TASK -> kullanıcının cinsiyeti KADIN ise 60 yasından buyuk ve prim gunu 6000 den  fazla ise emekliliğini
        kullanıcının cinsiyeti ERKEK ise 65 yasından buyuk ve prim gunu 7000 den  fazla ise emekliliğini
        kontrol edip kalan yıl ve prim gununu print eden code create ediniz...
 */

    public static void main(String[] args) throws ParseException {

        Scanner scanf = new Scanner(System.in);
        String gender,name,birthDate;
        int primDay,age;
        System.out.print("İsim Soyisim ");
        name = scanf.nextLine();
        gender = getGenderMethod(scanf);
        age = getAgeMethod(scanf);
        System.out.print("Prim gün sayınızı girin: ");
        primDay = scanf.nextInt();

        if (gender.toUpperCase().equals("KADIN")){
            if (age > 60 && primDay > 6000)
                retailmentReport();
            else
                retailmentReport(name,age,primDay);
        } else if (gender.toUpperCase().equals("ERKEK")) {
            if (age > 65 && primDay > 7000){
                retailmentReport();
            }
            else {
                retailmentReport(name,age,primDay);
            }
        }

    }//main

    public static  int getAgeMethod(Scanner scanf) throws ParseException {
        System.out.print("Doğum tarihini (dd/MM/yyyy) formatında girin: ");
        String birthDate = scanf.next();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date birthday = simpleDateFormat.parse(birthDate);//date formatında doğumgünü tarihi
        Date today = Calendar.getInstance().getTime();  //date formatında bugünün tarihi
        long diff = today.getTime() - birthday.getTime(); //milisaniye cinsinde zaman farkını getirir.
        return (int)(diff/1000/60/60/24/365);
    }
    public static void retailmentReport(String name, int age, int primDay){
        System.out.println( "Sayın " + name.toUpperCase() + " Yaşınız: " + age);
        System.out.println("Emekli olmanız için kalan süre " + Math.abs(60-age) + " yıldır.");
        System.out.println("Emekli olmanız için kalan prim gün sayınız: " + Math.abs(6000-primDay) );
    }
    public static void retailmentReport(){
        System.out.println("Emekli olabilirsiniz");
    }
    public static String getGenderMethod(Scanner scanf){
        boolean b=true;
        String input;
        do{
            System.out.print("Cinsiyeti girin: (Kadın/Erkek) ");
            input = scanf.next();
            if(input.toUpperCase().equals("KADIN") || input.toUpperCase().equals("ERKEK"))
                b=false;
            else
                System.out.println("FORMAT HATASI!");
        }while(b==true);

        return input;
    }
}
