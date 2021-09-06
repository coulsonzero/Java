package java.JavaSE.Thread.ThreadSetDaemon;

/**
 * @author coulson
 * @version 2021-08-07 13:51
 */
public class ThreadSetDaemon extends Thread {
    // 封装被线程执行的代码，有些不需要执行不放在run方法内
    @Override
    public void run() {
        for (int i=0; i<100; i++) {
            System.out.println(getName() + ": " + i);
        }
    }
}
