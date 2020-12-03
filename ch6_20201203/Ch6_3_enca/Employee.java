/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6_20201203.Ch6_3_enca;

/**
 *
 * @author xvpow
 */
public class Employee {
    String name;
    int age;
   private int salary;
    
   void print(){
       System.out.printf("姓名:%s 年齡:%d 薪水:%d%n",
	       name,age,salary);
   }
   
   //寫入 set用在寫入 約定俗成
    public void setSalary(int inSalary){
	if (inSalary < 28000 || inSalary > 200000){
	    System.out.println("錯誤的薪水!");
	    return;
	}
	salary = inSalary;
    }
   
   //讀 get 
    public int getSalary(){
	return salary;
    }
}
