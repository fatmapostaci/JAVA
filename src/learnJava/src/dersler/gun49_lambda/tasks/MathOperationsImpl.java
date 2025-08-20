package learnJava.src.dersler.gun49_lambda.tasks;

public class MathOperationsImpl {


    public static void main(String[] args) {









        MathOperations mathOperations =
                (a,b)-> {return a+b;};
        //kendi fonksiyonel arayüzümü tanımlayıp lambda ifadesi ile kullanalım
        MathOperations sum =   (a, b) -> {return a+b;};

        double toplam = sum.calculate(4,5);

        MathOperations subtract = (buyukSayi,kucukSayi) -> {return buyukSayi-kucukSayi ; };
        double fark = subtract.calculate(15,3);


        sum.selamla();

    }
}
