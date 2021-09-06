package java.JavaSE.Thread;

/**
 * @author coulson
 * @version 2021-08-07 9:25
 *
 * 多线程的实现方式
 *   1. 继承Thread类
 *     a.定义一个类MyThread继承Thread类，重写run()方法
 *     b.在执行类Main中创建Mythread类的对象，用start()方法启动线程
 *
 * 线程名称
 *   t.setName()
 *   参数构造器
 *
 *  线程优先级
 *  t.setPriority(6)    //[1,10]，默认为5, 优先级高仅仅表示获取cpu的几率高！
 *
 *  线程控制
 *    a. sleep()      //暂停
 *    b. join()       //等待结束
 *    c. setDaemon()  //守护
 *
 */


public class MyThread extends Thread {
    // 设置线程名称
    MyThread(){
    }
    MyThread(String name){
        super(name);
    }

    // 封装被线程执行的代码，有些不需要执行不放在run方法内
    @Override
    public void run() {
        for (int i=0; i<100; i++) {
            System.out.println(getName() + ": " + i);
        }
    }
}
