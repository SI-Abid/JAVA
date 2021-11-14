package saiham;

public class CallerTwo implements Runnable {
    
    public String msg;
    public CallMeTwo target;
    public Thread t;

    public CallerTwo(CallMeTwo targ, String s) {
        target = targ;
        msg = s;
        t = new Thread(this);
        t.start();
    }

    public void run() {
        // Synchronized statement
        synchronized (target) {
            target.call(msg);
        }
    }
    
}
