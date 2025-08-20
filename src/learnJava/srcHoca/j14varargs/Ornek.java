package learnJava.srcHoca.j14varargs;

public class Ornek {

        void o1( int... b){

            System.out.println(b.length);
        }
        void o1(char c, int... d){

            System.out.println(d[0]);
        }

        public static void main(String[] args) {

            Ornek vrg=new Ornek();
            vrg.o1(1,2,3,4,5,6,7);

        }
    }