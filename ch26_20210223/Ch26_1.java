/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch26_20210223;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
public class Ch26_1 {

    public static void main(String[] args) {
	String url = "jdbc:derby://localhost:1527/mydb20210223";
	String user = "qwer";
	String  password="123456";
	try(Connection con = DriverManager.getConnection(url, user, password);){
	    Statement stm = con.createStatement();
	    int count =
		    stm.executeUpdate("INSERT INTO student VALUES(1001,'Lucy',86)");
	    if (count > 0){
		System.out.println("Success!");
	    }else{
		System.out.println("Fail!");
	    }	    
	}catch(SQLException ex){
	    System.out.println(ex);
	}

	
    }
    
}
