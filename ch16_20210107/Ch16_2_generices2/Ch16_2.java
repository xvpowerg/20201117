/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch16_20210107.Ch16_2_generices2;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch16_2 {

    /**
     * 泛型相容性2
     * 繼承關係
     * 父類關係
     */
    //可相容所有是Test1子類型的泛型
    //? extends T 必須是T的子類型才可相容
    //無法新增 主要用來輸出
    static void testList(ArrayList<? extends Test1> list){
	//list.add(new Test1());
	//Test1 t1 = list.get(0);
	//list.forEach(System.out::println);
    }
    
    //? supert T 必須是T的父類型才可相容
    //可以add 類型可以是T 或是 T的子類型
    //比較適合寫入 不適合輸出
    static  void testList2(ArrayList<? super Test3> list){	
	list.add(new Test3());
	list.add(new Test4());
	//取值為物件
	Object t3 = list.get(0);
	
    }
    
    
    public static void main(String[] args) {
	ArrayList<Test2> lis2 = new ArrayList();
	lis2.add(new Test2());
	lis2.add(new Test2());
	lis2.add(new Test2());
	testList(lis2);
	
	ArrayList<Test1> t1 = new ArrayList();
	ArrayList<Test2> t2 = new ArrayList();
	ArrayList<Test3> t3 = new ArrayList();
	//Test4 不是Test3的父類型 
	ArrayList<Test4> t4 = new ArrayList();
	testList2(t1);
	testList2(t2);
	testList2(t3);
	//testList2(t4);
	
	
	
    }
    
}
