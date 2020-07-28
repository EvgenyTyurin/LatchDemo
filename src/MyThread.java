import java.util.concurrent.CountDownLatch;

public class MyThread extends Thread {

    private final CountDownLatch latch;

    public MyThread(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        System.out.println("My thread: Awaiting latch...");
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("My thread: Latch released, I'm free!");
    }
}
