/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20201208.ch7_1_construct;

/**
 *
 * @author xvpow
 */
public class Ch7_1 {
	//建構式(Constructor)
       //初始值
    public static void main(String[] args) {
	Person p1 = new Person();
	p1.setName("Tom");
	p1.setHeight(151);
        p1.setAge(6);
	p1.printInfo();

	System.out.println();
	
	Person p2 = new Person("Lucy",56,21);
	p2.printInfo();
	
	
	
    }
    
}

