package learnJava.src.codeChallenge.ALLSUBJECTS;

public class Encapsulations {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Ahmet");
        person.setAge(25);
        System.out.println(person.getName());
        System.out.println(person.getAge());
        person.setAge(-23);
        System.out.println(person.getAge());


        BankAccount bankAccount = new BankAccount("3123110",50000);
        bankAccount.setBalance(-3000);
        System.out.println(bankAccount.getBalance());
        bankAccount.depositMoney(500);
        bankAccount.withdrawMoney(200000);

    }
}
