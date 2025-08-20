package learnJava.srcHoca.j19constructor;

public class C04TeacherRunner {

    public static void main(String[] args) {
        C04Teacher teacher1 = new C04Teacher();
        teacher1.ad = "Mert";
        teacher1.soyad = "Cömert";
        teacher1.calisiyormu=false;
        teacher1.maas =teacher1.maasHesapla();
        System.out.println("teacher1.toString() = " + teacher1.toString());

        C04Teacher teacher2 = new C04Teacher("Sema","Selvi","Mat",18,false);
        teacher2.maas = teacher2.maasHesapla();
        System.out.println("teacher2.toString() = " + teacher2.toString());

    }
}
