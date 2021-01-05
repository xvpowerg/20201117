/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch15_20210105.Ch15_7_generic;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch15_7 {

    /**
     * Generic  用來限定 換句話說 可以確定 取出來的數值 或放進去的數值是什麼類型
     *Generic 只能使用物件類型
     */
    public static void main(String[] args) {
	// TODO code application logic here
	MyList<String> list = new MyList();
	list.add("Ken");
	list.add("Vivin");
	list.add("Lindy");
	
	System.out.println(list.get(0));
	System.out.println(list.get(1));
	System.out.println(list.get(2));
	
	MyList<Integer> list2 = new MyList();
	list2.add(10);
	list2.add(25);	
	System.out.println(list2.get(0) + 2);
	
	TestClass<Integer,ArrayList<Integer>> tclass = new TestClass();
	
    }
    
}
