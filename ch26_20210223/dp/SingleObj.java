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
public class SingleObj {
    private SingleObj(){}
    private static  SingleObj obj;
    
    public static SingleObj NewSingleObj(){
	if (obj == null){
	    obj = new SingleObj();
	}
	return obj;
    }
    
    public void test(){
	System.out.println("hashCode:"+obj.hashCode());
    }
}
