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
public class Ch10_4 {

    //靜態非靜態的差異性
    //使用靜態區塊與非靜態區塊 表現這差異性
    public static void main(String[] args) {
	//這時有物件嗎? 沒物件
	//Test1.run();
	//進態區塊只會呼叫一次
	//非靜態區塊呼叫次數每new一次呼叫一次
	Test1 t1 = new Test1();
	Test1 t2 = new Test1();
    }
    
}
