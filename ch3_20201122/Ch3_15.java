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
public class Ch3_15 {
	
    //遞迴
    static void test1(int n){
	System.out.println(n);
	if (n < 3){
	    test1(n+1);
	}
	System.out.println("End:"+n);
    }
    //5! 階乘
    // 5 * 4 * 3 * 2 * 1
    //5! = 4!*5
    //4! = 3!*4
    //3! = 2!*3
    //2! = 1!*2
    //1! = 1
    static int  factorial(int n){
	if (n == 1){
	    return 1;
	}	
	return  factorial(n-1) * n ;
    }

//factorial(1) return 1   
//factorial(1) * 2    
//factorial(2) * 3    
//factorial(3) * 4
//factorial(4) * 5
    
    public static void main(String[] args) {	
	test1(1);	
	System.out.println(factorial(5));
    }
 
    
}
