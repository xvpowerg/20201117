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
public class Ch2_1 {

    public static void main(String[] args) {
	int n = 10;	
	if (n % 2 == 0)
	    System.out.println("偶數1");
	    //System.out.println("偶數2");
	else
	    System.out.println("奇數1");
	    System.out.println("奇數2");
	//以上語法等同於    
//	    if (n % 2 == 0){
//	    System.out.println("偶數1");
//	    //System.out.println("偶數2");
//	    }else{
//	    System.out.println("奇數1");
//	    }
//	    System.out.println("奇數2");
	//三元運算子
	 int age = 18;
	 String msg = age >= 18? "成年":"未成年";
	 System.out.println(msg);
	
	
    }
    
}
