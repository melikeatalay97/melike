package thread;

public class MyThread extends Thread{

    Printer printer;

    public MyThread(Printer printer) {
        this.printer = printer;
    }

    public void run(){
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        printer.printDocuments(10, "Alihan's Documents");
    }
}
