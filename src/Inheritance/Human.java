package Inheritance;


/**
 * Human.java: Temel sınıf, ad, yaş ve cinsiyet özellikleri içeriyor.
 * Ayrıca genel bir @overrided introduceYourself metodu var.
 * Bu sınıf diğer sınıflar tarafından extend ediliyor
 */
public class Human  {
    protected String name;
    protected int age;
    protected String gender;
    private double salary;

    public Human(String name) {
        //student classı inherited to this constructor
        this.name = name;
    }

    public Human(String name,double salary) {

        try {
            this.name = name;
        } catch (Exception e) {
            this.name = null;
        }

        try {
            this.salary = salary;
        } catch (Exception e) {
            this.salary= 0.0;
        }
    }

    public Human() {
    }
    /**
     * Introduce yourself with basic details. Can be extended by subclasses.
     * @return A string representing the introduction of the human.
     */
    public String introduceYourself(){
        return "My name is " + name + ", I am " + age + " years old.";
    }
    public void sleep(){
        System.out.printf( "%s sleeps. \n" , name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age > 0 ? age : -1; // Negatif veya sıfır yaş kontrolü

    }

    public double getSalary() {
        return salary;
    }

    public String setSalary(double salary) {

        this.salary = salary;
        if(salary<50000)
             return "Zor geçiniyorum";
        else
           return "I love my job.";
    }

    public void setAge(int age) {
        this.age = age;
    }
}
