package saiham;

//Driver class
public class PC {
    
    //constructor
    public PC() {
        main(new String[]{"Saiham"});
    }

    public static void main(String[] args) {

        Q2 q = new Q2();
        new Producer(q);
        new Consumer(q);

    }
}
