package java.JavaSE.Thread.ThreadStart;

/**
 * @author coulson
 * @version 2021-08-07 12:20
 */
public class ThreadStart extends Thread{
    // 封装被线程执行的代码，有些不需要执行不放在run方法内
    @Override
    public void run() {
        super.run();
    }
}
