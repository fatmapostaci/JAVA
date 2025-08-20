package learnJava.src.dersler.gun13.LoopTasks;

public class Task22 {

    public static void main(String[] args) {

        /* task-> 100'den 0'a kadar bütün tek sayıları print eden code create ediniz.
        99-98-97-96....
        100 ve 0 dahil değildir.*/
        for (int i = 100; i >0 ; i--) {
            if(i%2==1)
                System.out.print("-" + i);

        }


    }
}
