/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20201215.ch9_2_exception2;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.sql.SQLException;
// throws 可能發生的錯誤
public class TestException {
    public void testCheckedException(int v)throws IOException{
	if (v > 10){
	    throw new IOException("CheckedException");
	}
    }
       public void testCheckedException2(int v)
	       throws SQLException,FileNotFoundException,IOException{
	switch(v){
	    case 1:
		throw new SQLException("SQLException!!");
	    case 2:
		throw new FileNotFoundException("FileNotFoundException");
	    default:
		throw new IOException("IOException!!");
	}
	
    }
       
    public void testMyException(boolean test)
	    throws MyException,MyExceptionSub{
	    if (test){
		throw new MyException();
	    }else{
		throw new MyExceptionSub();
	    }
    }   
    public void testUncheckedException(int a,int b){
	if (b == 0){
	   throw new ArithmeticException("分母不可為0"); 
	}
	System.out.println(a/b);
    }
    
    
    
 
}
