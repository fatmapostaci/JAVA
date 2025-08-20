package learnJava.src.STRING;

public class stringPool {

    public static void main(String[] args) {
        String a = "Hello";
        String b = "Hello";
        String c = new String("Hello");

        System.out.println("a.hashCode() = " + a.hashCode());  //69609650
        System.out.println("b.hashCode() = " + b.hashCode());  //69609650
        System.out.println("c.hashCode() = " + c.hashCode()); //69609650 ??

        System.out.println("a==b = " + (a == b));  //true
        System.out.println("(a==c) = " + (a == c));  //false
        System.out.println("a.equals(c) = " + a.equals(c));  //true
        System.out.println("a.equals(b) = " + a.equals(b));  //true

        b = b + " Mello";
        System.out.println("(a==b) = " + (a == b));  //false
        System.out.println("a.equals(b) = " + a.equals(b));  //false
        System.out.println("a.hashCode() = " + a.hashCode());  //69609650
        System.out.println("b.hashCode() = " + b.hashCode());  //-872084151

        a = "hello kardeş";
        System.out.println("a.hashCode() = " + a.hashCode());  //-573773648
        String d = "Hello";
        System.out.println("d.hashCode() = " + d.hashCode());

        String e = "hello kardeş";
        System.out.println("e.hashCode() = " + e.hashCode());  //-573773648

        //String x = 3;  //code does not compile

        System.out.println("(\"Hello\"==c) = " + ("Hello" == c));
        System.out.println("\"Hello\".equals(c) = " + "Hello".equals(c));
        System.out.println("(\"Hello\" == d) = " + ("Hello" == d));
        System.out.println("\"Hello\".hashCode() = " + "Hello".hashCode());

        String fatma = new String("Fatma");
        System.out.println("(\"Fatma\"==fatma) = " + ("Fatma" == fatma));
        System.out.println("\"Fatma\".hashCode() = " + "Fatma".hashCode());
        System.out.println("fatma.hashCode() = " + fatma.hashCode());


        StringBuilder sb = new StringBuilder("java");
        String s = new String("java");
        //   if (  sb == s  )    //Operator '==' cannot be applied to 'java. lang. StringBuilder', 'java. lang. String'
        //      System.out.println("true = " + true);


        //üstteki sout satırları çalışır, outputlar ekranda yazılır, sonra da exception atar.
        String letters = "abcdef";
        System.out.println("letters.length() = " + letters.length());  //6
        System.out.println("letters.charAt(3) = " + letters.charAt(3));  //d
       // System.out.println("letters.charAt(6) = " + letters.charAt(6));  //StringIndexOutOfBoundsException


        String m = "";
        System.out.println("m.hashCode() = " + m.hashCode());  //0
        //when you use += operator with variables of different data types,
        // Java performs an implicit type casting to ensure that the result fits
        // into the type of the variable on the left side of the assignment
        m += 2;    //m=2; deseydik compile etmezdi
        System.out.println("m.hashCode() = " + m.hashCode());   //50
        System.out.println("m = " + m);  //**************  //2
        String n = "";
        System.out.println("n.hashCode() = " + n.hashCode());  //0
        n+= ""+3+false+'x';
        System.out.println("n = " + n);  //3falsex
        System.out.println("n.hashCode() = " + n.hashCode());  //1031133608

        String p = ""+3;
        System.out.println("p.hashCode() = " + p.hashCode());  //51
        System.out.println("m.hashCode() = " + m.hashCode());  //50
        p+=54;
        System.out.println("p = " + p);  //354
        System.out.println("p.hashCode() = " + p.hashCode());  //50706




    }
}
