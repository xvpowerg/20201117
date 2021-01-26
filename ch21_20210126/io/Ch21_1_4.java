/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch21_20210126.io;
import java.io.File;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
public class Ch21_1_4 {

    public static void main(String[] args) {
	File src = new File("C:\\MyDir\\test.zip");    
	File target = new File("C:\\MyDir\\test_copy.zip");    
	try(InputStream input  = new FileInputStream(src);
             OutputStream out = new FileOutputStream(target)){
	    byte[] buffer = new byte[4096];
	    int index = -1;
	    while((index = input.read(buffer))!=-1){
		out.write(buffer, 0, index);
	    }	   
	}catch(FileNotFoundException ex){
	    System.out.println(ex);
	}catch(IOException ex){
	    System.out.println(ex);
	}
	
	
    }
    
}
