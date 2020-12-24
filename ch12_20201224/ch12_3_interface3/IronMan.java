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
public class IronMan implements IronManIF{
      public void spake(){
	  System.out.println("你好!!");
      }   
      public void attacking(){
	  System.out.println("雷射攻擊");
      }     
      public void runing(){
	  System.out.println("IronMan  run");
      }      
      public void flying(){
	    System.out.println("IronMan  fly");
      }
}
