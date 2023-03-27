package thread.day02;

public class WaitNotify {

    public static int balance = 0;

    public static void main(String[] args) {

        WaitNotify obj = new WaitNotify();

        //create thread 1
        Thread withDrawThread = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.withDraw(500);
            }
        });
        withDrawThread.setName("students");
        withDrawThread.start();

        //create thread 2
        Thread depositThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                obj.deposit(2000);
            }
        });
        depositThread.setName("parents");
        depositThread.start();
    }

    // create method for withDraw money
    public synchronized void withDraw(int amount){
        System.out.println(Thread.currentThread().getName() + " want to receive money");
        if(balance<=0 || balance<amount){
            System.out.println("Insufficient balance: "+ balance);
            System.out.println("Waiting for the deposit to be updated");
            try {
                wait(); // it waits up tp we call notify() or notifyAll()  method
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        if(balance>=amount){
            balance=balance-amount;
            System.out.println("Amount has been withDraw successfully. Current balance is "+ balance);
        }else{
            System.out.println("Insufficient balance" + balance);
            System.out.println("Ask your parents to deposit more");
        }
    }

    public synchronized void deposit(int amount){
        System.out.println(Thread.currentThread().getName()+" want to deposit amount");
        balance = balance+amount;
        System.out.println("The amount is deposited. The current balance is "+balance);
        notify(); // this notifies just one thread is waiting
        //notifyAll(); ==> this is notifies all waiting thread
    }

}



