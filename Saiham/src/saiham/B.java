package saiham;

public class B {
    synchronized public void bar(A a) {
        String name = Thread.currentThread().getName();

        System.out.println(name + " entered B.bar()");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("B.bar Interrupted");
        }

        System.out.println(name + " trying to call A.last()");
        a.last();
    }

    synchronized public void last() {
        System.out.println("Inside B.last()");
    }
}
