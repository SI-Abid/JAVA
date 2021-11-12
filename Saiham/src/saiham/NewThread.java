package saiham;

public class NewThread implements Runnable {
    
    Thread t;

    public NewThread(){
        this("saiham");
    }

    public NewThread(String name){
        t = new Thread(this, name);
        t.start();
    }

    @Override
    public void run(){
        
    }

}
