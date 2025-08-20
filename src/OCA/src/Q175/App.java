package OCA.src.Q175;

public class App {

	static int foo; // soruda static değil
	static int bar;

	static void process() { //static method static olmayan variable cagiramassin
		foo += 10;  //Compile error verir int foo; oldugu      icin,
					//static int foo;yaparsan  --> Cevap: 10, 20
		bar += 10;
	}
	public static void main(String[] args) {
		App firstObj = new App();
		App.process();
		System.out.println(firstObj.bar);


		App secondObj = new App();
		App.process();
		System.out.println(secondObj.bar);

	}

}
/*	What is the result?
		A.	 10
			 20

		B.	A compile time error occurs

		C.	20
			20

		D. 	10
			10
*/
