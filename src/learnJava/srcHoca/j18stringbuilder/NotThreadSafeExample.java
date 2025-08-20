package learnJava.srcHoca.j18stringbuilder;

public class NotThreadSafeExample {
    private static int counter = 0;

    public static void main(String[] args) {
        Runnable task = () -> {
            for (int i = 0; i < 5; i++) {
                counter++; // Aynı anda erişim tehlikeli
                System.out.println(Thread.currentThread().getName() + " Counter: " + counter);
            }
        };

        // İki thread aynı anda counter'ı artırmaya çalışıyor
        Thread thread1 = new Thread(task, "Thread 1");
        Thread thread2 = new Thread(task, "Thread 2");

        thread1.start();
        thread2.start();
    }
}
