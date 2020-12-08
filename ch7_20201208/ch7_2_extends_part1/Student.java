/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20201208.ch7_2_extends_part1;

/**
 *
 * @author xvpow
 */
public class Student  extends Person {
   public Student(){  }
   //super() 呼叫父類別建構式
   //限制 只能是建構式的第一筆命令
   //Person 是 Student的父類型
   //Student 是 Person子類型
   
   public Student(String name,int age,float height){
	super(name,age,height);
   }
}
