/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch16_20210107.Ch16_1_generices1;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch16_2 {

    /**
     * 泛型相容性1
     */
    static void testGen(ArrayList<Test1> data){
	data.forEach(System.out::println);
    }
    public static void main(String[] args) {
	//一樣
	ArrayList<Test1> list = new ArrayList();
	testGen(list);
	//無泛型也可以
	testGen(new ArrayList());
	//<>也可以
	testGen(new ArrayList<>());
	//如果有泛型時必須一樣才可相容
	ArrayList<Test2> list2 = new ArrayList<>();
	list2.add(new Test2());
	list2.add(new Test2());
	//testGen(list2);//錯誤因為Test2不是Test1
	
    }
    
}
