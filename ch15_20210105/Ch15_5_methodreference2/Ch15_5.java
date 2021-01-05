/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch15_20210105.Ch15_5_methodreference2;

/**
 *
 * @author xvpow
 */
public class Ch15_5 {
     static interface TestIF{
	 String test(int v1,String v2);
     }
     static String concatString(int v1,String v2){
	 String result = v1+":"+v2;
	 return result;
     }
 
    public static void main(String[] args) {
	
	    TestIF t1 = Ch15_5::concatString;
	  System.out.println(t1.test(95, "Msg!"));
    }
    
}
