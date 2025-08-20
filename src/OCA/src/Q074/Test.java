package OCA.src.Q074;

class Test {
    void readCard(int cardNo) throws Exception {
        System.out.println("Reading Card");    //exception hem run time da hemde complie time a bakiyor
    }

    void checkCard(int cardNo) throws RuntimeException {  // line n1
        System.out.println("Checking Card");
    }

    public static void main(String[] args) {//yukarida yazildigi icin burayada atmak gerek Exception i
        Test ex = new Test();
        int cardNo = 12344;
      //  ex.readCard(cardNo);   // line n2
        ex.checkCard(cardNo);  // line n3
    }
}

/*
Main difference between RuntimeException and checked Exception is that
It is mandatory to provide try-catch or try finally block to handle checked Exception
and failure to do so will result in a compile-time error,
while in the case of RuntimeException this is not mandatory.
A)  Reading Card
    Checking Card
B)  compilation fails only at line n1
C)  compilation fails only at line n2
D)  compilation fails only at line n3
E)  compilation fails only at both line n2 and Line n3








compilation fails at line n2
*/