package nested;

public class LocalOuter {
    private int x=10;

    public void show() {
        class LocalInner {
            public void show() {
                System.out.println("x = " + x);
            }
        }
        LocalInner inner = new LocalInner();
        inner.show();
    }

    public static void main(String[] args) {
        // LocalOuter outer = new LocalOuter();
        // outer.show();
        new LocalOuter().show();
    }
}
