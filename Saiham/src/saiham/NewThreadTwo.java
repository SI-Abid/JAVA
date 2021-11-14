package saiham;

public class NewThreadTwo extends Thread {

    public NewThreadTwo() {
        this("Saiham's Thread");
    }

    public NewThreadTwo(String name) {
        super(name);
        System.out.println("Child Thread: "+this);
        start();
    }

    public void run(){
        try {
            for(int i = 5; i > 0; i--){
                System.out.println("Child Thread: " + getName() + " " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child Thread: " + this + " interrupted.");
        }
        System.out.println("Child Thread: " + this + " exiting.");
    }
    
}
