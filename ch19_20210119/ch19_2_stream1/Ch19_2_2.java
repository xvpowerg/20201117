/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch19_20210119.ch19_2_stream1;

import java.util.ArrayList;

/**
 *
 * @author xvpow
 */
public class Ch19_2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
	list.add("Vivin");
	list.add("Ken");
	list.add("Lindy");
	list.add("Joy");
	//全部條件都要符合才通過
	//短路條件 只要找到一個不符合的就發生 回傳false
//	boolean b1 = list.stream().peek(v->System.out.println("all:"+v)).
//		allMatch(n->n.length()>2);	
//	System.out.println(b1);
//	System.out.println("================");
//	boolean b1_2 = list.stream().peek(v->System.out.println("all:"+v)).
//		allMatch(n->n.length()>3);	
//	System.out.println(b1_2);
	
	//全部條件都不符合才通過
	//短路條件 只要找到一個符合的就發生 回傳fasle
//	boolean b2  = list.stream().peek(v->{System.out.println("none:"+v);}).
//		noneMatch(v->v.length() < 2);
//	System.out.println(b2);
//	System.out.println("====================");
//	boolean b2_2  = list.stream().peek(v->{System.out.println("none:"+v);}).
//		noneMatch(v->v.length() < 4);
//	System.out.println(b2_2);
	
	
	//任意條件符合才通過
	//短路條件 只要找到一個符合的就發生 true
	boolean b3 =
		list.stream().peek(v->System.out.println("any:"+v)).
			anyMatch(v->v.indexOf("d") > -1);
	System.out.println(b3);
	
	
    }
    
}
