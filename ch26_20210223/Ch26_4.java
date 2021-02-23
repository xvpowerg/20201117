/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch26_20210223;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.io.InputStream;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
public class Ch26_4 {
     public static void main(String[] args) {
	 Properties p = new Properties();
	 Path path =  Paths.get("c:","javacode","db.properties");
	 int id =(int) (Math.random() * 10000);		 
	 String name="Ken";
	 float score = 86.7f;
	 String sql = "INSERT INTO student VALUES(?,?,?)";
	 try(InputStream in =  Files.newInputStream(path);){
	     p.load(in);
	     String url = p.getProperty("url");
	     try(Connection conn = DriverManager.getConnection(url,p);
		     PreparedStatement ps = conn.prepareStatement(sql);){		
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setFloat(3, score);
		int count = ps.executeUpdate();
		System.out.println(count);
		 //stm.execute("INSERT INTO student VALUES(1002,'Iris',88)");			 
//		 String.format("INSERT INTO student VALUES(%d,'%s',%.2f)", 
//			 id,name,score);
	     }catch(SQLException ex){
		 System.out.println(ex);
	     }
	     
	 }catch(IOException ex){
	     System.out.println(ex);
	 }
	 
	 
	 
     }
}
