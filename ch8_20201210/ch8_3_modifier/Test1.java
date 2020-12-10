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
public class Test1 {
    //存取修飾詞
    //public 最開放所有都可讀寫
    //protected 在相同package或繼承時能讀寫
    //default(空白就是default) 只有在相同package才能讀寫
    //private 最不開放 只有在當前類別讀寫

    public String publicValue = "T1 Public";
    protected String protectedValue = "T1 Protected";
    String defaultValue = "T1 Default";
    private String privateValue = "T1 Private";

    //存取修飾詞 也適用於方法
    public void publicMethod() {
	System.out.println("T1 publicMethod");
    }
    protected void protectedMethod() {
	System.out.println("T1 protectedMethod");
    }
    void defaultMethod() {
	System.out.println("T1 defaultMethod");
    }
    private void privateMethod() {
	System.out.println("T1 privateMethod");
    }
}
