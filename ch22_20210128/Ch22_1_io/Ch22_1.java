/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch22_20210128.Ch22_1_io;
import java.io.File;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ch22_1 {

  
    public static void main(String[] args) {
	String txt = "有關於任天堂下一代遊戲主機的傳聞逐漸浮現，"
		+ "不少外媒稱其為「Switch Pro」";
	File file = new File("C:\\MyDir\\news.txt");
//	try(FileWriter writer = new FileWriter(file);){
//	    writer.write(txt);
//	}catch(IOException ex){
//	    System.out.println("ex:"+ex);
//	}

//自選編碼
	try(FileOutputStream fileOut = new FileOutputStream(file);
	    OutputStreamWriter outWrite = new OutputStreamWriter(fileOut);	){
	    outWrite.write(txt);
	}catch(IOException ex){
	    
	}
	
    }
    
}
