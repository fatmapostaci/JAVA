package learnJava.srcHoca.j08_loops.L01forloop;


public class C01ForLoop {

    public static void main(String[] args) {
        //forloop->tekrarlayan sabit actionlar icin tanimlanan code blogu'dur

        String b = "dlr";
        for (   int kapıNo = 8  ; kapıNo < 15    ; kapıNo ++    ) {
            System.out.println( kapıNo + ". kapıya kargo dağıtıldı...");
            String a = "ili";
        }
        System.out.println( " numaralı kapıda bitti");

        // task-> 41 kere "Maaşallah" print eden code create ediniz.

        /*
        System.out.println("Maaşallah");
        System.out.println("Maaşallah");
        System.out.println("Maaşallah");
        System.out.println("Maaşallah");
        System.out.println("Maaşallah");
        System.out.println("Maaşallah");
        .
        .

        tekrarlanan kodlar coding standartları açısından kusurludur
        */

        for (int i = 0 ; i <41 ; i++) {
            System.out.println(i +1 + ". Maaşallah");
        }

        System.out.println("*********************");
        for (int i = 1 ; i <= 41 ; i++) {
            System.out.println(i + ". Maaşallah");
        }

        // task02-> 2 basamalı tek sayıları aynı satıra aralarında boşluk ile print eden code create ediniz.

        for(int i = 10 ; i<100 ; i++) {
            if (i % 2 == 1){
                System.out.print(i + " ");
            }
        }

        int baslangıc = 11
                ,bitis = 100;

        for (int i = baslangıc ; i< bitis ; i+=2){
            System.out.print(i + " ");
        }
    }
             /*
          Code standarts
        1) Tekrar (Repetition) olmamalidir
        2) Dynamic olmalidir
        3) Tamir (Fix) ve update kolay yapilabilmelidir
         */

}
