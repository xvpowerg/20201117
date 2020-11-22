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
public class Ch3_11 {
    static void test2(short s1){
	System.out.println("test2 Short");
    }
     static void test2(float f1){
	System.out.println("test2 Float");
    }
    public static void main(String[] args) {
	short s = 20;
	test2(20);//因為20為int short無法接收int類型 所以使用float接收
	test2(s);
    }
    
}
