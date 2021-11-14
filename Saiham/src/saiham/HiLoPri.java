package saiham;

//Driver class
public class HiLoPri {

    //constructor
    public HiLoPri() {
        main(new String[]{"Saiham"});
    }
    
    public static void main(String[] args) {
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        Clicker hi = new Clicker(Thread.NORM_PRIORITY + 2);
        Clicker lo = new Clicker(Thread.NORM_PRIORITY - 2);

        hi.start();
        lo.start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        lo.stop();
        hi.stop();

        try {
            hi.t.join();
            lo.t.join();
        } catch (InterruptedException e) {
            System.out.println("InterruptedException caught");
        }

        System.out.println("Low priority thread: "+lo.click);
        System.out.println("High priority thread: "+hi.click);


        
    }
}
