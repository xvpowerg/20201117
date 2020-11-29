/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4_20201126;

/**
 *
 * @author xvpow
 */
public class Ch4_3 {
    //討論的問題是:我有一函數可帶參數,參數是否可被改變?
 
    //call by value 不可能被改變
    //所有基本型態都是 call by value
    static void swap(int a,int b){
	int t = a;
	a = b;
	b = t;
    }
    //call by reference 有可能被改變
    static void swapArray(int[] array){
	int t = array[0];
	 array[0] =  array[1];
	 array[1] = t;
    }
    
    //所有非基本型態都是call by reference
    public static void main(String[] args) {
	
	int a= 10,b= 2;
	System.out.println(a+":"+b);
	swap(a,b);
	System.out.println(a+":"+b);
	System.out.println("=========================");
	int[] array = {5,7};
	System.out.println(array[0]+":"+array[1]);
	swapArray(array);
	System.out.println(array[0]+":"+array[1]); 
	
    }
    
}
