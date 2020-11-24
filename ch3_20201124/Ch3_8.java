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
public class Ch3_8 {

    public static void main(String[] args) {
	int[][] values = new int[3][];
	values[0] = new int[5];
	values[1] = new int[3];
	
	values[0][3] = 10;
	//values[1][3] = 11;//java.lang.ArrayIndexOutOfBoundsException
	values[2][1] = 71;//java.lang.NullPointerException
	
	
	
    }
    
}
