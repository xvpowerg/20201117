/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20201208.ch7_5_StringMethod;

/**
 *
 * @author xvpow
 */
public class Ch7_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	String msg = "ABCDEFG";
	System.out.println(msg.length());
	System.out.println(msg.isEmpty());
	System.out.println(msg.charAt(2));
	
	//題目輪巡字串的字元
	for (int i =0; i < msg.length();i++){
	    char c1 = msg.charAt(i);
	    System.out.println(c1);
//	     if (i ==  0 && !Character.isLetter(c1)){
//		 System.out.println("身份證出錯");
//		break;
//	     }
		    
	}
	
    }
    
}
