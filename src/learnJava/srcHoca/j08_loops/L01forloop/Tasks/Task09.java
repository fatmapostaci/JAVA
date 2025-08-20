package learnJava.srcHoca.j08_loops.L01forloop.Tasks;

public class Task09 {
    public static void main(String[] args) {
           /*
        task-> girilen boyutta aşağıdaki şekli  print eden code create ediniz
          Örnek Ekran çıktısı
      *
      * *
      * * *
      * * * *
      * * * * *
      * * * *
      * * *
      * *
      *
         */

        for (int i = 1; i < 6; i++){
            for (int j = 1; j <= i; j ++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 4; i >0 ;i --){
            for (int j = 1; j <= i; j ++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
