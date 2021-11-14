package saiham;

public class Clicker implements Runnable {
    
    public long click = 0;
    public Thread t;
    private volatile boolean running = true;

    public Clicker(int p) {
        t = new Thread(this);
        t.setPriority(p);
    }

    public void run() {
        // volatile is used here to ensure that the value of running 
        // is examined each time the following loop iterates:
        while (running) {
            click++;
        }
    }

    public void stop() {
        running = false;
    }

    public void start() {
        t.start();
    }
}
