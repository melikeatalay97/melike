package thread;

public class MultiThreading01 {
    public static void main(String[] args) {

        long appNoThreadStarted = System.currentTimeMillis();
        System.out.println("Applications without Thread is started");

        MyTask1 myTask1 = new MyTask1();
        myTask1.executeTask();

        for(int i=1; i<=10; i++){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Printer 2 is working " + i);
        }
        System.out.println("Application without Thread is finished");

        long appNoThreadEnd = System.currentTimeMillis();
        System.out.println("Total execution time is without Thread " + (appNoThreadEnd-appNoThreadStarted)); //Total execution time is without Thread 1692


        long appWithThreadStarted = System.currentTimeMillis();
        System.out.println("Application with Thread is started");
        //task 1
        MyTaskWithThread1 myTaskWithThread1 = new MyTaskWithThread1();
        myTaskWithThread1.start();

        //join() method waits to die/terminate task1 should be finished task to should be start.
        try {
            myTaskWithThread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //task 2
        for(int i=1; i<=10; i++){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Printer 4 is working "+i);
        }
        System.out.println("Application with Thread is ending");

        long appWithThreadEnd = System.currentTimeMillis();
        System.out.println("Total execution time is with Thread " + (appWithThreadEnd-appWithThreadStarted)); //Total execution time is with Thread 592




    }
}
