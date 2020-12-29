/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch13_20201229.ch13_5_innerclass2;

/**
 *
 * @author xvpow
 */
public class TestClass {
       //幫所有的字串Title:
     public static String[] appendTitle(String[] name,String title){
	 TitleFunction tfunc = new TitleFunction(title);
	 return append(name,tfunc);
     }
    public static String[] append(String[] values,
	    MyFunction func){
          return func.apply(values);	   
    }
 
    private static class TitleFunction implements MyFunction{
	private String title;
	TitleFunction(String title){
	    this.title = title;
	}
	public String[] apply(String[] data){
	    String[] result = 
			new String[data.length];	    
	    for (int i = 0; i < result.length;i++){		
		result[i] = title+":"+data[i];			
	    }
	    return result;
	}	
    } 
    
}
