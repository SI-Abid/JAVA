import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out, true);
        out.println("Hello, World!");
        int d=10;
        out.println(d);
        double f=2.8e-4;
        out.println(f);
    }
}
