package com.Thread;

class ThreadDemo extends Thread {

    public void run() {
        System.out.println("Hello");
    }
}
class Myclass{
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        ThreadDemo t = new ThreadDemo();
        t.start();
        /*try {
            Thread.sleep(1000);     //1000ms = 1s
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        long end = System.currentTimeMillis();
        System.out.printf("执行时间%d ms\n", end-start);
    }
}
