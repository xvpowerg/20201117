/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch2_20201119;
/**
 *
 * @author xvpow
 */
public class Ch2_10 {

    public static void main(String[] args) {
	//一維陣列
	//int[] 表示類型 為一個int的陣列
	//array 變數名稱 存的是參考(身份證)
	//new int[3] 建立長度為3的陣列,
		    //才會分配記憶體位置（身份證）
	int[] array = new int[3];
	array[0] = 51;
	array[2] = 32;
	//指定編號
	System.out.println(array[2]);
	// java.lang.ArrayIndexOutOfBoundsException
	// System.out.println(array[3]);
	int index = 0;
	System.out.println(array[index]);
	//array.length  可以取得陣列長度
	for (int i = 0; i< array.length; i++){
	    System.out.print(array[i]+" ");
	}
	 System.out.println();
	
    }
    
}
