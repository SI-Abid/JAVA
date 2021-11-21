import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Displays the contents of a file.
 * filename is taken from the command line.
 */
public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin;

        if(args.length != 1) {
            System.out.println("Usage: java ShowFile filename");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);
        }
        catch(FileNotFoundException e) {
            System.out.println("Error opening file " + args[0]);
            return;
        }

        try {
            do {
                i = fin.read();
                if(i != -1)
                    System.out.print((char)i);
            } while(i != -1);
        }
        catch(IOException e) {
            System.out.println("Error reading file " + args[0]);
        }

        try {
            fin.close();
        }
        catch(IOException e) {
            System.out.println("Error closing file " + args[0]);
        }
    }
}
