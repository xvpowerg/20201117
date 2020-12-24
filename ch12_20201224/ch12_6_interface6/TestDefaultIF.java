/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20201224.ch12_6_interface6;

/**
 *
 * @author xvpow
 */
public interface TestDefaultIF {
    public abstract void test1();
    public default void test1Default(){
	System.out.println("test1Default!!");
    }
}
