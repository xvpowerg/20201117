/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch22_20210128.Ch22_3_io_seri;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
public class Ch23_3_6 {

    static class User {
	private String name;

	public String getName() {
	    return name;
	}

	public void setName(String name) {
	    this.name = name;
	}

	@Override
	public String toString() {
	    return "User{" + "name=" + name + '}';
	}
	
	
    }
    static class Item implements Serializable{
	//transient 不參予序列化
	private  User user;
	private int n;

	public Item(User user, int n) {
	    this.user = user;
	    this.n = n;
	}

	@Override
	public String toString() {
	    return "Item{" + "user=" + user + ", n=" + n + '}';
	}
	
	
    }
    

    public static void main(String[] args)throws Exception {
	User u1 = new User();
	u1.name = "Ken";
	//屬性無implements Serializable 序列化時可能會產生例外
	Item i1 = new Item(u1,25);
	System.out.println(i1);
	File file = new File("C:\\mydir\\item.obj");
	try(FileOutputStream fout  = new FileOutputStream(file);
           ObjectOutputStream objOut = new ObjectOutputStream(fout);){
	    objOut.writeObject(i1);
	}
	
	try(FileInputStream fin = new FileInputStream(file);
	    ObjectInputStream objIn = new ObjectInputStream(fin);){
	    Item nweItem = (Item)objIn.readObject();
	    System.out.println(nweItem);
	}
    }
    
}
