package learnJava.src.dersler.gun40.j26abstraction.abstraction01;

public abstract class Honda {

    public abstract void motor(); // body siz abs metod -> childlar implement etmek zorunda

    public void sunRoof(){  // body si olan concrete metod -> child classlar gerek duyatsa override edebilir
        System.out.println("sunRoof concrete methodu çağrıldı");
    }

    public abstract void koltuk(); // body siz abs metod -> childlar implement etmek zorunda
    public abstract void kapi(); // body siz abs metod -> childlar implement etmek zorunda

    // abs class içinde concrete değişken oluşturulabilir mi -> evet
    String name = "Mehmet";

    // abs class içinde abs değişken oluşturulabilir mi -> Hayır abs değişken oluşturulamaz
    // abstract String name;

    // final void finalMethod(); // bodysiz final method olmaz
    // final abstract void finalMethod(); // abs ve final method olmaz
    // private abstract void finalMethod(); // abs method acc modifierı sınırlandırılamaz.
    // static abstract void finalMethod(); // abs method static yapılamaz.
    // static void gunesMethod(){}; // abs classta static method oluşturulabilir.
    //Honda arac = new Honda(); abs class tan obje üretilemez.




}
