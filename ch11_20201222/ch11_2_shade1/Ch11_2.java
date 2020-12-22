/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11_20201222.ch11_2_shade1;

/**
 *
 * @author xvpow
 */
public class Ch11_2 {

  /*
    遮蔽    
    屬性 或 靜態的屬性靜態的方法是遮蔽
    遮蔽 看類別
    覆寫 看物件
    */
    public static void main(String[] args) {
	Test1 t1 = new Test2();
	System.out.println(t1.value1);	
    }
    
}
