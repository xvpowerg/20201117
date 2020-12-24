/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20201224.ch12_1_interface1;

/**
 *
 * @author xvpow
 */
public  class WifiRouter  implements Wifi{
    private String data;
    public void input(String data){
	    this.data = data;
    }    
    public String output(){
	return this.data;
    }
}
