/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch21_20210126.io2;
import java.io.Reader;
import java.io.InputStreamReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
public class Ch21_2 {

    public static void main(String[] args) {
	File file = new File("C:\\MyDir\\msg.txt");
	try(FileReader reader = new FileReader(file);){
	    int value =-1;
	    while( (value = reader.read()) != -1){
		System.out.print((char)value);	
	    }
	}catch(FileNotFoundException ex){
	    System.out.println(ex);
	}catch(IOException ex){
	    System.out.println(ex);
	}
	
    }
    
}
