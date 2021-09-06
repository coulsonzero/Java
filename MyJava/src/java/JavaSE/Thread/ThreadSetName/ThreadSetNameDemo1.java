package java.JavaSE.Thread.ThreadSetName;

/**
 * @author coulson
 * @version 2021-08-07 12:24
 */
public class ThreadSetNameDemo1 {
    public static void main(String[] args) {
        ThreadSetName1 t1 = new ThreadSetName1();
        ThreadSetName1 t2 = new ThreadSetName1();

        t1.setName("永生");
        t2.setName("觉醒");
    }
}
