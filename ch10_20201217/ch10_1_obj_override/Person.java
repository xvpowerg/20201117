/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10_20201217.ch10_1_obj_override;

/**
 *
 * @author xvpow
 */
public class Person {
    private String name;
    private int age;
    public Person(String name,int age){
	this.name = name;
	this.age = age;
    }
    public void print(){
	System.out.println(name+":"+age);
    }
    //來自於Object
    public String toString(){
	return name+":"+age;
    }   
   public boolean equals(Object obj){
       //X instanceof T  X是不是T這個類型呢?
       if (obj == null || obj instanceof Person == false) return false;
	Person person = (Person)obj;
	return this.age == person.age && this.name.
		equals(person.name);
    }
}
