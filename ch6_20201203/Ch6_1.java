/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6_20201203;

/**
 *
 * @author xvpow
 */
public class Ch6_1 {
    /** 
    * 作者:Howard 
    * 日期:2020-12-03
    * count: 數量
    * separate:分隔號
    */
  static void myforLoop(int count,String separate ){
      for (int i =1;i<= count;i++){
	  if (i== count){
	      separate="";
	  }
	  System.out.print(i+separate);
      }
        System.out.println();
  }
  //類似給預設值
  static void myforLoop(int count){
      myforLoop(count," ");
  }

    public static void main(String[] args) {
	
	myforLoop(10," ");
	myforLoop(5,",");
	myforLoop(3,"*");
	
    }
    
}
