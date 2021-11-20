import saiham.CurrentThreadDemo;
import saiham.DemoJoin;
import saiham.ExtendThread;
import saiham.HiLoPri;
import saiham.MultipleThreadDemo;
import saiham.PC;
import saiham.SuspendResume;
import saiham.Synch;
import saiham.SynchTwo;
import saiham.ThreadDemo;

/**
 * Author: Saiham Islam Abid
 * Date:   14/11/2021
 * Time:   11:00 PM
 * Package: saiham.*
 * Project: Saiham
 * Main: Main
 * Description: First lab assignment of Java Programming 53(E)
 * Topic: Multithreading
 * Reference: Java: The Complete Reference, Seventh Edition, by Herbert Schildt
 */
public class Main {
    public static void main(String[] args) {
  
        try {
            System.out.println("--------- Example of Current Thread ---------");
            new CurrentThreadDemo();
            Thread.sleep(2000);
            System.out.println("--------- Creating thread implementing Runnable interface ---------");
            new ThreadDemo();
            Thread.sleep(2000);
            System.out.println("--------- Creating thread extending Thread class ---------");
            new ExtendThread();
            Thread.sleep(2000);
            System.out.println("--------- Example of multiple thread ---------");
            new MultipleThreadDemo();
            Thread.sleep(2000);
            System.out.println("--------- Example of Thread join ---------");
            new DemoJoin();
            Thread.sleep(2000);
            System.out.println("--------- Example of Thread priority ---------");
            new HiLoPri();
            Thread.sleep(2000);
            System.out.println("--------- Example of synchronized method ---------");
            new Synch();
            Thread.sleep(2000);
            System.out.println("--------- Example of synchronized block ---------");
            new SynchTwo();
            Thread.sleep(2000);
            System.out.println("--------- Example of Producer-Consumer ---------");
            new PC();
            Thread.sleep(2000);
            System.out.println("--------- Example of Thread suspend and resume ---------");
            new SuspendResume();
            Thread.sleep(2000);

        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
