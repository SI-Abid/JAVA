public class MyClass {
    int x;
    int y;
    int z;

    public MyClass() {
        this(0);
    }
    public MyClass(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public MyClass(int x, int y) {
        this(x, y, 0);
    }
    public MyClass(int x) {
        this(x, 0);
    }
    int getSum() {
        return x + y + z;
    }
    public static void main(String[] args) {
        MyClass mc1 = new MyClass();
        MyClass mc2 = new MyClass(10);
        MyClass mc3 = new MyClass(10, 20);
        MyClass mc4 = new MyClass(10, 20, 30);
        
        System.out.println("mc1: " + mc1.getSum());
        System.out.println("mc2: " + mc2.getSum());
        System.out.println("mc3: " + mc3.getSum());
        System.out.println("mc4: " + mc4.getSum());
    }
}
