/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch21_20210126.io;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
public class Ch21_1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	File src = new File("c:\\mydir\\test.zip");
	File target = new File("c:\\mydir\\test_copy.zip");
	 InputStream input  =  null;
	  OutputStream out  = null;
	try{
	    int data = -1;
	    input  = 
		   new BufferedInputStream(new FileInputStream(src));
		out  = 
		   new BufferedOutputStream(new FileOutputStream(target));	    	    
	    System.out.println("開始....COPY");
	    while((data = input.read()) != -1){
		out.write(data);
	    }
	    System.out.println("完成....COPY");
	  
	}catch(FileNotFoundException ex){
	    System.out.println(ex);
	}catch(IOException ex){
	    System.out.println(ex);
	}finally{
	    //一定會執行一次
	    try{
		   out.close();
		    input.close();
	    }catch(IOException ex){
		
	    }
	  
	}
    }
    
}
