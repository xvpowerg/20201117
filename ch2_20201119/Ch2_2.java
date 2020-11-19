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
public class Ch2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	 //80 ~ 100 A
	 //70~79 B
	 //60 ~69 C
	 //其他   D
	 //score 不可小於0 不可大於100
	 // 最好不寫超過10幾個的else if
	 int score = 50;
	 if (score >= 80)  System.out.println("A");	     
	 else if(score >=70 )  System.out.println("B");	     
	 else if(score >= 60) System.out.println("C");	     
	 else System.out.println("D");	     
	 

	
	
    }
    
}
