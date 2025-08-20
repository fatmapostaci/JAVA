package learnJava.srcHoca.j23encapsulation.tasks.task1;

public class Bmi {

    // Task->
    // Bmi class fields -> name, age, weight,height: encapsulated
    // getBMI() method -> bmi=weight/(height*height) return type olmalı
    // getStatus() method -> bmi 18.5 ten kucukse zayif, 25 ten kucukse normal,
    //         30 dan kucukse kilolu, 30 ustu obez return type
    // Runner class obj ile dataları print eden code create ediniz

    private String name;
    private int yas;
    private double weight;
    private double height;

    public Bmi(String name, int yas, double weight, double height) {
        this.name = name;
        this.yas = yas;
        this.weight = weight;
        this.height = height;
    }

    public Bmi() {
    }

   public double getBMI(){
       return weight/(height*height);

   }

    public String getStatus() {
        String s = "";
        if (getBMI() < 18.5)
            s = "Zayıf";
        else if (getBMI() < 25)
            s = "Normal";
        else if (getBMI() < 30)
            s = "Kilolu";
        else
            s = "Obez";

        return s;
    }



    @Override
    public String toString() {
        return "Bmi{" +
                "name='" + name + '\'' +
                ", yas=" + yas +
                ", Weight=" + weight +
                ", height=" + height +
                '}';
    }
}
