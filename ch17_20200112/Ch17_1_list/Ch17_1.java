/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch17_20200112.Ch17_1_list;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class Ch17_1 {
    //ArrayList
    //陣列實作 適合顯示 不適合 插入 刪除  第一筆與中間筆
    //LinkedList
    //使用Linked物件實作 不適合 顯示
    //LinkedList 也實作了Queue 與 Dueue結構
    public static void main(String[] args) {
	LinkedList<String> list = new LinkedList();
	list.add("Howard");
	list.add("Vivin");
	list.add("Lindy");
	list.add("Joy");
	list.forEach(System.out::println);
	
	Queue<String> queue = list;
	//offer 加數值
	queue.offer("Lucy");
	System.out.println(list.size());
	//poll() 到無資料時會回傳null
	//System.out.println(queue.poll());
	String value = null;
	while( (value = queue.poll())!= null  ){
	    System.out.println(value);
	}
	System.out.println(queue.size());
	
    }
    
}
