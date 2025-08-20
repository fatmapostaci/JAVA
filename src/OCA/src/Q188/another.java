package OCA.src.Q188;

public class another {
    public static void main(String[] args) {
        CheckingAccount acct = new CheckingAccount((int) (Math.random() * 1000)); //Math.rondom() rondom bir rakam olustururyor.
        // line n1

        System.out.println(acct.getAmount());
    }
}
/*Which three lines, when inserted independently at line n1,
cause the program to print a 0 balance?
A.	acct.setAmount(-acct.getAmount());
B.	acct.amount = 0; <option D earlier>
C.	acct.setAmount(0);
D.	acct.getAmount() = 0; <option E earlier>
E.	this.amount = 0; <option A earlier>
F.	acct.changeAmount(0); <option F earlier>
G.	acct.changeAmount(-acct.amount); <option G earlier>





Answer:  B C G

*/