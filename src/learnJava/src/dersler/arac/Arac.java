package learnJava.src.dersler.arac;

public class Arac {
    String model;
    int maxHiz;

    public Arac(){
        this("Tesla");
        System.out.println("parametresiz constructor");
    }
    public Arac(String model){
        this.model=model;
        System.out.println("tek parametreli cons");
    }
    public Arac(String model, int maxHiz){

    }
    public  void Motor(){
        System.out.println("motor");
    }
  public void MotorStatic() {
      System.out.println("static");
    }
    public  void play(){
        Motor();

    }

}
