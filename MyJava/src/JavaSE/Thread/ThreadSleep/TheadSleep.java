package JavaSE.Thread.ThreadSleep;

/**
 * @author coulson
 * @version 2021-08-07 12:53
 */
public class TheadSleep extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+": "+i);

            // 设置线程暂停
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
