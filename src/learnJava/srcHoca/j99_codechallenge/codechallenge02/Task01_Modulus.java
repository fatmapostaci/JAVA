package learnJava.srcHoca.j99_codechallenge.codechallenge02;

public class Task01_Modulus {
    // verilen 12345 sayisinin rakamlarini yukaridan asagiya dogru print eden code create ediniz.
    // Hint: use / and %
    //    input: 12345
    //    output:
    //      birler : 5
    //      onlar : 4
    //      yüzler : 3
    //      binler : 2
    //      onbinler : 1

    public static void main(String[] args) {
        int number =  12345;

        int birler = number % 10; // 5
        int onlar = (number / 10) % 10 ; // 4  number = 12345
        int yüzler = (number / 100 ) % 10; // 3
        int binler = ( number / 1000) % 10;
        int onbinler = (number / 10000) ;


        //int birler = number % 10; // 5
        //int onlar = (number /= 10) % 10 ; // 4  number = 1234
        //int yuzler = (number /= 10) % 10 ; // 3  number = 123
        //int binler = (number /= 10) % 10 ; // 2  number = 12
        //int onbinler = (number /= 10) ; // 1  number = 12
        System.out.println("number = " + number);

        System.out.println("birler = " + birler +
                "\nonlar = " + onlar +
                "\nyüzler = " + yüzler +
                "\nbinler = " + binler +
                "\nonbinler = " + onbinler);
 }
}
