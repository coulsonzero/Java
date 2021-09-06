package java.JavaSE.Thread.ThreadSetDaemon;

/**
 * @author coulson
 * @version 2021-08-07 13:52
 *
 * setDarmon() 将此线程标记为守护线程，当运行的线程都是守护线程时，JVM将退出
 */
public class ThreadSetDaemonDemo {
    public static void main(String[] args) {
        ThreadSetDaemon t1 = new ThreadSetDaemon();
        ThreadSetDaemon t2 = new ThreadSetDaemon();

        t1.setName("关羽");
        t2.setName("张飞");

        // 设置主线程
        Thread.currentThread().setName("刘备");
        // 主线程守护(主线程结束之后，守护线程很快就会停止运行)
        // 自杀不也要挣扎两下！但不是立即停止
        t1.setDaemon(true);
        t2.setDaemon(true);



        t1.start();
        t2.start();


        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}
