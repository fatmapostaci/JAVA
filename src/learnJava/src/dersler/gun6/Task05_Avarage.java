package learnJava.src.dersler.gun6;

public class Task05_Avarage {
            /* task->
        double num1 = 23.4;
        double num2 = 24.0;
        double num3 = 12;
        double num4 = 450.3;
        double num5 = 23000;

        bu double sayilarin ortalamasini bulunuz

     */

    public static void main(String[] args) {
        double avarage;
        double num1 = 23.4;
        double num2 = 24.0;
        double num3 = 12;
        double num4 = 450.3;
        double num5 = 23000;

        avarage = (num1+num2+num3+num4+num5)/5;
        System.out.println("avarage = " + avarage);

        System.out.printf("girilien sayıların ortalaması : %.3f",avarage);

    }

}
