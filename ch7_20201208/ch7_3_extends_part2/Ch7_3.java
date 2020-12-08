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
public class Ch7_3 {

   //this() 呼叫目前物件的其他建構子
    //this() 只能是建構式的第一筆命令	
   //super() 預設建構子的問題
    public static void main(String[] args) {
	Test1 t1 = new Test1("測試1");
	t1.printInfo();
	Test1 t2 = new Test1("測試2",400);
	t2.printInfo();
	
	Test2 t3= new Test2("HTML Error:",500);
	t3.printInfo();
    }
    
}
