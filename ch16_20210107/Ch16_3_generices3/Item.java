/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch16_20210107.Ch16_3_generices3;

/**
 *
 * @author xvpow
 */
public class Item {
    private String name;
    private int price;

    public Item(String name, int price) {
	this.name = name;
	this.price = price;
    }
    
    public String toString(){
	return this.name+":"+this.price;
    }
    
}
