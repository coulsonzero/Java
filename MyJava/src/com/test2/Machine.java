package com.test2;

class Machine {
    public void start() {
        System.out.println("Starting...");
    }

    public static void main(String[] args) {
        Machine m1 = new Machine() {
            @Override
            public void start() {
                System.out.println("Wooooo");
            }
        };
        m1.start(); //"Wooooo"
        Machine m2 = new Machine();
        m2.start(); //"Starting"
    }
}

