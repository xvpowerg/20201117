/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20201224.ch12_7_interface7;

/**
 *
 * @author xvpow
 */
public class StringArray implements StringArrayIterator{    
    private String[]array;
    public StringArray(int len){
	array = new String[len];
    }
    public String getValue(int index){
	return array[index];
    }
    
    public void setValue(int index,String value){
	array[index] = value;
    }
    
    public String[] getIteratorValue(){
	return array;
    }
    
}
