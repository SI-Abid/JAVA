package nested;

public class Nested {

    private int x=5;

    class Inner {
        public void print() {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        // Nested n = new Nested();
        // Nested.Inner i = n.new Inner();
        // i.print();
        
        new Nested().new Inner().print();
    }
}
