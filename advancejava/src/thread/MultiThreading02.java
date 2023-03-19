package thread;

public class MultiThreading02 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("-----Application with Thread is started-----");
        Printer printer = new Printer();

        MyThread myThread = new MyThread(printer);
        YourThread yourThread = new YourThread(printer);
        myThread.start(); //when we used run() instead of start() it works regularly
        myThread.join(); //yourThread wait for myThread to finish print documents
        //this is the first way to synchronize the thread
        yourThread.start();
        yourThread.run();///Note: If you call run() method you just call the run method it will not start the thread
        yourThread.join();
        System.out.println("Application is with Thread is finished");
    }
}
