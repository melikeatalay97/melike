package multithreads.semaphore;

import java.util.concurrent.Semaphore;

public class Semaphore1 {
    public static void main(String[] args) {
        Semaphore semaphore= new Semaphore(3);
        Person person1 = new Person("Fred", semaphore);
        Person person2 = new Person("Wilma", semaphore);
        Person person3 = new Person("Betty", semaphore);
        Person person4 = new Person("Scooby", semaphore);
        Person person5 = new Person("Barnie", semaphore);
        Person person6 = new Person("Melike", semaphore);
        person1.start();
        person2.start();
        person3.start();
        person4.start();
        person5.start();
        person6.start();
    }
}

class Person extends Thread{
    private String name;
    private Semaphore semaphore;

    public Person(String name, Semaphore semaphore){
        this.name = name;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        System.out.println(name+" would like to enter to the cabin.");
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(name+" has entered to the cabin.");
        System.out.println(name+" is using the cabin.");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(name+" is getting out of the cabin.");
        semaphore.release();
    }
}
