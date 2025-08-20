package learnJava.srcHoca.j19constructor;

public class C03Student {
            /*
    Task-> fields: ad, soyad, sınıf, ortalama, okulNo, takdirBelgesi olan 2 farklı obj ile
    mezuniyet(ortalama 50 üstü ise mezun oldunuz) sosyalFaaliyet methodlarını  print eden code create ediniz.
     */

    // Fieldlar:
    String ad;
    String soyad;
    String sınıf;
    int ortalama;
    Integer okulNo;
    boolean takdirBelgesi;

    public C03Student(String ad, String soyad, int ortalama) {
        System.out.println(" ad,soyad, ortalama değer atayan cons çalıştı");
        this.ad = ad;
        this.soyad = soyad;
        this.ortalama = ortalama;
    }

    // Methodlar
    public void sosyalFaaliyet(){
        System.out.println(ad+ " sadece ders çalışarak olmaz aktiviteler de önemli...");
    }

    public String mezuniyet(){ // Non-static methodlar objelere tanımlıdır.
       return (ortalama > 50) ? (ad + " Mezuniyete hak kazandı") : (ad +" Mezun olmadınız.");
    }

    public static void resmiKutlamaKatil(){ // static method tüm classa aittir.
        System.out.println( " Bütün sınıf resmi etkinliği çoşku ile kutladı");
    }

    public void display(){ // Non-static methodlar objelere tanımlıdır.
        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);
        System.out.println("ortalama = " + ortalama);
        System.out.println("sınıf = " + sınıf);
        System.out.println("okulNo = " + okulNo);
        System.out.println("takdirBelgesi = " + takdirBelgesi);
    }

    @Override
    public String toString() {
        return "{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", sınıf='" + sınıf + '\'' +
                ", ortalama=" + ortalama +
                ", okulNo=" + okulNo +
                ", takdirBelgesi=" + takdirBelgesi +
                '}';
    }

    public static void main(String[] args) {

        C03Student std1 = new C03Student("Mehmet", "Yahşi",98);
        C03Student std2 = new C03Student("Rabia", "Temiz",97);
        System.out.println("std1.toString() = " + std1.toString());
        std1.display();

        // Non static metd çağrılırken -- > Obje ile çağırılır
        std2.sosyalFaaliyet();
        String sonuc =std1.mezuniyet();
        System.out.println("sonuc = " + sonuc);

        //static metd çağrılırken -- > Objeye gerek yok direk class ismiyle çağırılır
        C03Student.resmiKutlamaKatil();
        std1.resmiKutlamaKatil(); // Bad practice static metohları obje ile çağırmayı tercih edilmez


    }

}
