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
public class PrintStringStyleCount implements PrintStringStyleIF{
    private int count=  0;
    public void print(String str){
	count++;
	System.out.println(count+":"+str);
    }
}
