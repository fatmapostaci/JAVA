package learnJava.src.dersler.gun49_lambda.tasks;


@FunctionalInterface
public interface MathOperations {

   double calculate(int a, int b);

    default void selamla(){
        System.out.println("Selamlar arkadaşlar...");
    }
}
