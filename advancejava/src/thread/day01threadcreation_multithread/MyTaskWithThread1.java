package thread.day01threadcreation_multithread;

public class MyTaskWithThread1 extends Thread{
    public void run(){
        for(int i=1; i<=10; i++){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Printer 3 is working "+i);
        }
    }
}
