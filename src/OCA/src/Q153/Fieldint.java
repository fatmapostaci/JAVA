package OCA.src.Q153;

public class Fieldint {
    Character c;
    boolean b;
    float f;
    void printAll() {
        System.out.println("c= " + c);//c= null
        System.out.println("b= " + b);//b=false
        System.out.println("f= " + f);//f=0.0
    }
    public static void main(String[] args) {
        Fieldint f = new Fieldint();
        f.printAll();
    }

}
/* What is the result?
A)  c =
    b = false
    f = 0.0

B)  c = null
    b = true
    f = 0.0
C)  c = 0
    b = false
    f = 0.0F
D)  c = null
    b = false
    f = 0.0




    Answer is D
 */