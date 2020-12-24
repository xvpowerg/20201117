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
public class Ch12_1 {

    /**
     * 介面
     * 無法定義為類別的
     * 協定
     * 類別跟介面的關係是implements
     */
    public static void main(String[] args) {
	
	Wifi w = new WifiRouter();
	w.input("Ken");
	System.out.println(w.output());
	
	
	
    }
    
}
