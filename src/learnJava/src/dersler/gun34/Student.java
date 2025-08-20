package learnJava.src.dersler.gun34;

import dersler.gun35.inheritance.Human;

public class Student extends Human {

    private int not = 70;
    private int id;
    private int grade;
    private String schoolName;

    public Student(String name, int id,  int grade, String schoolName ) {
        super(name);
        this.grade = grade;
        this.schoolName=schoolName;
        this.id = id;
    }


    public void setNot(int num) {
        if (num <= 100 && num >= 0 ) {
            not = num;
        } else {
            System.out.println("Yanlış girdi yaptınız lütfen tekrar deneyin");
        }
    }
    @Override
    public String introduceYourself(){
        return "\nMy name is " + name + " I am a " + grade +". grade student in " + schoolName +" . My school id is " + id  ;
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
