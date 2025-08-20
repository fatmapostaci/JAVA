package learnJava.srcHoca.j24inheritance.inheritance1;

public class Doktor extends Insan{
    // Doktor Classı Insan Classını extend ediyor ( Doktor -> Child ; Insan Class -> Parent)
    // Private memberlar hariç hepsi extend edilir

    String unvan;

    public void muayeneEt(){
        System.out.println("Dr muayene eder.");
    }

}
