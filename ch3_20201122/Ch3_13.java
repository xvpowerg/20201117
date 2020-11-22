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
public class Ch3_13 {
	//一億
	//float
	static void test6(int v1,float v2){
	    System.out.println("Int Float");
	}
	//一億
	//int
	static void test6(int v1,int v2){
	      System.out.println("Int Int");
	}
	//模凌兩可
	//五千萬
	//int
	static void test7(float f1,int v1){
	    System.out.println("Float Int");	    
	}
	//一億
	//float
	static void test7(int f1,float v1){
	    System.out.println("Int Float");	    
	}
	
	
	static void test8(Integer f1,int v1){
	    System.out.println("Integer Int");	    
	}
	
	static void test8(int v2,float v1){
	    System.out.println("int float");	    
	}
    public static void main(String[] args) {
	 //一樣類型 最優先
	//相同類型可相容
	//整數 類型
	 //byte
	 //short
	 //int
	 //long
	 //浮點數 類型
	 //float
	 //double	 
	//不同類型可相容	    
	//一樣的封箱類型 各自獨立彼此不相容
	//多選項時，注意不可模凌兩可,必須有一個唯一的
	test6(2,6);	
	test7(3f,2);	
	test8(8,5);
	
	
    }
    
}
