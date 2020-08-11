package com.example.springboot.design;

/**
 * 单例模式
 */
public class Singleton {
    private static volatile Singleton singleton;
    private Singleton(){
        System.out.println("singleton init!");
    }

    public static synchronized  Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (null == singleton) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    public void doSomething() {
        System.out.println("do something!");
    }

}
