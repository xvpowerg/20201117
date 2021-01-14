/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch16_20210107.Ch16_4_collection1;

import java.util.ArrayList;

/**
 *
 * @author xvpow
 */
public class Ch16_4_2 {	
    private static  int count = 0;
   static void foreach(ArrayList<String> list){
       count = 0;
       System.out.println("===================");
       list.forEach((st)->{
	    System.out.println(count++ +":"+st);
       });
       System.out.println("===================");
   }
    public static void main(String[] args) {
	ArrayList<String> list = new ArrayList<>();
	list.add("Ken");
	list.add("Vivin");
	list.add("Lindy");
	list.add("Joy");	
	list.add("Iris");	
	foreach(list);
	//插入
	list.add(1, "Iris");
	foreach(list);
	//插入一群
	ArrayList<String> insertList = new ArrayList<>();
	insertList.add("Lucy");
	insertList.add("Tom");
	list.addAll(3, insertList);
	foreach(list);
	// 查看List是否有Iris
	System.out.println(list.contains("Iris"));
	//找不到回傳-1
	int index = list.indexOf("Iris");
	int lastIndex = list.lastIndexOf("Iris");
	System.out.println(index);
	System.out.println(lastIndex);
	list.remove("Joy");
	foreach(list);
	//容易考
	list.removeIf((str)->str.length() < 4);
	foreach(list);
	//只要是Iris就改大寫
	list.replaceAll(str->str.equals("Iris")?str.toUpperCase():str);
	foreach(list);
	
    }
    
}
