/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20201208.ch7_3_extends_part2;

/**
 *
 * @author xvpow
 */
public class Test1  {
    private String msg;
    private int statesCode;
    public Test1(String msg,int statesCode){
	this.msg = msg;
	this.statesCode = statesCode;
    }    
    public Test1(String msg){	
	//呼叫目前物件的其他建構子
	//this()只能是建構式的第一筆命令	
	this(msg,100); 
    }
    
    public void printInfo(){
	System.out.println("Test1 msg:"+msg+" statesCode:"+statesCode);
    }
    
}
