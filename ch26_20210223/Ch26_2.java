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
import java.sql.Statement;
import java.sql.SQLException;
import java.util.Properties;
public class Ch26_2 {
     public static void main(String[] args) {
	 Properties p = new Properties();
	 Path path =  Paths.get("c:","javacode","db.properties");
	 try(InputStream in =  Files.newInputStream(path);){
	     p.load(in);
	     String url = p.getProperty("url");
	     try(Connection conn = DriverManager.getConnection(url,p)){
		 Statement stm =  conn.createStatement();
		 stm.execute("INSERT INTO student VALUES(1002,'Iris',88)");			 
	     }catch(SQLException ex){
		 System.out.println(ex);
	     }
	     
	 }catch(IOException ex){
	     System.out.println(ex);
	 }
	 
	 
	 
     }
}
