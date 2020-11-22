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
public class Ch3_6 {

    
    static void test1(){
	System.out.println("Test1");
    }
    static void test2(int v1,String v2){
	int a = Integer.parseInt(v2);
	System.out.println(v1 + a);
    }
    
    static int size(int[] array){
	int len = array.length;
	//可以回傳數值
	//離開函數
	return len;
    }
    
    static int  findIndex(int n,int[] array){
	
	for (int i =0;i<array.length;i++){
	    if (array[i] == n){
		return i;
	    }	   
	}
	System.out.println("findIndex~~~");
	return -1;
    }
    
    //static 的只能直接呼叫 static 類型的
   
    public static void main(String[] args) {
	// TODO code application logic here
	 test1();
	 test2(6,"2");
	 int[] scores = {56,78,97};
	int len = size(scores);	 
	System.out.println(len);
	int index = findIndex(78,scores);
	System.out.println(index);
	
    }
    
}
