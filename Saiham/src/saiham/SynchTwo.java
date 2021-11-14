package saiham;

//Driver class
public class SynchTwo {

    //constructor
    public SynchTwo() {
        main(new String[]{"Saiham"});
    }
    
    public static void main(String[] args) {
        CallMeTwo target = new CallMeTwo();
        CallerTwo ob1 = new CallerTwo(target, "Saiham");
        CallerTwo ob2 = new CallerTwo(target, "Islam");
        CallerTwo ob3 = new CallerTwo(target, "Abid");

        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }
        catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}
