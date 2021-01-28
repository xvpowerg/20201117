/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch22_20210128.Ch22_3_io_seri;
import java.util.ArrayList;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author xvpow
 */
public class Ch22_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	// TODO code application logic here
	//序列化就是把物件變檔案
	File file = new File("c:\\mydir\\list.obj");
	ArrayList<String> list = new ArrayList();
	list.add("Howard");
	list.add("Vivin");
	list.add("Lindy");
	list.add("Joy");
	list.add("Iris");
	
	try(FileOutputStream out = new FileOutputStream(file);
	   ObjectOutputStream objOut = new ObjectOutputStream(out)	){
	    objOut.writeObject(list);//開始序列化
	}catch(IOException ex){
	    System.out.println(ex);
	}
    }
    
}
