package java.JavaSE.Thread;

/**
 * @author coulson
 * @version 2021-08-07 9:27
 */
public class Main {
    public static void main(String[] args) {
        // 通过参数构造器设置线程名称
        // Thread(String name)
        MyThread t1 = new MyThread("永生");
        MyThread t2 = new MyThread("觉醒");

        /**
         * 直接调用run()不会启动线程
         * t1.run();
         * t2.run();
         */

        /**
         * 法1：设置线程名称
         * void setName(String name)
         * t1.setName("子线程A");
         * t2.setName("子线程B");
         */

        // set线程优先级[1,10]，默认为5, 优先级高仅仅表示获取cpu的几率高！
        t1.setPriority(6);
        t2.setPriority(4);


        // 需要通过start()方法启动线程，然后由JVM调用此线程的run()方法
         t1.start();
         t2.start();

        // 获取线程名称
        // System.out.println(t1.getName()); // "永生"

        // static Thread currentThread() 返回对当前正在执行的线程对象的引用
        //System.out.println(Thread.currentThread().getName());  // main
    }
}
