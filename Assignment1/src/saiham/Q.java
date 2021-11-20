package saiham;
// An incorrect implementation of a producer-consumer problem.
public class Q {
    public int n;
    
    synchronized int get() {
        System.out.println("Got: " + n);
        return n;
    }

    synchronized void put(int n) {
        System.out.println("Put: " + n);
        this.n = n;
    }

}
