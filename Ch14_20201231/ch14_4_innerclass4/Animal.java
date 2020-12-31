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
public abstract class Animal {
    private String name;
    private int age;
    abstract void skill();
    public Animal(String name,int age){
	this.name = name;
	this.age = age;
    }
    public String toString(){
	return name+":"+age;
    }
}
