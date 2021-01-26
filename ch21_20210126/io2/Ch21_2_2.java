/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch21_20210126.io2;
import java.io.Reader;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
/**
 *
 * @author xvpow
 */
public class Ch21_2_2 {
    public static void main(String[] args) {
	
	File file = new File("C:\\MyDir\\msg.txt");
	
	StringBuilder sb = new StringBuilder();
	//測試自訂義Reader
//	try(MyFileReader myReader = new MyFileReader(file,"BIG5");
//		){	 
	try(
		FileInputStream fileInput = new FileInputStream(file);		
		InputStreamReader  reader = new InputStreamReader(fileInput, "BIG5")){	   	    
	    int value = -1;
	    while((value = reader.read()) != -1){
		sb.append((char)value);
	    }	   
	}catch(IOException ex){
	    System.out.println(ex);
	}
	    System.out.println(sb.toString());
    }
    
}
