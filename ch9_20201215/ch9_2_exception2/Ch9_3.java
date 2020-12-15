/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20201215.ch9_2_exception2;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.sql.SQLException;
public class Ch9_3 {
   /*
    例外:
    例外有兩種
      必要例外檢測(checked exceptions): 
         直接繼承Exception 除了RuntimeException外  
      　　一定catch 或　拋出
      非必要例外檢測(unchecked exceptions):
	繼承了RuntimeException的例外
    */
    public static void main(String[] args) {
	TestException tex = new TestException();
	try{	
	  tex.testCheckedException(70);
	}catch(IOException ex){
	    System.out.println(ex);
	}
	  
	try{
	 tex.testUncheckedException(10, 0);   
	}catch(ArithmeticException ex){
	    System.out.println(ex);
	}
	//越下越父
	try{
	    tex.testCheckedException2(3);
	}catch(SQLException ex){
	    System.out.println(ex);
	}catch(FileNotFoundException ex){
	     System.out.println(ex);
	}catch(IOException ex){
	     System.out.println(ex);
	}catch(Exception ex){
	    System.out.println(ex);
	}

	try{
	    tex.testMyException(true);
	}catch(MyExceptionSub ex){
	    System.out.println(ex);//這是MyExceptionSub
	}catch(MyException ex){
	     System.out.println(ex);//這是MyException
	}
	
	
    }
    
}
