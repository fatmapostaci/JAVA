package OCA.src.Q165;

public class OraString {
    String s;
    public boolean equals(OraString str) {
        return this.s.equalsIgnoreCase(str.toString());
    }

    OraString(String s) {
        this.s = s;
    }

    public static void main(String[] args) {
        String s1 = "Moon";
        OraString s2 = new OraString("Moon");
        if ((s1 == "Moon") && (s2.toString().equals("Moon"))) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }
        if (s1.equalsIgnoreCase(s2.s)) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }

    }
}
/*
What is the result?
A.	AC
B.	BD
C.	BC
D.	AD



 Answer: C
 */

