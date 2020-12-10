/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20201210.ch8_3_modifier;

/**
 *
 * @author xvpow
 */
public class Ch8_3 {

//存取修飾詞 
    public static void main(String[] args) {
	
    //public 最開放所有都可讀寫
    //protected 在相同package或繼承時能讀寫
    //default(空白就是default) 只有在相同package才能讀寫
    //private 最不開放 只有在當前類別讀寫
    
    Test1 t1 = new Test1();
    
    System.out.println(t1.publicValue);
    System.out.println(t1.protectedValue);
    System.out.println(t1.defaultValue);
    
    t1.defaultMethod();
    t1.protectedMethod();
    }
    
}
