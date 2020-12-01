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
public class Ch5_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	//只要是true不分大小寫都可parse成為true 否則回傳 false	
	boolean b1 = Boolean.parseBoolean("TrUE");
	System.out.println(b1);
    }
    
}
