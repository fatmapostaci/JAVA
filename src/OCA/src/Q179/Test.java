package OCA.src.Q179;

public class Test {
    static int count = 0; //static son degeri aldi
    int i = 0;   //static int i --> olursa 5 : 5 print eder
    public void changeCount() {
        while (i < 5) {
            i++;  //i++ ile count++ yerleri degissede ayni sonuc 10:10 verir
            count++;
        }
    }
    public static void main(String[] args) {
        Test check1 = new Test();
        Test check2 = new Test();
        check1.changeCount();
        check2.changeCount();
        System.out.println(check1.count + " : " + check2.count);
    }
}
/*
What is the result?
A. 5 : 5
B. 10 : 10
C. 5 : 10
D. Compilation fails.

Answer: B

 */