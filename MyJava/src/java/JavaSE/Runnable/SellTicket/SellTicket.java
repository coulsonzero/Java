package java.JavaSE.Runnable.SellTicket;

/**
 * @author coulson
 * @version 2021-08-07 14:21
 *
 *
 * synchronized (this)
 * 同步方法的锁对象：this
 *
 * static synchronized (className.class)
 * 同步静态方法的锁对象：类名.class (静态方法又称类方法，所以静态同步方法的默认锁为这个类)
 *
 * 线程安全的类：
 *   A. StringBuffer (JDK5开始StringBuilder更快，不同步)
 *   B. Vector       (ArrayList代替)  Collections.synchronized(new ArrayList<String>) 同步数组)
 *   C. Hashtable    (HashMap代替，ConcurrentHashMap线程安全高度并发)
 */
public class SellTicket implements Runnable {
    private int ticket = 100;

    @Override
    // 线程同步锁(数据同步)
    public synchronized void run() {
        while (true) {
            if (ticket > 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "正在出售第" + ticket + "张票");
                ticket--;
            }
        }
    }
}
