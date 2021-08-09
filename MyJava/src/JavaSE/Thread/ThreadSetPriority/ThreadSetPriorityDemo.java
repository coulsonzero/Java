package JavaSE.Thread.ThreadSetPriority;

/**
 * @author coulson
 * @version 2021-08-07 12:50
 */
public class ThreadSetPriorityDemo {
    public static void main(String[] args) {
        ThreadSetPriority t1 = new ThreadSetPriority();
        ThreadSetPriority t2 = new ThreadSetPriority();

        System.out.println(Thread.MAX_PRIORITY);  //10
        System.out.println(Thread.MIN_PRIORITY);  //1

        // 线程优先级[1,10]，默认为5, 优先级高仅仅表示获取cpu的几率高！
        t1.setPriority(7);
        t2.setPriority(4);
    }
}
