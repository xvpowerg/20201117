/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20201224.ch12_3_interface3;

/**
 *
 * @author xvpow
 */
public class Ch12_3 {
    /*
       介面與介面的繼承關係 概念像是群組
    */
    
    public static void main(String[] args) {
	IronManIF ironMan = new IronMan();
	ironMan.flying();
	ironMan.runing();
	ironMan.attacking();
	
    }
    
}
