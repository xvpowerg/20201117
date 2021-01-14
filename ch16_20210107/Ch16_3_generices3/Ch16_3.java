/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch16_20210107.Ch16_3_generices3;
import java.util.function.Supplier;
/**
 *
 * 方法泛型
 */
public class Ch16_3 {
    
    static class ItemToString implements TestIF<Item,String>{
	  public String objToValue(Item it){
	      return it.toString();
	  }
    }
    
    //會自動判斷回傳類型
    static <T> T getObj(T obj){	
	return obj;
    }
    
    static <T extends Exception> T getException(Supplier<T> sup ){
	return sup.get();
    }
    
    public static void main(String[] args) {
	TestIF<Item,String> tif = new  ItemToString();
	String objStr = tif.objToValue(new Item("Ps6",25000));
	System.out.println(objStr);
	   
	Integer v1 =  getObj(10);
	Item v2 =  getObj(new Item("iPad",35000));
	//可以使用泛型限定
	String v3 =   Ch16_3.<String>getObj("");
	
 	 Exception ex = 
		 getException(()->new IllegalArgumentException("錯誤的參數"));
	 System.out.println(ex);
	
	
    }
    
}
