package JavaSE.Thread.ThreadSleep;

/**
 * @author coulson
 * @version 2021-08-07 12:55
 */
public class ThreadSleepDemo {
    public static void main(String[] args) {
        TheadSleep t1 = new TheadSleep();
        TheadSleep t2 = new TheadSleep();
        TheadSleep t3 = new TheadSleep();

        t1.setName("永生");
        t2.setName("觉醒");
        t3.setName("斗罗");

        t1.start();
        t2.start();
        t3.start();
    }
}
