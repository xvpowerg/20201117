/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch15_20210105.Ch15_2_lambda2;

import ch15_20210105.Ch15_1_lambda1.*;

/*
 Lambda 

*/
public class Ch15_2 {
    static interface TestIF1{
	  void test1();
    }
    static interface TestIF2{
	  void test2(String msg);
    }
    
    static interface TestIF3{
	void test3(String s1,int v2);
    }
   
    public static void main(String[] args) {
	//1 無參數 無回傳
	TestIF1 tesIF1 = ()->System.out.println("TestIF1");
	tesIF1.test1();
	//1 無參數 無回傳 {}內只有一條指令 可審略 {}與指令的分號
	TestIF1 tesIF1_2 = ()->System.out.println("TestIF1_2");
	tesIF1_2.test1();
	// 2 1個參數 無回傳
	//表準版
	TestIF2 test2_1 = (String v1)->{
		    System.out.println(v1);
	  };
	test2_1.test2("Gogo!!");
	//可簡寫版本
	TestIF2 test2_2 =  v1->System.out.println("TestIF2_"+v1);
	test2_2.test2("Msg2");
	//3 1個以上的參數 無回傳
	//標準的寫法
	TestIF3 test3_1 = (String v1,int v2)->{ System.out.println(v1+":"+v2); };
	test3_1.test3("Test3_1",100);
	//縮寫不可去除()
	TestIF3 test3_2 = (v1,v2)-> System.out.println(v1+":"+v2);
	test3_2.test3("Test3_2",86);
    }
    
}
