package learnJava.srcHoca.j08_loops.L01forloop.Tasks;

public class Task21 {

    /*
             *
            * *
           * ! *
          * ! ! *
         * ! ! ! *
        * ! ! ! ! *
       * ! ! ! ! ! *
      * * * * * * * *
      şekli print eden code create ediniz.
     */

    public static void main(String[] args) {
        int rows = 8; // Toplam satır sayısı

        for (int i = 1; i <= rows; i++) {
            // Bir satıra odaklanmaya calışın bir loop ile boşlukları yazdıracağım
            //takip eden ikinci loopta ise * ve ! leri yazdıracağım

            // Boşlukları yazdır
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }

            // Yıldız ve ünlem karakterlerini sırayla yazdır
            // ( her satırda ilk ve son olarak * aradaki karakterler ! olmalı
            // son satır ise (i=8) tamamı * olmalı)

            for (int k = 1; k <= i; k++) {
                if (k == 1 || i == rows || k == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("! ");
                }
            }

            System.out.println();
        }



    }

}
































