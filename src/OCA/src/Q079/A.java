package OCA.src.Q079;


class C {
    public C() {
        System.out.print("C ");
    }
}

class B extends C {
    public B() {     //line n1
        System.out.print("B ");
    }
}
class A extends B {
    public A() {      // line n2
        System.out.print("A ");
    }

    public static void main(String[] args) {
        A a = new A(); //constructor run edilirken  parent to child class gider
    }
}





 /*
    What is the result?
    A. C B A
    B. C
    C. A B C
    D. Compilation fails at line n1 and line n2
    Answer: A

     */