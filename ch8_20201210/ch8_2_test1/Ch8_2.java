/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20201210.ch8_2_test1;

/**
 *
 * @author xvpow
 */
public class Ch8_2  {

    /**
     * @param args the command line arguments
     */
    //考題 建構子 呼叫順序
    //第一步看有沒有錯
	//是否需要import  
	//import 位置對不對
        //建構子有沒有錯
	//建構子內無呼叫super 要查看父類別是否有預設建構子 如無預設建構子就是錯誤
    //第二步畫UML  下而上運行  由上而下輸出
    
    public static void main(String[] args) {
	
	Test3 t3 = new Test3();
    }
    
}
