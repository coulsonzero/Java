package java.JavaSE.Thread.ThreadSetName;

/**
 * @author coulson
 * @version 2021-08-07 12:23
 */
public class ThreadSetName2 extends Thread {
    // 设置线程名称
    ThreadSetName2(){
    }
    ThreadSetName2(String name){
        super(name);
    }
    @Override
    public void run() {
        for (int i=0; i<100; i++) {
            System.out.println(getName() + ": " + i);
        }
    }
}