package learnJava.srcHoca.j23encapsulation.tasks.task2.mertay;

public class Student {

   private String name;
   private int age;

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

   @Override
   public String toString() {
      return "{" +
              "Student name is" + name + '\'' +
              ",He is " + age +" years old"+
              '}';
   }
}
