package nested;

abstract class A {
    abstract void foo();
}

public class AnonymousOuter {
    public static void main(String[] args) {
        // A bar = new A() {
        //     public void foo() {
        //         System.out.println("Good afternoon");
        //     }
        // };
        // bar.foo();
        new A() {
            public void foo() {
                System.out.println("Good afternoon");
            }
        }.foo();
    }
}