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
public class Ch2_9 {

    public static void main(String[] args) {
	//不知長度
	int i =1;
	while(i<=5){
	    System.out.println(i++);
	}
	
	//一定會執行一次
	int k =10;
	do{
	 System.out.println("do:"+k);
	}while(k >100);
    } 
}
