/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch3_20201122;

/**
 *
 * @author xvpow
 */
public class Ch3_8 {
//長參數
    //如果參數很多可使用長參數vargs
    //函數的參數數量可為任意數
    //只能是最後一筆參數
    static int sum(int ... a){
	int sum = 0;	
	for (int v : a){
	    sum += v;
	}
	return sum;
    }
    
    public static void main(String[] args) {
	// TODO code application logic here
	int v = sum(2,5,3,1,4);
	System.out.println(v);
    }
    
}
