/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20201215.ch9_1_override1.sub;
import ch9_20201215.ch9_1_override1.Test1;
//請問有幾個覆寫?2個 public 與 protected
public class Test3  extends Test1{
    
     public void test1Public(){
	System.out.println("Test3 test1Public");
    }
  
    protected void test1Protected(){
	System.out.println("Test3 test1Protected");
    }   
  //不是覆寫
    void test1Default(){
	System.out.println("Test3 test1Default");
    }    
  //不是覆寫
    private void test1Private(){
	System.out.println("Test3 test1Private");
    }
}
