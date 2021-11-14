package saiham;

// Driver class
public class SuspendResume {

    public SuspendResume() {
        main(new String[]{"Saiham"});
    }
    public static void main(String[] args) {
        NewThreadThree ob1 = new NewThreadThree("Thread one");
        NewThreadThree ob2 = new NewThreadThree("Thread two");
        
        /*
        //Older version of the code
        try {
            Thread.sleep(1000);
            ob1.t.suspend();
            System.out.println("Suspending thread One");
            Thread.sleep(1000);
            ob1.t.resume();
            System.out.println("Resuming thread One");
            ob2.t.suspend();
            System.out.println("Suspending thread Two");
            Thread.sleep(1000);
            ob2.t.resume();
            System.out.println("Resuming thread Two");
            } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
            }
            // wait for threads to finish
            try {
            System.out.println("Waiting for threads to finish.");
            ob1.t.join();
            ob2.t.join();
            } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
            }
            System.out.println("Main thread exiting.");
            */

        // New version of the code
        try {
            Thread.sleep(1000);
            ob1.suspend();
            System.out.println("Suspending thread One");
            Thread.sleep(1000);
            ob1.resume();
            System.out.println("Resuming thread One");
            ob2.suspend();
            System.out.println("Suspending thread Two");
            Thread.sleep(1000);
            ob2.resume();
            System.out.println("Resuming thread Two");
            } 
        catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
        
        System.out.println("Main thread exiting");
    }
}