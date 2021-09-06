package java.com.Thread;


class ThreadDemo2 implements Runnable {

    public void run() {
        System.out.println("Hello");
    }
}
class Myclass2 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Thread t = new Thread(new ThreadDemo2());
        t.start();

        /*try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/


        long end = System.currentTimeMillis();
        System.out.printf("执行时间%d ms\n", end-start);
    }
}
