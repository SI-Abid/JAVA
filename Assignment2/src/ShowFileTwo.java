import java.io.*;

public class ShowFileTwo {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;
        if (args.length != 1) {
            System.out.println("Usage: java ShowFile filename");
            return;
        }
        try {
            fin = new FileInputStream(args[0]);
            do {
                i = fin.read();
                if(i!=-1)System.out.print((char) i);
            } while (i != -1);
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            return;
        } catch (IOException e) {
            System.out.println("Error reading file!");
            return;
        } finally {
            try {
                if (fin != null) fin.close();
            } catch (IOException e) {
                System.out.println("Error closing file!");
                return;
            }
        }
        
    }
}
