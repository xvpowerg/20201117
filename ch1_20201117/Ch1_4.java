/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch1_2201117;

/**
 *
 * @author xvpow
 */
public class Ch1_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	
	//關係運算子 只能用於基本型態	
	/*int a = 10,b = 5;
	System.out.println(a > b);
	System.out.println(a < b);
	System.out.println(a >= b);
	System.out.println(a <=b);
	System.out.println(a != b);
	System.out.println(a == b);*/
	
	String st1 = "Ken";
	String st2 = "Vivin";
	String st3 = new String("Ken");
	
	System.out.println(st1);
	System.out.println(st2);
	System.out.println(st3);
	System.out.println(st1 == st2);//比記憶體位置
	System.out.println(st1 == st3);
	
	String st4 = "a";

    }
    
}

