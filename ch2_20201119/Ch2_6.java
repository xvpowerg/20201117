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
public class Ch2_6 {

    static int test1(){
       System.out.println("Test1");
	return 1;
    }
    
    static boolean test2(int count){
       System.out.println("Test2 :"+count);
	return true;
    }
    static void test3(int count){
	System.out.println("Test3 :"+count);
    }
    
    public static void main(String[] args) {
	// 1 2 4
	// 3 2 4
	int i,k = 1;
	for (i = test1();i <= 3&&test2(k);i++,test3(++k)){
	     System.out.println(i+"_"+k);
	}
	 System.out.println(i);
	 System.out.println(k);
	
    }
    
}
