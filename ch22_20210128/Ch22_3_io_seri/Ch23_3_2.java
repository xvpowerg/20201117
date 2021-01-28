/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch22_20210128.Ch22_3_io_seri;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch23_3_2 {
	
    public static void main(String[] args) {
	// TODO code application logic here
	File file = new File("c:\\mydir\\list.obj");
	try(FileInputStream fin = new FileInputStream(file);
	ObjectInputStream objIn = new ObjectInputStream(fin);){
	     ArrayList<String> list = (ArrayList) objIn.readObject();
	    list.forEach(System.out::println);
	}catch(IOException | ClassNotFoundException ex){
	    System.out.println(ex);
	}
    }
    
}
