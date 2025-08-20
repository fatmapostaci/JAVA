package learnJava.src.codeChallenge.ALLSUBJECTS.method.overriding;

public class MainClass {
    public static void main(String[] args) {
        BaseClass subclass = new SubClass();
        subclass.display();

            Bank bank = new Bank();
            ZiraatBank ziraat = new ZiraatBank();
            HalkBank halk = new HalkBank();
        bank.setInterestRate(5);
        ziraat.setInterestRate(6);
        halk.setInterestRate(7);
        System.out.println(bank.getInterestRate());
        System.out.println(ziraat.getInterestRate());
        System.out.println(halk.getInterestRate());
    }


}
