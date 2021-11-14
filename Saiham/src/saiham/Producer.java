package saiham;

public class Producer implements Runnable {
    
    public Q2 q;

    public Producer(Q2 q) {
        this.q = q;
        new Thread(this, "Producer").start();
    }

    public void run() {
        for (int i = 1; i <= 10; i++) { // produce 10 items
            q.put(i);
        }
    }

}
