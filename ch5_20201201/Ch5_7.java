/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5_20201201;

/**
 *
 * @author xvpow
 */
public class Ch5_7 {
    /*
     一模一樣類型
    相同類型可相容
       什麼較相同類型?
         假設我有一個short類型 ,int ,long
    不同類型可相容        
    封箱類型    
    */
    
    static void test2(float f1){
	System.out.println("float");
    }    
    static void test2(short s2){
	System.out.println("short");	
    }
    
    static void test3(Integer i){
	System.out.println("Integer");
    }
    static void test3(float i){
	System.out.println("float");
    }
    
    static void test4(Float f1){
	System.out.println("Float");
    }    
    static void test4(short s1){
	System.out.println("short");
    }
    public static void main(String[] args) {
	//因為20是整數(int)
	test2(20);
	test3(63);

	//test4(12);//因為會把12轉換成Integer 但是 Float 不相容 Integer
	
    }
    
}
