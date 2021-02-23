/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch26_20210223.dp;

/**
 *
 * @author xvpow
 */
public class Ch26_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	SingleObj sobj1= SingleObj.NewSingleObj();
	sobj1.test();
	SingleObj sobj2= SingleObj.NewSingleObj();
	System.out.println(sobj1 == sobj2);
    }
    
}
