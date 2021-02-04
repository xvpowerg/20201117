/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch23_20200204.nio2;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

/**
 *
 * @author xvpow
 */
public class Ch23_1_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	//預設情況下檔案名稱不可重複
	Path src = Paths.get("c:", "MyDir","test.zip");
	Path target = Paths.get("c:", "MyDir","Dir1","test_move.zip");
	try{
	    //StandardCopyOption.COPY_ATTRIBUTES 不可使用
	    Files.move(src, target,StandardCopyOption.REPLACE_EXISTING,
		    StandardCopyOption.ATOMIC_MOVE);
	}catch(IOException ex){
	    System.out.println(ex);
	}
    
    }
    
}
