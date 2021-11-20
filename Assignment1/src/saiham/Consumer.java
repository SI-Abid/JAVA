package saiham;

public class Consumer implements Runnable {
    
    public Q2 q;

    public Consumer(Q2 q) {
        this.q = q;
        new Thread(this, "Consumer").start();
    }

    public void run() {
        while (true) {
            q.get();
        }
    }
    
}
