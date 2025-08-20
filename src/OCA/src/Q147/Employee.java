package OCA.src.Q147;

public class Employee {
    private String name;
    private int age;
    private int salary;

    public Employee() {  // ***  burası soruda yok
    }

    public Employee(String name, int age) {
         setName(name);
         setAge(age);
         setSalary(2000);
     }
     public Employee(String name, int age, int salary) {
         this(name, age);
         setSalary(salary);
     }
     //getter and setter methods for attributes go here
     public void setSalary(int salary) {
         this.salary = salary;
     }
     public void setAge(int age) {
        this.age = age;
    }
     public void setName(String name) {
        this.name = name;
    }

    public void printDetails(){
        System.out.println(name+ " : "+ age + " : "+ salary);
    }
}
class Test{
    public static void main(String[] args) {
        Employee e1 = new Employee();  //we need to create default consturacter
        Employee e2 = new Employee("Jack", 50);
        Employee e3 = new Employee("Chloe", 40, 5000);

        e1.printDetails();
        e2.printDetails();
        e3.printDetails();
    }

}

/* What is the result?
A) Compilation fails in the Employee class
B) null : 0: 0
   jack: 50 : 0
   Chloe : 40 : 5000
C) null : 0 : 0
   jack: 50 : 2000
   Chloe : 40 : 5000
D) compilation fails in the Test class
E) Both the Employee class and the Test class fail to compile
*/