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
public class Ch3_14 {
    //參數傳入函數後是否有機會被修改
    //call by value 不改變參數 所有基本型態都是call by value
    static void callByValue(int a,int b){
	int c = b;
	b = a;
	a = c;
    }
    //call by reference 所有非基本型態都是call by reference
    //有可能改變參數
    static void callByRef(int[] array){
	int c = array[0];//56
	array[0] = array[1];//72
	array[1] = c;
    }
    
    public static void main(String[] args) {
	
	int a = 10,b=20;
	callByValue(a,b);
	System.out.println(a+":"+b);
	
	int[] array = {56,72};
	System.out.println(array[0]+":"+array[1]);
	callByRef(array);
	System.out.println(array[0]+":"+array[1]);
	
	
    }
    
}
