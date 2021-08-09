package com.Thread;

/**
 * @author CoulsonZero
 * @version 2021-05-17 11:49
 */
public class ThreadDemo3 {
    public  static final int delay = 10;
    public  static final int steps =100;
    public  static final double max_amount = 1000;

    public static void main(String[] args) {
        var bank = new Bank(4, 100000);
        Runnable task1 = () ->{
            try {
                for (int i = 0; i< steps; i++) {
                    double amount = max_amount * Math.random();
                    bank.transfer(0,1,amount);
                    Thread.sleep((int) (delay * Math.random()));
                }
            } catch (InterruptedException e) {
//                e.printStackTrace();
            }
        };

        Runnable task2 = () ->{
            try {
                for (int i = 0; i< steps; i++) {
                    double amount = max_amount * Math.random();
                    bank.transfer(2,3,amount);
                    Thread.sleep((int) (delay * Math.random()));
                }
            } catch (InterruptedException e) {
//                e.printStackTrace();
            }
        };
        long start = System.currentTimeMillis();
        new Thread(task1).start();
        new Thread(task2).start();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
