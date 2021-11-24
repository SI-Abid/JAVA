package nested;

abstract class Y {
    abstract void foo();
    interface Z {
        void bar();
    }
}

public class NestedInterface extends Y implements Y.Z {
    public void bar() {
        System.out.println("In the bar");
    }
    public void foo() {
        System.out.println("Let's foo");
    }
    public static void main(String[] args) {
        // Y.Z z = new NestedInterface();
        // z.bar();

        new NestedInterface().foo();
        new NestedInterface().bar();
    }
}
