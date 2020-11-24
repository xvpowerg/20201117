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
public class Ch3_2 {

    public static void main(String[] args) {
	//宣告模式
	int[] array1 = new int[5];//*
	int arrat2[]  = new int[5];
	
	//在宣告時給予初始數值 只能用在宣告時
	int[] array3 = {5,9,4,2,3};
	//賦予數值的方式	
	int[] array4 = new int[]{9,5,6,1,8};
	//錯誤的因為array1已宣告過
	//array1 = {1,2,3}
	array1 = new int[]{1,2,3};
	
	for (int i =0; i< array3.length;i++){
	    System.out.print(array3[i]+" ");
	}
	  System.out.println();
	for (int v : array4){
	   System.out.print(v+" ");   
	}
	System.out.println();
    }
    
}
