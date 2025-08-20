package OCA.src.Q001;

public class Test {

    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        if (x++ < ++y) {
            System.out.print("Hello ");
        }else {
            System.out.print("Welcome ");
        }
        System.out.print("Log " + x + ":" + y);  // x ix used again so x becomes 2
    }

}
    /* What is The Result?
        A.	Hello
            Log 2:2

        B.	Welcome
            Log 1:2

        C.	Welcome
            Log 2:1

        D.	Hello
            L og 1:2








 A    */
