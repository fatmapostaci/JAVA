package learnJava.srcHoca.j99_codechallenge.codechallenge02;

public class Task08_NestedTernary {
    /*  Task
     Girilen Final için
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri..
    print eden code create ediniz.
     */

    public static void main(String[] args) {
        char ch = 'a';
        System.out.println("(ch + 0) = " + (ch + 0)); // char ile matematiksel işlem yapılırsa ascii value değeri ile işlem yapılmış olur

        String sonuc = ch == 'A' || ch == 'a' ? "Gayet Basarili" :
                            ch == 'B' || ch == 'b' ? "Basarili":
                               ch == 'C' || ch == 'c' ?  "Ha gayret" :
                                   "Yanlış seçenek...";
        System.out.println("sonuc = " + sonuc);

    }
}
