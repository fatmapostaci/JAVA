package learnJava.srcHoca.j05_ifconditions;

public class C01_IfStatements {

    public static void main(String[] args) {

        int mertYas = 25;
        int mehmetYas = 30;
        if (mertYas == mehmetYas){
            System.out.println("Siz yaşıtsınız ... ");
            System.out.println("Yoksa siz ikizmisiniz  ... ");
        }
        if (mertYas < mehmetYas) System.out.println("Mert Bet daha büyük2");

// Tek satırlık kodlar için if den sonra {} yazmaya gerek yok
        if (mertYas +3 == mehmetYas){
            System.out.println(" Mert bey 3 yas küçüktür");
        }

        System.out.println("bu yazıyı görüyorsan kod çalıştı....");

    }
}
