/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4_20201126;

/**
 *
 * @author xvpow
 */
public class Ch4_4 {
    
    //遞迴顯示1~5
    static void test1(int n){
	System.out.println("Start:"+n);
	if (n < 3){
	  test1(n+1);  
	}
	System.out.println("End:"+n);	
    }
    
    public static void main(String[] args) {
	// TODO code application logic here
	test1(1);
	
// 25  17  36  20  15  39  35
//目前節點是否有數字 無數字寫入 有數字判斷以下條件
//比目前節點大還是小
//如果小往左 如果大往右

//小到大排序
//是否有左節點
//輸出目前節點
//是否有右節點
//15 17 20 25 35 36 39
	
    }
    
}
