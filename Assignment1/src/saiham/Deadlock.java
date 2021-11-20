package saiham;

public class Deadlock implements Runnable {
    
    A a = new A();
    B b = new B();

    Deadlock() {
        Thread.currentThread().setName("Dog Thread");
        new Thread(this, "Cat Thread").start();

        a.foo(b);
        System.out.println("Back in Dog Thread");
    }

    public void run() {
        b.bar(a);
        System.out.println("Back in Cat Thread");
    }
    
    public static void main(String[] args) {
        new Deadlock();
    }
}
