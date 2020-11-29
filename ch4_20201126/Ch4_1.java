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
public class Ch4_1 {
    //void 沒有回傳值
    //test1 函數名稱
    //() 表示沒傳入參數
    //{} 函數執行內容
    static void test1(){
	System.out.println("test1!");
	
    } 
    
    static int test2(int v1,int v2){
	int ans = v1 - v2;
	//return 表示離開方法或回傳數值
	return ans;
    }
    
    
    //練習 函數
    //函數名稱min
    //傳入一個整數陣列,陣列內容不可為負數 找出最小值
    //如果陣列為null或是長度為0 回傳-1
    static int min(int[] array){
	if (array == null || array.length == 0 ) return -1;
	int min = array[0];//7
	for(int i =1;i < array.length;i++){
		if (array[i] < min){
		    min = array[i];
		}
	}	
	return min;
    }
    
    // static 只能直接呼叫static的函數或變數
    //非static只能間接呼叫
    public static void main(String[] args) {
	//資料結構
	test1();
	int v = test2(5,2);
	System.out.println(v);
       int[] array = {7,2,3,1};
       int ans = min(array);
       System.out.println(ans);
    }
    
}

