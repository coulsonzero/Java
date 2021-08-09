package JavaSE.Runnable;

/**
 * @author coulson
 * @version 2021-08-07 14:08
 *
 * 相比继承Thread类, 实现Runnable接口的好处
 *   a. 避免了Java单继承的局限性
 *   b. 适合多个相同程序的代码去处理同一个资源的情况，把线程和程序的代码、数据有效分离，
 *      较好的体现了面向对象的设计思想。
 */
public class MyRunnableDemo {
    public static void main(String[] args) {
        MyRunnable myRun = new MyRunnable();

        /*
        Thread t1 = new Thread(myRun);
        Thread t2 = new Thread(myRun);
        */

        Thread t1 = new Thread(myRun, "永生");
        Thread t2 = new Thread(myRun, "觉醒");

        t1.start();
        t2.start();

    }
}
