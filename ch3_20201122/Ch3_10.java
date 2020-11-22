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
public class Ch3_10 {
//多載考題
    static void test1(int a){
	System.out.println("test1 int");
    }
    static void test1(float a){
	System.out.println("test1 float");
    }
    public static void main(String[] args) {
	// TODO code application logic here
	test1(15.2f);
    }
    
}
