/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11_20201222.ch11_7_abstract2;

/**
 *
 * @author xvpow
 */
/*
希望提醒開發人員覆寫某個方法
*/
public class Ch11_7{
    public static void main(String[] args) {
	MyDatabase mysql = new MySql("192.168.5.3","user");
	mysql.connection();

    }
    
}
