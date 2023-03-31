package multithreads.creation;

public class Counter extends Thread{
    String name;
    public Counter(String name){
        this.name=name;
    }

    public void run(){
        System.out.println(this.name+" has started");
        for (int i = 0;  i<100 ; i++) {
            System.out.println(this.name+" - "+i);
        }
        System.out.println(this.name+" has finished.");

    }

}
