package learnJava.srcHoca.j100projects.project02.zoomanagement;

public class Bird extends Animal{
   private boolean canFly ;

   public Bird(String name, String species, int age,boolean canFly) {
      super(name, species, age);
      this.canFly = canFly;
   }

   public boolean isCanFly() {
      return canFly;
   }

   public void setCanFly(boolean canFly) {
      this.canFly = canFly;
   }
   // Bird objesini yazdırmak için toString metodunu overLoad etmeliyiz


   @Override
   public String toString() {
      return "name = "+ getName()+ "\n"
      + "species = "+ getSpecies()+ "\n"+
      "age = " + getAge()+"\n" +
      "canFly = "+ canFly ;
   }
}

