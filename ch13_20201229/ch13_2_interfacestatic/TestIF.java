/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch13_20201229.ch13_2_interfacestatic;

/**
 *
 * @author xvpow
 */
public interface TestIF {
    void func1();
    default void func2(){
	func1();
    }
    //interface static 方法不可呼叫 抽象方法 與 default方法
    static void fun3(){
	System.out.println("fun3!!!");
    }
   
}
