/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11_20201222.ch11_7_abstract2;

/**
 *
 * 如果有抽象方法類別一定是抽象
 * 抽象的類別 不能final
 * 對類別而言 final表示不能被繼承
 * 抽象的方法 不能final
 * 對方法而言 final表示不能覆寫
 */

public abstract class MyDatabase {
    //sqltype://ip/name
    private String ip;
    private String name;
    public MyDatabase(String ip,String name){
	this.ip = ip;
	this.name = name;
    }

     abstract String getSqlType();
    
    public void connection(){
	String sqlType = getSqlType();
	String uri = sqlType+"://"+ip+"/"+name;
	System.out.println(uri);
    }
    
}
