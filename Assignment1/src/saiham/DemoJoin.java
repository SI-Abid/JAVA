package saiham;

//Driver class
public class DemoJoin {

    //constructor
    public DemoJoin() {
        main(new String[]{"Saiham"});
    }
    
    public static void main(String[] args) {
        NewThreadJoin t1 = new NewThreadJoin("Thread 1");
        NewThreadJoin t2 = new NewThreadJoin("Thread 2");
        NewThreadJoin t3 = new NewThreadJoin("Thread 3");

        System.out.println("Thread 1 is alive:"+t1.t.isAlive());
        System.out.println("Thread 2 is alive:"+t2.t.isAlive());
        System.out.println("Thread 3 is alive:"+t3.t.isAlive());

        try {
            t1.t.join();
            t2.t.join();
            t3.t.join();
        }
        catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("Thread 1 is alive:"+t1.t.isAlive());
        System.out.println("Thread 2 is alive:"+t2.t.isAlive());
        System.out.println("Thread 3 is alive:"+t3.t.isAlive());

        System.out.println("Main thread exiting");
    }
}
