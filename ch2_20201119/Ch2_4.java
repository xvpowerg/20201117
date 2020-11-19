/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch2_20201119;

/**
 *
 * @author xvpow
 */
public class Ch2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	
	//switch 參數是 null會出現java.lang.NullPointerException
	//case 參數不可重複
	String name = null;
	
	switch(name){
	    case "Vivin":
		System.out.println("業務經理");
		break;
	    case "Lindy":
		System.out.println("總經理");
		break;
	    case "Ken":
		System.out.println("研發經理");
		break;
	    default:
		System.out.println("錯誤!!");
		break;
	}
	
	
    }
    
}
