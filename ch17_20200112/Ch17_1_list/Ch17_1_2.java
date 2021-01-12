/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch17_20200112.Ch17_1_list;

import java.util.LinkedList;
import java.util.Deque;
/**
 *
 * @author xvpow
 */
public class Ch17_1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	LinkedList<String> list = new LinkedList();
	list.add("Howard");
	list.add("Vivin");
	list.add("Lindy");
	list.add("Joy");
	Deque<String> stack = list;	
	stack.addLast("Ken");
	System.out.println(list);
	System.out.println(list.pollLast());
	String v = null;
	while( (v= list.pollLast()) != null){
	    System.out.println(v);
	}
		
	System.out.println(list);
    }
    
}
