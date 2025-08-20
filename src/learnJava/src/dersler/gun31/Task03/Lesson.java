package learnJava.src.dersler.gun31.Task03;

public class Lesson {
    /*
    Task 03 ->
    Lesson Class :  fields : name, credit (1-10 arasında değer almalı)
    Student Class : fields : name, maxCredit, dersleri(Lesson class obj) saklayacak list
                   derslerin toplam kredi miktarını return eden  toplamKredisi method
    Runner Class :  3 adet  ders ve 1 adet öğrc (maxCredit=10) obj create ederek öğrencinin alabileceği ve
                       alamayacagı dersleri print eden code create ediniz

     */

    private String name;
    private int credit;


    public Lesson(String name, int credit) {
        this.name = name;
        //herhangi bir ders 10 kredinin üzerinde girilirse program sonlanır
        if (!(credit > 0 && credit < 10)) {
            System.out.println("credit (1-10 arasında değer almalı)");
            System.exit(0);
        }else
            this.credit = credit;

    }

    @Override
    public String toString() {
        return "Lesson{" +
                "name='" + name + '\'' +
                ", credit=" + credit +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }
}
