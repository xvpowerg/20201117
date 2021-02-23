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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 *
 * @author xvpow
 */
public class Ch26_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	    Properties p = new Properties();
	    Path path =  Paths.get("c:","javacode","db.properties");
	    try(InputStream in =  Files.newInputStream(path);){
		p.load(in);
		String url = p.getProperty("url");
		try(Connection conn = DriverManager.getConnection(url,p);
			 Statement statem =  conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
				 ResultSet.CONCUR_UPDATABLE);){			
			ResultSet resultSet = 
				statem.executeQuery("SELECT id,name,score FROM student");
		boolean canMove = resultSet.absolute(5);
		System.out.println(canMove);
		String name = resultSet.getString("name");
		//更新完畢必須呼叫updateRow()
		resultSet.updateString("name", "Tom");
		resultSet.updateRow();
		System.out.println(name);
		}catch(SQLException ex){
		    System.out.println(ex);
		}
       }catch(IOException ex){

       }
    }
    
}
