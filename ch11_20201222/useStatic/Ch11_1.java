/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11_20201222.useStatic;

/**
 *
 * @author xvpow
 */
public class Ch11_1 {

    /**
     *測試Static與非靜態的使用差異
     */
    /*
    何時使用靜態?
       不會用到非靜態屬性
    何時使用物件
	會用到非靜態屬性    
    */
    public static void main(String[] args) {
	// TODO code application logic here
	Test1 t1 = new Test1();
	Test1 t2 = new Test1();
	t1.notStaticValue = "NSV1";//獨立的記憶體
	t1.staticValue = "SV1";//共享的
	
	t2.notStaticValue = "MSV2";//獨立的記憶體
	t2.staticValue = "SV2";//共享的
	
	System.out.println(t1.notStaticValue);
	System.out.println(t2.notStaticValue);
	
	System.out.println(t1.staticValue);//共享的
	System.out.println(t2.staticValue);//共享的
	
	t1.testNotStatic();
	t1.testStatic();
	//靜態常用呼叫方式
	Test1.testStatic();
	
    }
    
}
