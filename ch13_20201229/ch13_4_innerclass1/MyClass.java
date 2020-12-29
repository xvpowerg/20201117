/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch13_20201229.ch13_4_innerclass1;

/**
 *
 * @author xvpow
 */
public class MyClass {
    //public protected  default(空白) private
     static class InnerClass{
	 private String msg;
	 InnerClass(String msg){
	     this.msg = msg;
	 }
	public void test1(int value){
	   System.out.println(value);
	} 
	public String toString(){
	    return this.msg;
	}
    }
}
