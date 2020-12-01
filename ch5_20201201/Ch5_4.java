/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5_20201201;

/**
 *
 * @author xvpow
 */
public class Ch5_4 {

  
    public static void main(String[] args) {
	//字串轉整數
	 //要轉換的數字必須無空格
	int value = Integer.parseInt("25");
	System.out.println(value + 10);
	float f2 = Float.parseFloat("1.25");
	System.out.println(f2 + 10);
	
	//10進位轉其他進位
	String binaryStr = Integer.toBinaryString(183);
	String octStr = Integer.toOctalString(183);
	String hexStr = Integer.toHexString(183);
	System.out.println("binary:"+binaryStr);
	System.out.println("Oct:"+octStr);
	System.out.println("Hex:"+hexStr);
	
    }
    
}
