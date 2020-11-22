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
public class Ch3_12 {

    static void test3(int i){
	System.out.println("Test3 Int");
    }
      
    static void test3(float i){
	System.out.println("Test3 float");
    }
    
    static void test4(float f){
	System.out.println("Test4 float");
    }
      static void test4(Integer i){
	System.out.println("Test4 Integer");
    }
      
    static void test5(Float f1){
	System.out.println("Float f1");
    }  
        static void test5(short s1){
	System.out.println("short s1");
    }  
    public static void main(String[] args) {
	// TODO code application logic here
	//overloading 多載規則
    //一樣類型
    //相同類型可相容
    //不同類型可相容
    //一樣的封箱類型 各自獨立彼此不相容
    
	byte b1 = 12;
	//相同類型可相容
	test3(b1);
	int v2 = 20;
	//test4(v2);
	//錯誤找不到類型
	//test5(10);
    }
    
}
