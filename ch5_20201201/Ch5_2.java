/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5_20201201;
import java.util.Scanner;
/**
 *
 * @author xvpow
 */
public class Ch5_2 {
    //封箱(基本型態變物件)
    //為什麼要封箱:規定
    public static void main(String[] args) {
	// 基本型態   封箱類別
	// byte       Byte
	// short      Short
	// int        Integer
	// long       Long
	// float      Float
	// double     Double
	// char       Character 
	// boolean    Boolean
	
	//手動封箱
	int age = 25;
	//宣告一個變數名稱為intObj 類型是 Integer
	Integer intObj ;		
	//Integer.valueOf 手動封箱 為 Integer
	intObj = Integer.valueOf(age);
	//手動開箱
         int ageInt = intObj.intValue();
	System.out.println(ageInt + 2);
	
	float height = 2.5f;
	Float fObj = Float.valueOf(height);	
	byte b2 = 10;
	Byte bObj = Byte.valueOf(b2);
       
	//自動封箱
	Integer intObj2 = 12;
	//自動解封箱
	int valueInt = intObj2;
	System.out.println(valueInt);
	System.out.println(intObj2 + 5);
    }
    
}
