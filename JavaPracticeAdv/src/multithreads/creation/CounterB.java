package multithreads.creation;

public class CounterB implements Runnable{

    private String name;

    public CounterB(String name){
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(this.name+" has started");
        for (char i = 0; i < 'z'; i++) {
            System.out.println(this.name+"-"+i);
        }
        System.out.println(this.name+" has finished");
    }
}
