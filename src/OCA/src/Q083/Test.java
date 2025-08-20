package OCA.src.Q083;

public class Test {
    public static void main(String[] args) {
        Test ts = new Test();
        System.out.println(isAvailable);
        isAvailable = ts.doStuff();
        System.out.println(isAvailable);
    }
    public static boolean doStuff() {
        return !isAvailable;
    }
    static boolean isAvailable = true;
}
		/*
		 What is the result?
		A. Compilation fails.
		B. false true
		C. true false
		D. true true
		E. false false





		Answer: C
		 */

