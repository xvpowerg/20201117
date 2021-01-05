/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch15_20210105.Ch15_6_methodreference3;

/**
 *
 * @author xvpow
 */
public class Ch15_6 {
   static interface GetMyClass{
       MyClass get();
   }
   static interface GetMyClass2{
       MyClass get(int o1,String o2);
   }
    public static void main(String[] args) {
	MyClass myClass = new MyClass(10,"Test1");
	myClass.run();
	//因為GetMyClass 的get方法沒有參數
	//我使用了::new的 method reference
	//所以 java會嘗試呼叫 預設建構式 並將此物件回傳
	GetMyClass myclass2 = MyClass::new;
	System.out.println(myclass2.get());
	//因為MyClass有傳2參數的建構式 並且類型與順序跟介面依樣 
	// 所以可以如下方式呼叫
	GetMyClass2 myclass3 = MyClass::new;
	System.out.println(myclass3.get(65,"MyClass3"));
	
    }
    
}
