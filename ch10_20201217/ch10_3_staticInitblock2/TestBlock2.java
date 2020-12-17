/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10_20201217.ch10_3_staticInitblock2;
import java.util.Random;
public class TestBlock2 {
    private static Random ran = new Random();
    //1~500 之間的亂數 放在rand陣列內
    //且不可重複
    private static  int[] rands = new int[100];
    //初始化靜態的屬性 一定要用 static 區塊   
    static{
      initArray();
    }
    private static void initArray(){
	int[] tmpArray = new int[501];
	for (int i = 0; i < rands.length;){
	    int tmpValue = ran.nextInt(500);
	    if (tmpArray[tmpValue] == 0){
		rands[i] = tmpValue;
		tmpArray[tmpValue] = tmpValue;
		i++;
	    }	
	    //nextInt 產生亂數
	    
	}
	//A 判斷當前這數字是否存在於陣列
	//B 如果存在就產生一組新的 回到A在判斷一次
	//C 如果不存在寫入陣列 
	    // 陣列是否已寫滿 
	    // 寫滿就離開
	    // 無寫滿繼續下一筆		    
    }
    
    //rand 不可重複
    public static int getRand(){	
	//initArray();
	int index= ran.nextInt(100);
	return rands[index];
    }
}
