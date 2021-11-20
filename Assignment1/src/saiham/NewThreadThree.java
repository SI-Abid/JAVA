package saiham;

public class NewThreadThree implements Runnable {

    String name;
    Thread t;
    boolean suspended;

    NewThreadThree(String name) {
        this.name = name;
        t = new Thread(this, name);
        System.out.println("New Thread: " + t);
        suspended = false;
        t.start();
    }

    public void run() {
        try {
            for(int i = 15; i > 0; i--) {
                System.out.println("Thread: " + name + ", " + i);
                Thread.sleep(200);
                synchronized(this) {
                    while(suspended) {
                        wait();
                    }
                }
            }
        }
        catch (InterruptedException e) {
            System.out.println("Thread: " + name + " interrupted.");
        }
        System.out.println("Thread: " + name + " exiting.");
    }
    
    public void suspend() {
        suspended = true;
    }

    public void resume() {
        suspended = false;
        synchronized(this) {
            notify();
        }
    }
}
