package java.JavaSE.Runnable.SellTicket;

/**
 * @author coulson
 * @version 2021-08-07 14:26
 * <p>
 * 一个进程被多个线程执行，出现相同数据和负数，线程随机性导致的
 * <p>
 * 线程安全问题：
 * a. 是否多线程环境  (x)
 * b. 是否有共享数据  (x)
 * c. 是否有多条语句操作共享数据 ( /)-> 线程同步锁，让任意时刻只能有一个线程执行即可
 */
public class SellTicketDemo {
    public static void main(String[] args) {
        SellTicket st = new SellTicket();

        Thread t1 = new Thread(st, "窗口1");
        Thread t2 = new Thread(st, "窗口2");
        Thread t3 = new Thread(st, "窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
