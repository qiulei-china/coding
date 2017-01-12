package com.weidian.qiulei.daily;

/**
 * Created by qiulei on 17/1/9.
 */
class A{
    public int i = 10;
    public void f() {
        System.out.println("A:f()");
    }
}
class B extends A{
    public int i = 20;
    @Override
    public void f() {
        System.out.println("B:f()");
    }
}

class Covariant{
    public A getObject() {
        return new A();
    }
}

class SubCovariant extends Covariant{
    @Override
    public B getObject() {      //协变类型B
        return new B();
    }
}

public class Day1_9 {
    public static void main(String[] args) {
        Covariant covariant = new SubCovariant();   //向上转型
        A a = covariant.getObject();
        a.f();                                      //方法被覆盖,多态
        System.out.println(a.i);                    //域不会被覆盖
    }
}
