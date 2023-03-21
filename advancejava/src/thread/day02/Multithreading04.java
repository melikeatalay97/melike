package thread.day02;

import thread.day01.MyTaskWithThread1;

public class Multithreading04 {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        Brackets1 brackets1 = new Brackets1();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<7; i++){
                    brackets1.generateBrackets();
                }
            }
        });
        thread1.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<7; i++){
                    brackets1.generateBrackets();
                }
            }
        });
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //these lines will wait until the thread die or terminate
        System.out.println("End of the code");
        long endTime = System.currentTimeMillis();
        System.out.println("Time executed is "+(endTime-startTime));  //Time executed is 1881

    }
}

class Brackets1{

    // [[[[[ ]]]]]
    public void generateBrackets(){
        //this --> the thread which calls this method
        //         block/locks the method block
        //when the thread finishes its task, the block will be released for other threads
        synchronized (this){
            for(int i=0; i<10; i++){
                if(i<5){
                    System.out.print("[");
                }else{
                    System.out.print("]");
                }
            }
            System.out.println("");
        }
        //delaying the method
        for(int i=0; i<5; i++){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

