/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20201224.ch12_2_interface2;

/**
 *
 * 類別只單一繼承
 * 但可以實作多個介面
 */
public class Ch12_2 {

    public static void main(String[] args) {
	IronMan iMan = new IronMan();
	
	Fly fly = iMan;
	Run run = iMan;
	fly.flying();
	run.runing();
	
	
	
	
    }
    
}
