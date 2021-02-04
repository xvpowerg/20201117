/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch23_20200204.nio2;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class Ch23_1_3 {

    public static void main(String[] args) {
	Path dirPath = Paths.get("c:", "MyDir","Dir1");
	boolean isDir =  Files.isDirectory(dirPath);
	System.out.println(isDir);
	Path filePath = Paths.get("c:", "MyDir","msg_copy.txt");
//	try{
//	   // Files.delete(filePath);
//	   //檔案在才刪除
//	   Files.deleteIfExists(filePath);
//	}catch(IOException ex){
//	    System.out.println(ex);
//	}
	//路徑相同不會真的找檔案 就算檔案不存在也部會出錯
	//路徑相不同會真的找檔案 就算檔案不在會出錯
	Path filePath1 = Paths.get("c:", "MyDir","msg_copy.txt");
	Path filePath2 = Paths.get("c:", "MyDir","msg_copy.txt");	
	try{
	   boolean isSame = Files.isSameFile(filePath1, filePath2); 
	   System.out.println(isSame);
	}catch(IOException ex){
	    System.out.println(ex);
	}
	
		
    }
    
}
