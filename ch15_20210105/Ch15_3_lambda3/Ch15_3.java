/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch15_20210105.Ch15_3_lambda3;

/**
 *
 * @author xvpow
 */
public class Ch15_3 {
      static interface TestIF1{
	  String test1();
      }
    
    public static void main(String[] args) {
	//1 有回傳值 標準寫法
	TestIF1 tif1 = ()->{return "TestIF1";};
	System.out.println(tif1.test1());
	//可簡寫 注意 return要移除
	TestIF1 tif2 = ()-> "TestIF1_2";
	System.out.println(tif2.test1());
	
    }
    
}
