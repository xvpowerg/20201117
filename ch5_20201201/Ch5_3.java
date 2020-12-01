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
public class Ch5_3 {
    public static void main(String[] args) {
	//會出現NullPointerException 因為v1會呼叫intValue()	
	Integer v1 = null;
	int ans = v1 + 20;	
	System.out.println(ans);	
    }
    
}
