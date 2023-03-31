package multithreads.creation;

public class ThreadCreation03 {
    public static void main(String[] args) {
        /*
            Task 3: Create a thread by using an animal class.
                    Create a thread byb using lambda expressions
         */

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName("Messi");
                String name =Thread.currentThread().getName();
                for (int i = 0; i < 101; i++) {
                    System.out.println(name+" - " + i);
                }
            }
        });
        thread1.start();

        Thread thread2 = new Thread(()->{
            Thread.currentThread().setName("Ronaldo");
            String name =Thread.currentThread().getName();
            for (int i = 0; i < 101; i++) {
                System.out.println(name+" - " + i);
            }
        });
        thread2.start();

    }
}
