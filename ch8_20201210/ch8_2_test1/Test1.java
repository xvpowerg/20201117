/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20201210.ch8_2_test1;


public class Test1 {
    public Test1(){
	this(12,30);
	System.out.println("Test1()");
    }
    public Test1(int v1,int v2){
	System.out.printf("Test1 v1:%d v2:%d %n",v1,v2);
    }
}
