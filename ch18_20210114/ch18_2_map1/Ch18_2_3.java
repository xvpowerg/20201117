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
public class Ch18_2_3 {

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
	//merge key不存在 
	//會直接把 83寫入map
	map.merge("Joy", 83, (k,v)->{		
	    System.out.println("key不存在 ");
	return 10;
	});
	System.out.println(map);
	//key存在才會執行BiFunction
	map.merge("Lindy", 12, (k,v)->{
	    System.out.println("key存在");
	    return 98;});
	
	System.out.println(map);
    }
    
}
