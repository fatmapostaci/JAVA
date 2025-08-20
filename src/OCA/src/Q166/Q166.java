package OCA.src.Q166;

public class Q166 {

	public static void main(String[] args) {
		int x=100; //
		int a=x++; // a=100
		int b=++x; // b=102
		int c=x++; // c=102 , x=103
;
		int d=(a<b) ? (a<c)? a:(b<c)? b: c: x;


		int e=(a<b) ? ((a<c)? a:((b<c)? b: c)): x;
		System.out.println(d);
		System.out.println(e);

	}

}
/*
	What is the result?
		A. 100
		B. 101
		C. 102
		D. 103
		E.Compilation fails
		Answer: E



//		int e=(a<b) ? ((a<c)? a:(b<c)? b: c): x;
//		int f=(a<b) ? ((a<c)? a:((b<c)? b: c)): x;
//		System.out.println(e);
//		System.out.println(f);
*/