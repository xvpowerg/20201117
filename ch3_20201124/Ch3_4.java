/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch3_20201124;
import java.util.Arrays;
public class Ch3_4 {
    
    public static void main(String[] args) {
	String[] names = new String[100];
	System.out.println(names[2]);
	Arrays.fill(names, "無名");
	System.out.println(names[95]);
	int n = 3;
	int[] array1 = {17,25,36,48,55};
	//copy的範圍會小於n
	int[] newArray =Arrays.copyOf(array1, n);
	for (int v: newArray){
	    System.out.print(v+" ");
	}
	  System.out.println();
	  int s1 = 1;
	  int t2 = 4;
	  //    t2 > Range >= s1  	  
	int[] newArray2 = Arrays.copyOfRange(array1, s1, t2);

	for (int v: newArray2){
	    System.out.print(v+" ");
	}
	System.out.println();
	  
    }
    
}
