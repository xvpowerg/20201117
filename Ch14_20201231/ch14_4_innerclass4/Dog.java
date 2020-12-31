/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch14_4_20201231.innerclass4;

/**
 *
 * @author xvpow
 */
//當我呼叫Dog的skill時會顯示 嗅覺
public class Dog extends Animal {
    public Dog(String name,int age){
	super(name,age);
    }
    public void skill(){
	System.out.println("嗅覺!");
    }
    
    public String toString(){
	return "Dog:"+super.toString();		
    }
}
