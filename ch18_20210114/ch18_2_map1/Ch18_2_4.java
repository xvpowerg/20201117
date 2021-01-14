/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch18_20210114.ch18_2_map1;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author xvpow
 */
public class Ch18_2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	Map<String,Integer> map = new HashMap<>();
	map.put("Howard", 95);
	map.put("Iris", 85);
	map.put("Vivin", 91);
	map.put("Lindy", 63);
	map.put("Ken", 76);
	//Key存在
	map.compute("Iris", (k,v)->{
	    System.out.println("Key存在"+k+":"+v);		
	    return 100;
	});
	System.out.println(map);
	//Key不存在
	map.compute("Joy", (k,v)->{	    
	    System.out.println("Key不存在"+k+":"+v);		
	    return 71;
	});
	System.out.println(map);
	//Key不存在
	map.computeIfAbsent("Nana", k->{
	    System.out.println("computeIfAbsent Key不存在:");
	    return 86;});
	System.out.println(map);
	//Key存在
	map.computeIfPresent("Lindy", (k,v)->{
	  System.out.println("computeIfPresent Key存在:"+v);	  
	  return 25;
	});
    }
    
}
