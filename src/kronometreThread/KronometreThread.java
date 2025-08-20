package kronometreThread;

public class KronometreThread implements Runnable {


    private final String threadNameString;
    private Thread thread;


    public KronometreThread(String threadNameString) {
        this.threadNameString = threadNameString;
        System.out.println("constructor "+threadNameString);
    }

    /**
     * this method is overrided
     * run method counts numbers and multiple threads work at in that time.
     */
    @Override
    public void run() {
        System.out.println("run " +threadNameString);
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(threadNameString + " : " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException exception) {
            System.out.println("Kesildi " + threadNameString);
        }

        System.out.println("Thread bitti." +threadNameString);

    }

    /**
     * we start an instance of Thread class
     */
    public void startThread(){
        System.out.println("Thread nesnesi oluşturuluyor");
        if (thread==null){
            thread = new Thread(this,threadNameString);
            thread.start();

        }

    }
}