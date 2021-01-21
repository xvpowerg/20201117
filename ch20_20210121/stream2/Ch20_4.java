/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch20_20210121.stream2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author xvpow
 */
public class Ch20_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	List<Integer> list = new ArrayList();
	list.add(50);
	list.add(20);
	list.add(100);
	list.add(32);
	
	Optional<Integer> opt = list.stream().reduce((v1,v2)->{ 
	    System.out.println(v1+":"+v2);	    
	    return v1+v2;});
	System.out.println(opt.get());
	
	 List<String> url = new ArrayList<>();
	 url.add("www.howard.com");
	 url.add("view");
	 url.add("10");
	 //https://www.howard.com/view/10
	String  newUrl = 
		url.stream().reduce("https://", (ov,nv)->ov+"/"+nv);
	System.out.println(newUrl);
	
	// 如果非parallel 狀況下　accumulator負責主要運算
	// parallel 狀況下 accumulator 會將所有數值與預設值先做運算後在combiner
	List<Integer> list2 = new ArrayList();
	list2.add(50);
	list2.add(20);
	list2.add(100);
	list2.add(32);
	int v = list2.stream().parallel().reduce(0, (v1,v2)->{
	System.out.println("ac:"+v1+":"+v2);
	return v1+v2;
	}, (v1,v2)->{
	    //只有parallel會呼叫
	System.out.println("com:"+v1+":"+v2);
	return v1+v2;
	});
	System.out.println(v);
    }
    
}
