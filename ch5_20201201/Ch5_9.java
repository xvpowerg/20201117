/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5_20201201;

/**
 *
 * @author xvpow
 */
public class Ch5_9 {
  //寫一個函數傳入一個陣列找出最小值
    static int min(int[] array){
	int ans = array[0];
	for (int i =1;i < array.length;i++){
	    if (ans > array[i]){
		ans = array[i];
	    }
	}
	return ans;
    }
    
    static String myString(int ... vs){
	
	String result = "";
	String flag = ",";
	int i = 0;
	
	for (int v : vs){
	     i++;
	     if (i == vs.length) flag = ".";
	       result += v+flag;
	}
	return result;
    }
  //寫一個函數可以傳入n筆資料 將這些資料串接為字串回傳
    
    public static void main(String[] args) {
	
    int[] array = {8,9,2,3,6};
     int ans =  min(array);
     System.out.println(ans);
  
    String str = myString(5,6,7,8,9);
	System.out.println(str);
	// TODO code application logic here
    }
    
}
