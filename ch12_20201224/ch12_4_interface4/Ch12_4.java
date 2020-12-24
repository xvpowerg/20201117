/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20201224.ch12_4_interface4;

/**
 *
 * @author xvpow
 */
public class Ch12_4 {
    public static void  printStringArray(String[] datas,PrintStringStyleIF psif){
	if (datas == null){
	    throw new IllegalArgumentException("資料不可null");}
	for (String data : datas){
	    psif.print(data);
	}
    }
    public static void main(String[] args) {
	PrintStringStyleCount sc = new PrintStringStyleCount();
	printStringArray(new String[]{"Ken","Vivin","Lindy"},sc);
	
	PrintStringStyleName sn = new PrintStringStyleName();
	printStringArray(new String[]{"Ken","Vivin","Lindy"},sn);

    }
    
}
