public class T {
    volatile int x;
    transient int y;
    int z;
    public static void main(String[] args) {
        T t = new T();
        t.x = 1;
        t.y = 2;
        t.z = 3;
        if(t instanceof Object) {
            System.out.println("object t of type T can be cast to Object");
        }
        if(t instanceof T) {
            System.out.println("t is an instance of T");
        }
    }

}
