package JavaSE.Runnable;

/**
 * @author coulson
 * @version 2021-08-08 16:04
 */
public class MyRunableDemo2 {
    public static void main(String[] args) {
        /**
         * 实现类的方式实现需求
         * MyRunnable myRun = new MyRunnable();
         * Thread t = new Thread(myRun, "卡徒");
         * t.start();
         */

        // 匿名内部类的方式改进
        /*
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName() + ": " + i);
                }
            }
        }, "卡徒").start();
        */


        // lambda表达式改进1
        new Thread( () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        } ,"卡徒").start();

        // lambda表达式改进2
        //new Thread(() -> func(), "卡徒").start();

        // lambda表达式的方式改进3
        //new Thread(MyRunableDemo2::func, "卡徒").start();
    }

    private static void func() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}
