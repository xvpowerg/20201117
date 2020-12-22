/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11_20201222.ch11_6_abstract;

//無法創造出來的類型 抽象類
//但是可繼承Animal
//有點強制繼承的概念
public abstract class Animal {
    private String name;
    private int age;
  Animal(String name,int age){
	this.name = name;
	this.age = age;
    }
    public String toString(){
	return name+":"+age;
    }
}
