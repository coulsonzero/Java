package java.JavaSE.Thread.ThreadStart;

/**
 * @author coulson
 * @version 2021-08-07 12:17
 */
public class ThreadStartDemo {
    public static void main(String[] args) {
        ThreadStart t1 = new ThreadStart();
        ThreadStart t2 = new ThreadStart();

        /**
         * 直接调用run()不会启动线程
         * t1.run();
         * t2.run();
         * 需要通过start()方法启动线程，然后由JVM调用此线程的run()方法
         */

        t1.start();
        t2.start();
    }
}
