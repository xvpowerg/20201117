/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch3_20201124;

/**
 *
 * @author xvpow
 */
public class Ch3_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	//陣列的預設值
	//基本型態  預設值
	 //整數類型   0	 
	 //浮點數類型  0.0
	 //字元類型    空白字元
	 //布林類型    false
	//參考型態
	//一律為        null
	
	float[] heights = new float[3];
	for (float h : heights){
	    System.out.print(h+" ");
	}
	 System.out.println();
	 
	 String[] names = new String[3];
	 for(String n: names){
	     switch(n){
		 case "Ken":
		     break;
		 case "Vivin":
		     break;
		 default:
		     System.out.println("Default!!");
	     }
	     
	 }
	 
    }
    
}
