/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch13_20201229.ch13_1_interfacedefault;

/**
 *
 * @author xvpow
 */
public interface Test1 {
    default void test(){
	System.out.println("Test1");
    }
}
