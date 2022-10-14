package com.java8;

public class Main {
    public static void main(String[] args) {
        System.out.println("Testing");

        Runnable r = () -> System.out.println("Thread is running");
        r.run();

        AddInterface addInterface = (int a, int b) -> {
            return a + b;
        };
        System.out.println(addInterface.add(10,20));
        AddInterface add = (int a, int b)-> {return 10;
            };
        System.out.println();

        MulInterface mulInterface = (a,b)->{return a*b;};
        System.out.println(mulInterface.mul(5,10));
    }
}