/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20201215.ch9_2_exception1;

/**
 *
 * @author xvpow
 */
public class Student {
    private String name;
    private int age;
    public void setName(String name){
	this.name = name;
    }
    public void setAge(int age){
	//5 ~ 200 
	//小於5歲 或大於 200歲就顯示錯誤
	//顯示錯誤:年齡錯誤!!
	if (age < 5 || age > 200){
	//拋出例外 
	    throw new IllegalArgumentException("年齡錯誤");
	}
	this.age = age;
    }
    
    public void print(){
	System.out.println(name+":"+age);
    }
    
}
