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
public class Ch3_7 {

    public static void main(String[] args) {
	 int[][] array1 = new int[2][3];//* 通常使用
	 int[] array2[] = new int[2][3];
	 int array3[][] = new int[2][3];
	 int[][] array4 = {{5,6,9},
			    {7,8}    };
	 int[][]array5 = new int[][]{
	     {6,5,1,3,2},
	     {8,7,9}
	 };
		 
	 for (int[] arr1 : array4){
	     for (int v : arr1){
		 System.out.print(v+" ");
	     }
	      System.out.println();
	 }
	 
	 
	
	
    }
    
}
