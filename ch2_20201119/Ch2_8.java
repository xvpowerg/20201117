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
public class Ch2_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	//標籤只能加在迴圈
	tag1:	
	for (int i =1;i<=5;i++){
	    System.out.println("Start :"+i);
	    for (int k = 1; k<=3;k++){
		  System.out.println("Start Body:"+k);	
		  if (i==3){
		      //break;
		      //continue;
		      //break tag1;
		      continue tag1; 
		  }
		  System.out.println("End Body:"+k);		
	    }
	    System.out.println("End :"+i);
	    System.out.println("========================");
	}
	
	
    }
    
}
