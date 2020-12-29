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
public class Ch13_4 {

    /**
     * 內部類
     * 1 靜態內部類
     * 2 非靜態
     * 更好的封裝
     * 節省類別名稱
     * 方便
     * 3 匿名
     * 方便
     * 節省類別名稱     
     */
    public static void main(String[] args) {
	
	MyClass.InnerClass inclass = 
		new MyClass.InnerClass("Msg.....");
	inclass.test1(50);
	System.out.println(inclass);
    }
    
}
