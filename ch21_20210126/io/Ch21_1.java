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
import java.io.IOException;
import java.io.FileNotFoundException;
/**
 *
 * @author xvpow
 */
public class Ch21_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	File src = new File("c:\\mydir\\msg.txt");
	File target = new File("c:\\mydir\\msg_copy.txt");
	//copy
	try{
	    InputStream fileIn = new FileInputStream(src);
	    OutputStream fileOut = new FileOutputStream(target);
	    //-1表示檔案完成
	    int data = -1;
	    while( (data = fileIn.read())!= -1){		
		//System.out.println(data);
		fileOut.write(data);
	    }
	}catch(FileNotFoundException ex){
	    System.out.println(ex);
	}catch(IOException ex){
	    System.out.println(ex);
	}
	
	
	
	
	
    }
    
}
