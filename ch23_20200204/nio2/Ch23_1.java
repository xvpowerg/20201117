/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch23_20200204.nio2;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
public class Ch23_1 {
    public static void main(String[] args) {
	//Path 處理路徑
	//Paths 取得路徑
	//Files 檔案控制
	Path path1 = Paths.get("c:", "dir1","dir2","myfile.txt");
	System.out.println(path1);
	//root 不算nameCount數內
	int nameCount = path1.getNameCount();
	System.out.println(nameCount);
	Path namePath = path1.getName(1);
	System.out.println(namePath);
	Path path2 = Paths.get("c:", "dira","dirb","cfile.txt");
	Path root1 = path2.getRoot();
	//如果無root回傳null
	System.out.println(root1);
	
	
	
	
	
    }
    
}
