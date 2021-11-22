import java.io.*;

public class ShowFileThree {
    public static void main(String[] args) {
        int i;
        if(args.length != 1) {
            System.out.println("Usage: java ShowFile filename");
            return;
        }

        try (FileInputStream fin = new FileInputStream(args[0])) {
            do {
                i = fin.read();
                if(i != -1) System.out.print((char) i);
            } while (i != -1);
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            return;
        } catch (IOException e) {
            System.out.println("Error reading file " + args[0]);
            return;
        }
        
    }
}
