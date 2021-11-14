package saiham;

public class Caller implements Runnable {
    public String msg;
    public CallMe target;
    public Thread t;

    public Caller(CallMe targ, String s) {
        target = targ;
        msg = s;
        t = new Thread(this);
        t.start();
    }

    public void run() {
        target.call(msg);
    }
    
}
