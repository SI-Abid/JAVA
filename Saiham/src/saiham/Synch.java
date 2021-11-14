package saiham;

//Driver class
public class Synch {
    public static void main(String[] args) {
        CallMe target = new CallMe();
        Caller ob1 = new Caller(target, "Hello world");
        Caller ob2 = new Caller(target, "Goodbye world");
        Caller ob3 = new Caller(target, "I'm back");

        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } 
        catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}
