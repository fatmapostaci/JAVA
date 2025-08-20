package OCA.src.Q169.pants;




// line n1
public class Jeans {

    public void matchShirt() {
        //line n2
        String color = ""; // Bu satır soruda yok
        if(color.equals("Green")) {
            System.out.println("Fit");
        }
    }
    public static void main(String[] args) {
        Jeans trouser = new Jeans ();
        trouser.matchShirt();
    }

}
/* Which two sets of actions, independently, enable the code fragment to print Fit?

A). At line n1 insert: import Q169.Shirt;
    At line n2 insert: String color = Shirt.getColor();

B)  At line n1 insert: import Q169;
    At line n2 insert: String color = Shirt.getColor();

C)  At line n1 insert: import static Q169.Shirt.getColor;
    At line n2 insert: String color = getColor();

D)	At line n1 no changes required.
    At line n2 insert: String color = Shirt.getColor();

E)	At line n1 insert: import Shirt;
    At line n2 insert: String color = Shirt.getColor();

*/