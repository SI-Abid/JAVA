package saiham;

public class A {
    synchronized public void foo(B b) {
        String name = Thread.currentThread().getName();

        System.out.println(name + " entered A.foo()");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("A.foo interrupted");
        }

        System.out.println(name + " trying to call B.last()");
        b.last();
    }

    synchronized public void last() {
        System.out.println("Inside A.last()");
    }
}
