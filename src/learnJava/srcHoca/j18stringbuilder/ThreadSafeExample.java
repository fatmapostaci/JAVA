package learnJava.srcHoca.j18stringbuilder;

public class ThreadSafeExample {
    private static int counter = 0;

    public static synchronized void incrementCounter() { // Senkronize metot
        counter++;
        System.out.println(Thread.currentThread().getName() + " Counter: " + counter);
    }

    public static void main(String[] args) {
        Runnable task = () -> {
            for (int i = 0; i < 5; i++) {
                incrementCounter(); // Kontrollü artış
            }
        };

        // İki thread aynı anda counter'ı artırmaya çalışıyor
        Thread thread1 = new Thread(task, "Thread 1");
        Thread thread2 = new Thread(task, "Thread 2");

        thread1.start();
        thread2.start();
    }
}
