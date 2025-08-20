package learnJava.srcHoca.j09_breakandcontinue;

public class C03BreakNestedLoop {

    public static void main(String[] args) {
        /*
        iç içe döngülerde break kullanıldığında aktif olduğu döngüyü durdurur.
        Döngüleri etiketleyerek hangi döngünün durmasını istiyorsak kod akışını ona göre ayarlayabiliriz.
         */
            xy: // dış döngüyü "label" etiketledik busayedendirek dış döngüyü kesebiliriz.
            for(int i=1;i<=5;i++) {
                pq: // iç döngüyü etiketledik
                for (int j = 1; j <= 5; j++) {
                    if (i == 2 && j == 2) {
                        break xy;
                    }
                    System.out.println(i + " " + j);
                }
                System.out.println("dış döngü ->" + i);
            }
        }

}
