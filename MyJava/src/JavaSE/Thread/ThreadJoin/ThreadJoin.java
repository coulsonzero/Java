package JavaSE.Thread.ThreadJoin;

/**
 * @author coulson
 * @version 2021-08-07 13:00
 */
public class ThreadJoin extends Thread {
    @Override
    public void run() {
        for (int i=0; i<100; i++) {
            System.out.println(getName() + ": " + i);
        }
    }
}
