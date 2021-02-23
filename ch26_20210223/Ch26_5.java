/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch26_20210223;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author xvpow
 */
public class Ch26_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		 Properties p = new Properties();
	 Path path =  Paths.get("c:","javacode","db.properties");
	 int id =1001;		 
	 String sql = "DELETE FROM student WHERE id=?";
	 try(InputStream in =  Files.newInputStream(path);){
	     p.load(in);
	     String url = p.getProperty("url");
	     try(Connection conn = DriverManager.getConnection(url,p);
		     PreparedStatement ps = conn.prepareStatement(sql);){		
		ps.setInt(1, id);
		int count = ps.executeUpdate();
		System.out.println(count);
	     }catch(SQLException ex){
		 System.out.println(ex);
	     }	     
	 }catch(IOException ex){
	     System.out.println(ex);
	 }
    }
    
}
