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
public class Ch3_9 {

   //多載
    //overloading
    //當函數名稱一樣時，依參數類型或數量決定呼叫的函數 
	    
    static int minus(int a,int b){
	System.out.println("minus int");
	return a - b;
    }

    static float minus(float a,float b){
	System.out.println("minus float");
	return a - b;
    }
    
    public static void main(String[] args) {
	int c = 8;
	int b = 2;
	int ans = minus(c,b);
	System.out.println(ans);
	float ansf = minus(5.2f,1.3f);
	System.out.println(ansf);
    }
    
}
