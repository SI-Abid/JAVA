import java.util.Scanner;

import utils.Cleaner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        System.out.println(Cleaner.linkEraser(text));
        sc.close();
    }
}
