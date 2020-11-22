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
public class Ch3_4 {


    public static void main(String[] args) {
	int dem = 117;
	//十進位轉成2進位
	 String binary = Integer.toBinaryString(dem);
	//十進位轉成8進位
	String octal = Integer.toOctalString(dem);
	//十進位轉成16進位
	String hex = Integer.toHexString(dem);
	
	System.out.println(binary);
	System.out.println(octal);
	System.out.println(hex);
	
	
    }
    
}
