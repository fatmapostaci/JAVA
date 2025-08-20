package learnJava.src.codeChallenge.ALLSUBJECTS;

public class BankAccount {
    private String accountNumber;
    private double balance ;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        if(!(balance<0))
            this.balance = balance;
        else
            this.balance = 0.0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(!(balance<0))
            this.balance = balance;
    }
    public void withdrawMoney(double money){
        if(balance==0) System.out.println("Hesapta para yok!");
        else if(balance>money) {
            balance -= money;
            System.out.println(money + " TL Para çekildi");
        }
        else
            System.out.println("Hesapta yeterli bakiye bulunmuyor. Mevcut bakiye : "+ balance);
    }
    public void depositMoney(double money){
        balance+=money;
    }
}
