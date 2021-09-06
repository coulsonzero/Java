package java.JavaSE.Thread.ThreadSetName;

/**
 * @author coulson
 * @version 2021-08-07 12:26
 */
public class ThreadSetName1 extends Thread {
    @Override
    public void run() {
        for (int i=0; i<100; i++) {
            System.out.println(getName() + ": " + i);
        }
    }
}
