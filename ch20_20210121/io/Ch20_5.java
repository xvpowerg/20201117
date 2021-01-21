/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch20_20210121.io;
import java.io.File;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch20_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	// TODO code application logic here
	File file = new File("C:\\MyDir\\msg.txt");
	System.out.println(file.exists());//檔案是否存在
	System.out.println(file.isFile());//是檔案嗎?
	System.out.println(file.isDirectory());//是路徑嗎?
	
	if(file.exists()){
	   file.delete();//刪除檔案
	}
	try{
	    file.createNewFile();//建立檔案
	}catch(IOException ex){
	    System.out.println(ex);
	}
	
	
    }
    
}
