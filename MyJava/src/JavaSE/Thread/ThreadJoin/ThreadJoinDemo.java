package JavaSE.Thread.ThreadJoin;
/**
 * @author coulson
 * @version 2021-08-07 13:01
 */
public class ThreadJoinDemo {
    public static void main(String[] args) {
        ThreadJoin t1 = new ThreadJoin();
        ThreadJoin t2 = new ThreadJoin();
        ThreadJoin t3 = new ThreadJoin();

        t1.setName("永生");
        t2.setName("觉醒");
        t3.setName("斗罗");

        t1.start();
        // 设置线程阻塞(该线程结束后其他线程才可抢占cup资源)
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();
        t3.start();
    }
}
