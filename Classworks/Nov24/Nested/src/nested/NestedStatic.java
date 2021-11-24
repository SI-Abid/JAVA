package nested;

public class NestedStatic {
    static int x = 1;
    static class Inner {
        void foo() {
            System.out.println("x = "+x);
        }
    }
    public static void main(String[] args) {
        // NestedStatic.Inner i = new NestedStatic.Inner();
        // i.foo();
        new NestedStatic.Inner().foo();
    }
}
