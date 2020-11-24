/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch3_20201124;
import java.util.Arrays;
public class Ch3_5 {


    public static void main(String[] args) {
	//快速排序法
	//小到大
	int[] array = {8,6,19,13,15};
	Arrays.sort(array);
	for (int v : array){
	    System.out.print(v+" ");
	}
	 System.out.println();
	//binarySearch一定要 由小到大排序
	int index = Arrays.binarySearch(array, 13);
	System.out.println("index:"+index);
	//找不到 都是負數
	//比所有都小 -1
	index = Arrays.binarySearch(array, 2);
	System.out.println("找不到小 index:"+index);
	//比所有都大(陣列長度 + 1) * -1
	 index =  Arrays.binarySearch(array, 80);
	System.out.println("找不到比所有都大 index:"+index);
	//介於中間
	index =  Arrays.binarySearch(array, 10);//17 -5
					     // 10 -3  
	System.out.println("介於中間 index:"+index);

    }
    
}
