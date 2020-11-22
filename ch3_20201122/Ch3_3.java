/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch3_20201122;

/**
 *
 * @author xvpow
 */
public class Ch3_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	//Integer 類常用函數
	//字串轉int
	String st1 = "12";
	String st2 = "25";
	System.out.println(st2 + st1);
	//字串轉整數基本型態
	int v1 = Integer.parseInt(st1);
	int v2 = Integer.parseInt(st2);
	System.out.println(v1 + v2);
	
	//st1 = " 12";	
	//st1 = "AA";	
	st1 = "16 ";
	v1 = Integer.parseInt(st1);
	System.out.println(v1);
    }
    
}
