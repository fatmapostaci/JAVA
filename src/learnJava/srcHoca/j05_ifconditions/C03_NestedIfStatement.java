package learnJava.srcHoca.j05_ifconditions;

public class C03_NestedIfStatement {

    public static void main(String[] args) {
        int age = 23,
            weight = 50;

        if (age>17){ // Dış if blogu
            // kilo kontrolü yapacak
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
  }
}
