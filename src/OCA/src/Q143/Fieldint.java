package OCA.src.Q143;

public class Fieldint { //Public class Fieldinit
	char c;
	boolean b;
	float f;
	void printAll() {
		System.out.println("c = "+c);//c=
		System.out.println("b = "+b);//b=false
		System.out.println("f = "+f);//f=0.0
		int ii= ' ';
		System.out.println(ii);
	}
	public static void main(String[] args) {
		Fieldint f=new Fieldint();
		f.printAll();

	}

}
/* What is the result?
A) 	c =
	b = false
	f = 0.0

B) 	c = null
	b = true
	f = 0.0

C) 	c = 0
	b = false
	f = 0.0f

D) 	c = null
	b = false
	f = 0.0F
 */