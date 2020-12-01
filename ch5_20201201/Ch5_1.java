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
public class Ch5_1 {

    //長參數(vargs)
    //傳很多個相同類型的數值時 可使用常參數,簡化程式碼
    //只能是參數的最後一筆
    static int sum(int ... a){
	int ans = 0;
	for(int v : a){
	    ans += v;
	}
	return ans;
    }
    public static void main(String ... args) {
	int v1 = sum(2,5);
 	int  v2 = sum(2,5,6);
	int  v3 = sum(2);	
	int[] array2 = {5,7,1,2};
	int  v4 = sum(array2);
	System.out.println(v1+":"+v2+":"+v3+":"+v4);
    }
    
}

