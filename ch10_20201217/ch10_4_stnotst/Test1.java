/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10_20201217.ch10_4_stnotst;

/**
 *
 * @author xvpow
 */
public class Test1 {
    private int version;
    public Test1(){
	System.out.println("Test1()");
    }
    //因為靜態方法呼叫時 物件不一定產生 
    //所以靜態只能呼叫靜態的
    public static void run(){
	
    }
    
    {
    System.out.println("Not Static 1");
    }
    
    static  {
    System.out.println("Static 1");
    }
    
   {
    System.out.println("Not Static 2");
    }
   
   static  {
    System.out.println("Static 2");
    }
    
}
