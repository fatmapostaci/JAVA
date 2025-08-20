package OCA.src.Q189;

public class Test {

    public static int stVar = 100;
    public int var = 200;

    public String toString() {
        return stVar + ":" + var;
    }

    public static void main(String[] args) {
        Test t1 = new Test();
        t1.var = 300;
        System.out.println(t1);
        Test t2 = new Test();
        t2.stVar = 300;
        System.out.println(t2);
        System.out.println(t1);
    }
}
/*
What is the result?
A.  300:300
    200:300

B.  300:100
    200:300

C.  300:0
    0:300

D.  100:300
    300:200




Answer: D
 */