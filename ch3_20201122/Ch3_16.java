/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch3_20201122;

/**
 *
 * @author xvpow
 */
public class Ch3_16 {

   static void myForLoop(int count){
       	for (int i =1;i<=count;i++){
	    System.out.print(i+" ");
	}
	  System.out.println();
   }
    public static void main(String[] args) {
	myForLoop(9);
	myForLoop(5);
	myForLoop(3);
    }
    
}
