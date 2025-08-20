package OCA.src.Q139;

public class Q139 {
	 int count;

	public static void displayMsg() {

//		System.out.println("Welcome visit count"+ count++); // line n1
		// hata burda cunku count u static bir method icinde cagirmaya calismis
		// instance variable asagidaki static methodun icinde cagiramiyoruz
	}
	public static void main(String[] args) {
		Q139.displayMsg(); //class name ilede cagrilir
		displayMsg();   //line 2
	}

}
/* answer line 1 complition error
	What is the result?
		A.	Welcome Visit Count:0Welcome Visit Count: 1
		B.	Compilation fails at line n2.
		C.	Compilation fails at line n1.
		D.	Welcome Visit Count:0Welcome Visit Count: 0

		Answer: C
*/
