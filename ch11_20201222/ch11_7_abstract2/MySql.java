/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11_20201222.ch11_7_abstract2;

/**
 *
 * 希望提醒開發人員覆寫某個方法
 */
public  class MySql  extends MyDatabase{
    MySql(String ip,String name){
	super(ip,name);
    }
    @Override
     String getSqlType(){
	return "mysql";
    }
}
