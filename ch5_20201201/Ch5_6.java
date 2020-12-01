/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5_20201201;

/**
 *
 * @author xvpow
 */
public class Ch5_6 {
//多載
    //相同方法名稱 但是 參數的數量或類型不同,java會自動選則呼叫的方法
  static void test1(int v1){
      System.out.println("int");      
  }
  static void test1(float v2){
        System.out.println("float");      
  }
    public static void main(String[] args) {
	// TODO code application logic here
	
	test1(12.5f);
	test1(7);
    }
    
}
