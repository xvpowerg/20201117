/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch3_20201124;

/**
 *
 * @author xvpow
 */
public class Ch3_6 {
    public static void main(String[] args) {
	//左邊[]等於右邊[]數
	//r:2 no
	//c:3 yes
	int[][]array2x3 = new int[2][3];
	array2x3[0][0] = 50;
	array2x3[0][2] = 12;
	array2x3[1][1] = 30;
	
	
	for (int r = 0;r< array2x3.length;r++){
	    for (int c=0;c < array2x3[r].length;c++){
		System.out.print(array2x3[r][c]+" ");
	    }
	    System.out.println();
	}
	
	//使用foreach 取得二維陣列
	
	for (int[] arrray :array2x3 ){
	    for (int v : arrray){
		System.out.print(v+" ");
	    }
	     System.out.println();
	}
	
    }
    
}

