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
public class Ch3_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	//parseBoolean  只要parse的數值不是true(不分大小寫) 就回傳false
	String strB = "true";
	boolean b1 =  Boolean.parseBoolean(strB);
	System.out.println(b1);
	 strB = "tRUe";
	 b1 =  Boolean.parseBoolean(strB);
	System.out.println(b1); 
	 strB = "aaaaa";
	 b1 =  Boolean.parseBoolean(strB);//回傳false
	System.out.println(b1); 
    }
    
}
