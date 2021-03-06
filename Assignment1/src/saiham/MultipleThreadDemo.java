package saiham;

//Driver class
public class MultipleThreadDemo {

    //constructor
    public MultipleThreadDemo() {
        main(new String[]{"Saiham"});
    }
    
    public static void main(String[] args) {
        new NewThread("Sukanto");
        new NewThread("Abid");
        new NewThreadTwo("Earth");

        try {
            Thread.sleep(10000);
        }
        catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread exiting");
    }
}
