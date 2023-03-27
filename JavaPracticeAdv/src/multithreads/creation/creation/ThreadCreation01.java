package multithreads.creation;

public class ThreadCreation01 {
    /*
       Task1: Counter class which extends the Thread class
              We'll create two methods that counts from 1 to 100.
     */

    public static void main(String[] args) {
        Counter counter1 = new Counter("Ronaldo");
        Counter counter2 = new Counter("Messi");

        counter1.start();
        counter2.start();


    }
}
