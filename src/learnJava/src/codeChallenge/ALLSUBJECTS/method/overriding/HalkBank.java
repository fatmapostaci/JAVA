package learnJava.src.codeChallenge.ALLSUBJECTS.method.overriding;

public class HalkBank extends Bank{
    @Override
    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public void setInterestRate(double interestRate) {
        super.setInterestRate(interestRate);
    }
}
