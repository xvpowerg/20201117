/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20201215.ch9_1_override1;

public class Ch9_1 {
    /*
    覆寫規則
    1 讀取權限只能開放不能封閉
    2 回傳值如果是基本型必須一樣
    3 如果是非基本型態 可以是子類型
    4 函數名稱跟參數類型必須跟父類別一樣
    5 例外地拋出可選擇 拋出一樣 或子類型 或 不拋出
    * 以上條件必須在方法能被子類別發現時才成立
    */
    
    public int test1(String v) throws NullPointerException {
	return 10;
    }
    public static void main(String[] args) {
	
	
	
    }
    
}
