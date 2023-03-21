package thread.day01;

public class Printer {

    //synchronized keyword blocks/lock the method for one thread at a time
    synchronized void printDocuments(int numOfCopies, String docName){ //after we typed synchronized here it automatically prints the threads in order on the console but to see the sout comments in order we should also type join()
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for(int i=1; i<=numOfCopies; i++){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(">> Print "+docName+" "+i);
        }
    }
}
