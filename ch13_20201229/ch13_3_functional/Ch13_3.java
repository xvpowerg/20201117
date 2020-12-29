/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch13_20201229.ch13_3_functional;

/**
 *
 * Functional Interfaces
 * 使用介面模擬方法
 * Functional Interfaces 只能抽象的方法只能有一個
 */
public class Ch13_3 {
   static void replace(int[] values,
	   int repValue,
	   MyPredicate myPredicate){       
       for (int i =0; i <values.length;i++){
	     int v = values[i];
	   if (myPredicate.test(v)){
	        values[i] = repValue;
	   }	  
       }
   }
	 
    public static void main(String[] args) {
	IntPredicate ip = new IntPredicate();
	int[] values = {8,1,30,6,7};
	replace(values,75,ip);
	for (int v : values){
	    System.out.println(v);
	}
    }
    
}
