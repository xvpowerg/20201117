/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20201215.ch9_1_override1;

/**
 *
 * @author xvpow
 */
public class Test1 {
    public void test1Public(){
	System.out.println("Test1 test1Public");
    }
    protected void test1Protected(){
	System.out.println("Test1 test1Protected");
    }    
    void test1Default(){
	System.out.println("Test1 test1Default");
    }    
    private void test1Private(){
	System.out.println("Test1 test1Private");
    }
    
    public int  test1IntValue(){
	return 10;
    }
    
    public Test1  test1ObjValue(){
	return null;
    }
    
}
