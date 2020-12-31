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
//當我呼叫 Cat的skill時 會顯示 裝萌
public class Cat extends Animal{
    public Cat(String name,int age){
	super(name,age);
    }
    public void skill(){
	System.out.println("裝萌!");
    }
    
     public String toString(){
	return "Cat:"+super.toString();		
    }
}
