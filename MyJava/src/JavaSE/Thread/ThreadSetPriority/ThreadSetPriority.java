package JavaSE.Thread.ThreadSetPriority;

/**
 * @author coulson
 * @version 2021-08-07 12:49
 */
public class ThreadSetPriority extends Thread {
    @Override
    public void run() {
        for (int i=0; i<100; i++) {
            System.out.println(getName() + ": " + i);
        }
    }
}
