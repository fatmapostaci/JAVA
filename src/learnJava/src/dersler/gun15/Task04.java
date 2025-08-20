package learnJava.src.dersler.gun15;

public class Task04 {

    public static void main(String[] args) {
		/*
		task->  3 basamakli 4 ve 6 ya tam bolunebilen tam sayilari buyukten kucuge ve kaç tane oldugunu print eden code create ediniz.
		 */
        int counter=0;
        for (int i=999;i>=100;i--){
            if(i % 12 == 0)  {
                System.out.print( " " + i );
                counter++;
            }
        }
        System.out.println();
        System.out.println("4 ile 6 ya tam bölünen sayısı = " + counter);

    }

}
