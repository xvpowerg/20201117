/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch1_2201117;

/**
 *
 * @author xvpow
 */
public class Ch1_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	//比較兩參考型態是否相等 equals
	//字串當中equals 是比較字串當中的字元是否相等
	String st1 = "Ken";
	String st2 = new String("Ken");
	System.out.println(st1 == st2);
	System.out.println(st1.equals(st2));
	
	String st3 = null;
	String st4 = "";
	System.out.println(st3.equals(st4));
    }
    
}
