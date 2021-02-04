/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch23_20200204.nio2;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.File;

/**
 *
 * @author xvpow
 */
public class Ch23_1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	// TODO code application logic here
	Path path2 = Paths.get("c:", "dira","dirb","cfile.txt");
	Path path3 = path2.subpath(1, 3);
	System.out.println(path3);
	String st = "ABCDEF";
	System.out.println(st.substring(1, 4));
	
	Path path4 = Paths.get("c:", "dira","dirb","cfile.txt");
	System.out.println(path4.isAbsolute());
	File file = new File("c:\\dir1\\dir1_1\\mytext.txt");
	Path path5 = file.toPath();
	System.out.println(path5);
	Path path6 =  Paths.get("c:", "dir1");
	Path path7 =  Paths.get("dir2", "mp3","test.mp3");
	Path path8 = path6.resolve(path7);
	System.out.println(path8);
	
	Path path9 =  Paths.get("c:", "dir1");
	Path path10 =  Paths.get("d:","dir2", "mp3","test.mp3");
	Path path11 = path9.resolve(path10);
	//如果右邊的是絕對路徑會取代
	System.out.println(path11);
	
	Path path12 = Paths.get("c:", "dir1");
	Path path13 = Paths.get(".","..","images","myImage.jpg");
	
	Path path14 =path12.resolve(path13);
	System.out.println(path14);
	Path path15 =path14.normalize();
	System.out.println(path15);
	
	
	
	
    }
    
}
