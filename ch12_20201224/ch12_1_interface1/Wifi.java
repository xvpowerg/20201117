/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20201224.ch12_1_interface1;

/**
 *
 * @author xvpow
 */
public interface Wifi {
    //介面內一般方法都是public且抽象
    public abstract void input(String data);
    String output();
    
}
