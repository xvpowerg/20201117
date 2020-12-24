/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20201224.ch12_4_interface4;

/**
 *
 * @author xvpow
 */
public class PrintStringStyleName implements PrintStringStyleIF{
    public void print(String str){
	System.out.println("Name:"+str);
    }
}
