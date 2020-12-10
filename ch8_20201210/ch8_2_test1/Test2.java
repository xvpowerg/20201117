/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20201210.ch8_2_test1;


public class Test2  extends Test1{
	public Test2(){
	    this(20,30);
	    System.out.println("Test2()");
	}
	public Test2(int v1,int v2){
	    this(v1,v2,75);
	    System.out.printf("Test2 v1:%d v2:%d %n",v1,v2);
	}
	
	public Test2(int v1,int v2,int v3){	    
	    System.out.printf("Test2 v1:%d v2:%d v3:%d %n",v1,v2,v3);
	}
}
