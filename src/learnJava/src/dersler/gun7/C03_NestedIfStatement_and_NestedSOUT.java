package learnJava.src.dersler.gun7;

public class C03_NestedIfStatement_and_NestedSOUT {

    public static void main(String[] args) {
        int age = 17,
            weight = 40;
        //nested if statement sout içinde bu şekilde yazılır
        System.out.println(age>17 ? (weight>=50) ? "Kan bağışı yapabilirsinizF" : "Kan bağışı yapmak kilo almalısınızF": "En az 18 yaşında olmalısınızF");

        if (age>17){ // Dış if blogu
            // kilo kontrolü yapacak

            //kısaltılmış if, alttaki kod bloğu ile aynı işi yapar
            if (weight >= 50) {
                // tebrik mesajı
                System.out.println("Kan bağışı yapabilirsiniz");
            } else {
                // kilo alması gerektiği brlirtilecek
                System.out.println("Kan bağışı yapmak için kilo almanız gerekmektedir");
            }
        } else {
            // Hata mesajı ver...
            System.out.println("Kan bağışı yapmak için en az 18 yaşında olmalısınız");

        }
            int x =5 ;
            System.out.println(x>2 ? x <4 ? 10 : 8 : 7 );

  }
}
