/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch21_20210126.io2;
import java.io.Reader;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Ch21_2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {	
	File file = new File("C:\\MyDir\\msg.txt");
	StringBuilder sb = new StringBuilder();
	try(FileReader reader = new FileReader(file);
		BufferedReader bufer = new BufferedReader(reader);	){
	    String  data = null;
	    //readLine 段行為分界點
	    while( (data = bufer.readLine()) != null){
		//System.out.println(data);
		sb.append(data+"\n");		
	    }
	    System.out.println(sb.toString());
	    
	}catch(IOException ex){
	    System.out.println(ex);
	}
    }
    
}
