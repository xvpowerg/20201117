/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11_20201222.ch11_6_abstract;

/**
 *
 * @author xvpow
 */
public  class Ch11_6 {
    /*
      抽象類 abstract
      1 無法創造出來的類型 抽象類
      2 希望提醒開發人員覆寫某個方法
    */
    public static void main(String[] args) {	
	Animal animal = new Dog("Nana",6);
	System.out.println(animal);
//Dog:Nana:6	
    }
    
}
