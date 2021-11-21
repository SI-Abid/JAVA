import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TinyEdit {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String notes[] = new String[100];
        System.out.println("Enter lines of text.");
        System.out.println("Enter 'stop' to quit.");
        for(int i = 0; i < notes.length; i++) {
            notes[i] = br.readLine();
            if(notes[i].equals("stop")) {
                break;
            }
        }
        for(int i = 0; i < notes.length; i++) {
            if(notes[i].equals("stop"))
                break;
            System.out.println(notes[i]);
        }
    }
}
