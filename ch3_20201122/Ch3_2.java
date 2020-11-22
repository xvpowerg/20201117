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
public class Ch3_2 {
    public static void main(String[] args) {
	Integer v1 = null;
	int v2 = v1;//NullPointerException
	System.out.println(v2);
    }    
}
