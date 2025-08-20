package learnJava.srcHoca.j14varargs;

public class Task04 {
    /* Task->
stringlerin istenilen kadar ilk harflerini yazdıran METHOD create ediniz.
*/
    public static void printSubstrings(int length, String... words) {
        for (String value : words) {
            if (value.length() < length) {
                System.out.println(value);
            } else {
                System.out.println(value.substring(0, length));
            }
        }
    }

    private static void stringYazdir(int istenen,String... strings) {
        int len=istenen;
        for (String s : strings){
            //eğerki stringin uzunluğu istenen sayıdan küçükse kelime uzunluğu kadar yazması için kontrol ediyor
            if(s.length()<istenen)
                len=s.length();
            else
                len=istenen;
            System.out.println("s.substring(0,istenen) = " + s.substring(0,len));
        }
    }

    public static void harfYaz (int sayi, String...str){

        String kelime="";

        for (String girdi : str){
            kelime =girdi;
            if (sayi>kelime.length()){
                System.out.println("Yanlis veri girisi");
                break;
            }else System.out.print(kelime.substring(0, sayi)+" ");
        }
    }

    public static void main(String[] args) {
        harfYaz(5,"Tugba","Selin","Kaan","Akin","Alican");
        System.out.println();;
        stringYazdir(5,"Tugba","Selin","Kaan","Akin","Alican");
        printSubstrings(5,"Tugba","Selin","Kaan","Akin","Alican");
    }
}
