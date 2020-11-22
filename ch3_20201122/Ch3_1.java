/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch3_20201122;

import java.util.ArrayList;

/**
 *
 * @author xvpow
 */
public class Ch3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	Integer v1 = 20;
	Integer v2 = 20;
	int intV1 = v1;
	int intV2 = v2;
	System.out.println(intV1);
	System.out.println(intV2);
	
	System.out.println(intV1 == intV2);
	System.out.println(v1 == v2);
	
	//-128~127所有的數字的Integer先建立好
	//如果有人要使用-128~127之間的數字，就會直接抓取已建立好的Integer
	Integer v3 = 170;
	Integer v4 = 170;
	int intV3 = v3;
	int intV4 = v4;
	System.out.println(v3);
	System.out.println(v4);
	System.out.println(intV3 == intV4);
	System.out.println(v3 == v4);	
	
	
    }
    
}
