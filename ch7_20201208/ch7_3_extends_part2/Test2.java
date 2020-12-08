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
public class Test2  extends Test1{
    //因為當類別內無建構子時 Java"會"預設給一組建構子
    //當類別內有建構子時 Java"不會"給一組預設建構子
    public Test2(String name,int code){
	super(name,code);
	//n*表示參數的數量 可以0~n
	//當沒有呼叫任何super(n*) 或 this(n*) 
	//會自動呼叫super()
    }
}
