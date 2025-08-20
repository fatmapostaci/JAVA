package OCA.src.Q029;

import java.util.ArrayList;

public class Q029 {

	public static void main(String[] args) {
		ArrayList<Integer> points = new ArrayList<>();
		points.add(1); 				// adds int value to the index number 0 and so on
		points.add(2);
		points.add(3);
		points.add(4);
		points.add(null);
		points.remove(1); 		// removes index!!!
		points.remove(null); 	//removes object and returns boolean
		System.out.println(points);
	}
}
//	What is the result?
//		A.	A NullPointerException is thrown at runtime.
//		B. [1, 2, 4]
//		C. [1, 2, 4, null]
//		D. [1, 3, 4, null]
//		E. [1, 3, 4]
//		F. Compilation fails.
