package learnJava.src.dersler.gun49_lambda.mentoring;

public class MathTestC {

    public static void main(String[] args) {

        // Asal sayı testi
        MathTest isPrime = number -> {
            if (number < 2) return false;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) return false;
            }
            return true;
        };

        // Pozitif kontrol testi
        MathTest isPositive = number -> number > 0;

        // Test örnekleri
        int number1 = 17;
        int number2 = -5;

        System.out.println(number1 + " is prime? " + isPrime.test(number1));
        System.out.println(number2 + " is positive? " + isPositive.test(number2));
    }
}
