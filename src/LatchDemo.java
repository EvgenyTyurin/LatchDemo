import java.util.concurrent.CountDownLatch;

/**
 * Java concurrency: Latch mechanism demo
 */

public class LatchDemo {

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(1);
        MyThread myThread = new MyThread(latch);
        System.out.println("Main thread: Starting latched thread and waiting 5 sec...");
        myThread.start();
        Thread.sleep(5000);
        System.out.println("Main thread: Releasing latch!");
        latch.countDown();
    }

}
