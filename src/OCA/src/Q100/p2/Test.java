package OCA.src.Q100.p2;


import Q100.p1.Acc;

public class Test extends Acc {
		public static void main(String[] args) {
	        Acc obj = new Test();
//	        Acc obj2 = new Acc();
//			Test obj3 = new Test();
//			Test obj4 = new Acc();





	//Protected is inheritable to sub class (outside the package) so there for if
	// the sub class’ object was created then you could access to the protected variable.
	// But the object was created from super class

	    }
	}
	/**
	 Which statement is true?
	  A. Both p and s are accessible via obj.
	  B. Only s is accessible via obj.
	  C. Both r and s are accessible via obj.
	  D. p, r, and s are accessible via obj.

	 Answer: B
	 
	 
	 So, public can be reached from anywhere....
	 protected can be reached from the same package,
	 and if we need to reach from another package,
	 it needs to be extend from parent AND needs to
	 create an object from the child class...
	 Default only can be reached from same package...
	 Private only from same class.


	 */

