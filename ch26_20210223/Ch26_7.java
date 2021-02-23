/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch26_20210223;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author xvpow
 */
public class Ch26_7 {

    /**
     * @param args the command line arguments
     */
    //多筆資都要完成才算真的完成
    public static void main(String[] args) {
		String url = "jdbc:derby://localhost:1527/mydb20210223";
	String user = "qwer";
	String  password="123456";
	try(Connection con = DriverManager.getConnection(url, user, password);
		Statement stm = con.createStatement();){
	    con.setAutoCommit(false);	    
	    //交易
	    stm.executeUpdate("INSERT INTO student VALUES(3001,'Lucy',86)");
	     stm.executeUpdate("INSERT INTO student VALUES('aaa','Ben',70)");
	    con.commit();
	}catch(SQLException ex){
	    System.out.println(ex);
	}
    }
    
}
