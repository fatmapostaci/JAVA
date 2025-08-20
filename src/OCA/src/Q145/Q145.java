package OCA.src.Q145;

public class Q145 { //Class name is SumTest
	    public static void doSum(Integer x, Integer y) {
	        System.out.println("Integer sum is " + (x + y));
	    }

	    public static void doSum(double x, double y) {
	        System.out.println("double sum is " + (x + y));
	    }

	    public static void doSum(float x, float y) {
	        System.out.println("float sum is " + (x + y));
	    }
	    public static void main(String[] args) {  //once primitive cagrilir
	        doSum(10, 20);
	        doSum(10.0, 20.0);

	    }}
/* What is the result?
A.	double sum is 30.0
	float sum is 30.0

B.	float sum is 30.0
	double sum is 30.0

C.	Integer sum is 30
	double sum is 30.0

D.	Integer sum is 30
	float sum is 30.0






 */
