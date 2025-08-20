package learnJava.src.dersler.gun35.inheritance;



public class Human  {
    protected String name;
    protected int age;
    protected String gender;

    public Human(String name) {
        //student classı inherited to this constructor
        this.name = name;
    }

    public Human() {
    }
    /**
     * Her subsclass kendi metniyle kendini tanıtır
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
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
