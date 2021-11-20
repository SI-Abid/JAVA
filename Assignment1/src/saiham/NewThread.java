package saiham;

public class NewThread implements Runnable {
    
    public Thread t;

    public NewThread(){
        this("saiham");
    }

    public NewThread(String name){
        t = new Thread(this, name);
        System.out.println("Thread: " + t);
        t.start();
    }

    @Override
    public void run(){
        try {
            for(int i = 5; i > 0; i--){
                System.out.println("Thread: " + t.getName() + " " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread: " + t + " interrupted.");
        }
        System.out.println("Thread: " + t + " exiting.");
    }

}
