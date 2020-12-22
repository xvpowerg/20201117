/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11_20201222.ch11_6_abstract;

/**
 *
 * @author xvpow
 */
public class Dog extends Animal {
    Dog(String name,int age){
	super(name,age);
    }
    
    public String toString(){
	return "Dog:"+super.toString();
    }
}
