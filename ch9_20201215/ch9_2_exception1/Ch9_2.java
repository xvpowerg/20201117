/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20201215.ch9_2_exception1;


public class Ch9_2 {

    /*
    簡單的Exception demo
    */
    public static void main(String[] args) {
	
	Student st1 = new Student();
	try{
	    //try{}想成一個區塊 這個區塊只要有一個錯誤 就中斷 錯誤由catch取得
	    st1.setAge(500);//這裡錯誤了 不因該繼續往下 因該中斷程式
	    st1.setName("Ken");
	    st1.print();	
	}catch(IllegalArgumentException ex){
	    System.out.println(ex);
	}

	
    }
    
}
