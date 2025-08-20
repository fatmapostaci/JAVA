package learnJava.src.dersler.gun13.LoopTasks;

public class Task03 {
    public static void main(String[] args) {
        // task-> girilen sayının faktöriyelini print code create ediniz
        //falan faktöriyel=1'den falana kadar tamsayıların çarpımı->1*2*3*...*falan
        for (int i = 0; i < 5; i++) {
            System.out.print(i +" ");
            int toplam = 0;
            for (int j = 1; j < 5; j++) {
                toplam = toplam + j;
                System.out.print(toplam);
            }
            System.out.println(toplam+i+" ");
        }
    }
}
