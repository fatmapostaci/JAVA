package OCA.src.Q126;

public class Q126 {

	public static void main(String[] args) {
		int array[] = {10, 20, 30, 40, 50};
		int x = array.length;
		// line n1

	}
}
/*
		Which two code fragments can be independently inserted at line n1 you enable
		the code to print the elements of the array in reverse order? (Choose two.)

A.	while (x>0) {
		x--;
		System.out.print(array[x]);
	}

B.  do {
		x--;
		System.out.print(array[x]);//ArrayIndexOutOfBoundsException
	} while (x>=0);

C. while (x>=0) {    // ArrayIndexOutOfBoundsException
	System.out.print(array[x]);
	x--;
	}

D. do {
	System.out.print(array[x]);// rrayIndexOutOfBoundsException
	--x;                   //Index 5 out of bounds for length 5
	}while (x>=0);

E. while (x > 0) {
	  System.out.print(array[--x]);
		}
	}}




			//Answer A ve E print eder ve 50 40 30 20 10 reverse olarak

*/