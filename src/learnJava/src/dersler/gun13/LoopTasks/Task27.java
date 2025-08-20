package learnJava.src.dersler.gun13.LoopTasks;

public class Task27 {
    public static void main(String[] args) {
            /* Ex-1: Asagidaki ciktiyi verecek kodu yaziniz
            1.
                        IT: 1
                          QA: 1
                          QA: 2
                          QA: 3
                          .....
                        IT: 2
                          QA: 1
                          QA: 2
                          QA: 3
                          ....
                        IT: 3
                          QA: 1
                          QA: 2
                          QA: 3
                          ....
         */
        int it=3, qa=3;
        for (int i = 1; i <= it; i++) {
            System.out.println("IT: "+i);
            for (int j = 1; j <= qa; j++) {
                System.out.println("\tQA: "+j);
            }

        }


    }
}
