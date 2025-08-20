package learnJava.srcHoca.j24inheritance.inheritance1;

public class Runner {

    public static void main(String[] args) {
        Insan insan = new Insan();
        insan.name = "Harun";
        insan.age = 42;
        insan.beslenme();
        System.out.println("insan = " + insan);

        Doktor doktor = new Doktor();
        doktor.name = "Selman"; // parentta, default name'e değer atandı
        doktor.age = 35; // parentta, protected dataya değer atadık
        doktor.surname = "JavvaCan"; // parentta, public dataya değer atadık
        //doktor.id = 1001; // parentta, privat dataya ulaşılamaz

        Ogretmen ogretmen = new Ogretmen();
        ogretmen.age=54;
        ogretmen.name= "Aslı";
        ogretmen.sıvıTükettme();

        Kardiyolog kardiyolog = new Kardiyolog();
        kardiyolog.name= "Ayşe"; // GrandParenttaki name değer atadık;
        kardiyolog.beslenme(); // GrandParenttaki metodu uyguladı
        kardiyolog.unvan = "Prof Dr"; // Parenttaki değişkene değer atadık
        kardiyolog.muayeneEt(); // Parenttaki metodu kullandı
        kardiyolog.eforTestiYap();



    }
}
