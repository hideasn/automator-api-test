package com.hide.javainterfaceproject.test;

/**
 * @program: java-interface-project
 * @ClassName: Singleton1
 * @description: 单例模式-饿汉式
 * @author: HideAsn
 * @create: 2022-06-21
 */
public class Singleton1 {
    private static final Singleton1 singleton1 = new Singleton1();
    private Singleton1() {

    }

    public static Singleton1 getInstance(){
        return singleton1;
    }
}
