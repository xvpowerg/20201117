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
public class Test2 extends Test1 {
    //只能是public
    @Override
    public void test1Public(){
	System.out.println("Test2 test1Public");
    }
    //可以是 protected 或 public
    @Override
    protected void test1Protected(){
	System.out.println("Test2 test1Protected");
    }    
    //可以是default 或 protected 或 public 
    @Override
    void test1Default(){
	System.out.println("Test2 test1Default");
    }    
    //他不是覆寫
    //  @Override 檢查覆寫是否正確
    //@Override
     void test1Private(){
	System.out.println("Test2 test1Private");
    }
     //回傳值如果是基本型必須一樣
     @Override
    public int  test1IntValue(){
	return 10;
    }
    @Override  //回傳值可以是Test2 或 Test1
    public Test2  test1ObjValue(){
	return null;
    }
    
}
