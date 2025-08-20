package learnJava.srcHoca.j23encapsulation.dummy;

public class Student {
    private String name;
    private int not = 70;
    private int id;

    public void setNot(int num) {
        if (num <= 100 && num >= 0 ) {
            not = num;
        } else {
            System.out.println("Yanlış girdi yaptınız lütfen tekrar deneyin");
        }
    }

    public int getNot() {
       return not;
        // Hayali senaryo: Artık database den veri almaya karar verdik.
       // return DataBase.getNot(id);
    }
}
/*
    Veriyi Koruma:      Direkt erişimi engeller, sadece iş kurallarına uygun
    şekilde değişiklik yapılmasını sağlar.

    Kontrollü Erişim:   Hangi veriye ne zaman, nasıl erişileceğini belirler.
    Değişime Açıklık:   Veri yapıları veya iş mantığı değişse bile dış dünya etkilenmez.
    Hata Yönetimi:      Mantıksız veya hatalı veri girişlerini engeller.
    Kodun Okunabilirliği ve Modülerliği: Büyük sistemlerde düzen sağlar ve sorumlulukları ayırır.
 */
