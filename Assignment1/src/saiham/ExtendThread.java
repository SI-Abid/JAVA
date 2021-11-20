package saiham;

//Driver class
public class ExtendThread {

    //constructor
    public ExtendThread() {
        main(new String[]{"Saiham"});
    }
    
    public static void main(String[] args) {
        new NewThreadTwo();

        try {
            for(int i=5; i>0; i--) {
                System.out.println("Main thread: " + i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread exiting.");
    }
}
