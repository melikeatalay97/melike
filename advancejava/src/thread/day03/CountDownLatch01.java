package thread.day03;
      /*
        A synchronization aid that allows one or more threads to wait until a set of operations being performed
        in other threads completes.
     */
import java.util.concurrent.CountDownLatch;

public class CountDownLatch01 {
    public static void main(String[] args) {

        // CountDownLatch is used to make sure that a task waits for other threads before it starts.
        CountDownLatch latch = new CountDownLatch(4); //if we make this 2 2 threads will run first the other ones will come randomly

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
//                try {
//                    latch.await();
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
                System.out.println("Thread 1 is running");
            }
        });
        thread1.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
//                try {
//                    latch.await();
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
                System.out.println("Thread 2 is running");
            }
        });
        thread2.start();

        //creating our task
        AssignTaskThread first = new AssignTaskThread(2000,latch,"Team-1 ");
        AssignTaskThread second = new AssignTaskThread(4000,latch,"Team-2 ");
        AssignTaskThread third = new AssignTaskThread(5000,latch,"Team-3 ");
        AssignTaskThread forth = new AssignTaskThread(6000,latch,"Team-4 ");

        //starting all the threads
        first.start();
        second.start();
        third.start();
        forth.start();

        try {
            latch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //these codes on my main thread
        System.out.println("main Thread has finished");
        System.out.println("Code is ready to be submitted to QA Team");

    }
}

class AssignTaskThread extends Thread {
    private int delay;
    private CountDownLatch latch;

    //constructor
    public AssignTaskThread(int delay, CountDownLatch latch, String name) {
        super (name);
        this.delay = delay;
        this.latch = latch;
    }

    public void run(){
        try {
            System.out.println(Thread.currentThread().getName()+" Team started");
            Thread.sleep(delay);
            System.out.println(Thread.currentThread().getName()+" Team finished");
            latch.countDown();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
