package OCA.src.Q123;
public class App {
    String myStr = "9009";
    public void doStuff(String str) {
        int myNum = 0;
        try {
            String myStr = str; // 7007
            myNum = Integer.parseInt(myStr); // 7007
        } catch (NumberFormatException ne) {
            System.err.println("Error");
        }
        System.out.println("myStr: " + myStr + ", myNum: " + myNum);
    }
    public static void main(String[] args) {
        App obj = new App();
        obj.doStuff("7007");

    }
}
/*
    A. myStr: 7007, myNum: 7007
    B. Error
    C. myStr: 9009, myNum: 7007
    D. myStr: 7007, myNum: 9009






     //Answer C myStr: 9009, myNum: 7007
*/
