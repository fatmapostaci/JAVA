package learnJava.srcHoca.j08_loops.L01forloop;

public class C04NestedLoop {
        /*
        Bir loop body'de {loop}  farklı bir loop tanımlanmasıyla oluşan code blok'a
        nested loop denir.-> apt. daire döngüsü
        iç loop dış  loop'un her step'inde tekrar çalışır.en içteki lopp bitmeden
        dış lopp bitmez. ilk önce en içdeki lopp run olur
         */

    public static void main(String[] args) {
        for (int kat =1; kat < 7; kat++){
            for (int daire =1; daire <4 ; daire ++){
                System.out.println(kat + ". kat daire no = " + daire);
            }
        }

        for (int kat =1; kat < 7; kat++){
            System.out.println("Kat no : "+ kat);
            for (int daire =1; daire <4 ; daire ++){
                System.out.print( "daire no = " + daire + "   ");
            }
            System.out.println();
        }

    }
}
