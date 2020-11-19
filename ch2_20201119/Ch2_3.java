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
public class Ch2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	
	//switch 參數可傳入 byte short int char String enum
	
	final int RUN = 1;
	final int JUMP = 2;
	final int WALK = 3;
	int action = WALK;
	//case 後的變數必須是常數
	switch(action){
	     default:
		System.out.println("錯誤!");	
	      break;
	    case RUN:
		System.out.println("跑");
		break;	
	    case JUMP:
		System.out.println("跳");
		break;
	    case WALK:
		System.out.println("走");
		break;
	   
	}
	
	
    }
    
}
