package learnJava.src.dersler.gun34.bmi;

public class BMI {

    /*
    Task->
     Bmi class fields -> name, age, weight,height: encapsulated
     getBMI() method -> bmi=weight/(height*height) return type olmalı
     getStatus() method -> bmi 18.5 ten kucukse zayif, 25 ten kucukse normal,
     30 dan kucukse kilolu, 30 ustu obez return type
     Runner class obj ile dataları print eden code create ediniz
     */
    String name;
    int age;
    double weight;
    double height;

    public BMI(String name, double height, double weight, int age) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = age;
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

    public double getBMI() {

        return weight / (height * height);
    }

    @Override
    public String toString() {
        return "BMI{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
