/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch22_20210128.Ch22_3_io_seri;
import java.io.File;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 *
 * @author xvpow
 */
public class Ch23_3_3 {

   static class Student implements Serializable{
       private String name;
       private int age;

	public Student(String name, int age) {
	    this.name = name;
	    this.age = age;
	}

	@Override
	public String toString() {
	    return "Student{" + "name=" + name + ", age=" + age + '}';
	}
       	
   }
   
   static void test2(File file){
       try(FileInputStream fin = new FileInputStream(file);
	    ObjectInputStream bojIn = new ObjectInputStream(fin);){
	    Student st = (Student) bojIn.readObject();
	    System.out.println("Out: "+st);
       }catch(IOException | ClassNotFoundException ex){
	   System.out.println(ex);
       }
   }
    public static void main(String[] args) {
	Student st1 = new Student("Ken",50);
	System.out.println(st1);
	File file = new File("c:\\mydir\\student.obj");
	try(FileOutputStream out =new FileOutputStream(file);
		ObjectOutputStream objOut = new ObjectOutputStream(out)){
	    objOut.writeObject(st1);
	}catch(IOException ex){
	    System.out.println(ex);
	}
	test2(file);
    }
    
}
