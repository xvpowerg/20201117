/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20201208.ch7_2_extends_part1;

import ch7_20201208.ch7_1_construct.*;

/**
 *
 * @author xvpow
 */
public class Person {
    private String name;
    private int age;
    private float height;
    //Constructor
    //default Constructor
    public Person(){}
    
    public Person(String name,int age,float height){
/*	    this.name = name;
	    this.age = age;
	    this.height = height;	    */
//因為IDE的快速補齊程式碼
	    this.setName(name);
	    this.setAge(age);
	    this.setHeight(height);	    
    }
    //this. 目前物件
    public void setName(String name){
	this.name = name;
    }
    public String getName(){
	return name;
    }
    public void setAge(int age){
	this.age = age;
    }
    public int getAge(){
	return age;
    }    
    public void setHeight(float height){
	this.height = height;
    }    
    public float getHeight(){
	return height;
    }
    
    public void printInfo(){
	System.out.printf("Name:%s Age:%d Height:%.2f ",getName(),getAge(),getHeight());
    }
}
