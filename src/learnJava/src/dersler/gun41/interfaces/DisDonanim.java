package learnJava.src.dersler.gun41.interfaces;
public interface DisDonanim {

    public abstract void kapi(); // pub, abst  metod
    void kaporta(); // pub, abst  metod -> public abstract key wordlerini uyazmak zorunda değiliz

    //public static final String RENK; CTE initialize etmek şart
    String RENK = "Kırmızı";
    //public static final String RENK = "Kırmızı";

    // Java 8 den itibaren body si olan -> concrete method oluşturabiliyoruz
    public default void anten(){ // default -> obje üzerinden çağırılan concrete metod
        System.out.println("Anteni olmayan çekmeyebilir");
    }  //????
     public static String sisLamp(){ // static -> Interface ismiyle çağırılabilir
        return "Sisli havalarda çok işe yarar";
     }

    public static void main(String[] args) {
        System.out.println(RENK); // Sabiti yazdırdık
        System.out.println("sisLamp() = " + sisLamp());
        // DisDonanim disDonanim = new DisDonanim(); -> Interfacelerden Obje oluşturulamaz.

    }






}
