package learnJava.srcHoca.j08_loops.L01forloop;

public class C05NestedForLoop {
/*
            task->: Asagidaki output'u print eden code create ediniz.
                        Hafta: 1
                          Gun: 1
                          Gun: 2
                          Gun: 3
                          .....
                        Hafta: 2
                          Gun: 1
                          Gun: 2
                          Gun: 3
                          ....
                        Hafta: 3
                          Gun: 1
                          Gun: 2
                          Gun: 3
                          ....
         */
    public static void main(String[] args) {
        for (int hafta = 1; hafta <4 ; hafta ++){
            System.out.println("Hafta : " + hafta);
            for (int gun = 1; gun <8 ;gun ++){
                System.out.println("   Gun : "+ gun);
            }
            System.out.println();
        }
 }
}
