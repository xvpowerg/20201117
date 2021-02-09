/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch24_20200209.time;
import java.util.Date;
/**
 *
 * @author xvpow
 */
public class Ch24_2 {


    public static void main(String[] args) {
	Date date = new Date();
	System.out.println(date);
	//取得時間的毫秒 作為亂數
	System.out.println(System.currentTimeMillis());
	long start = System.currentTimeMillis();
	//計算迴圈跑了多少毫秒
	for(int i=1;i<=1000;i++){
	    System.out.println(i);
	}
	long end = System.currentTimeMillis();
	System.out.println("毫秒:"+(end-start));
	
    }
	
    }
    

