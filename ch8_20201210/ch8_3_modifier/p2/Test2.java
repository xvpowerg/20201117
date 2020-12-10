/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20201210.ch8_3_modifier.p2;
import  ch8_20201210.ch8_3_modifier.Test1;

public class Test2 extends Test1{
    Test1 t1 = new Test1();
    
    void test(){
	this.protectedValue = "AA";	
	this.protectedMethod();
	this.publicMethod();
    }
    
    
}
