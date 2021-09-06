package java.JavaSE.Runnable.Lambda;

/**
 * @author coulson
 * @version 2021-08-08 16:03
 */
public class LambdaThread {
    public static void main(String[] args) {
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
