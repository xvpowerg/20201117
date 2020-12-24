/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20201224.ch12_2_interface2;

/**
 *
 * 
 */
public class IronMan  implements Fly,Run{
    public void flying(){
	System.out.println("IronMan flying");
    }
    public void runing(){
	System.out.println("IronMan runing");
    }
}
