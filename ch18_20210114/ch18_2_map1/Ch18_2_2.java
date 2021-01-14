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
public class Ch18_2_2 {

    /**
     * Map 其他功能
     */
    public static void main(String[] args) {
	Map<String,Integer> map = new HashMap<>();
	map.put("Howard", 95);
	map.put("Iris", 85);
	map.put("Vivin", 91);
	map.put("Lindy", 63);
	map.put("Ken", 76);
	
	//key沒有重複才放入數值 containsKey = true表示有此key
	if (!map.containsKey("Vivin")){
	    System.out.println("無此Key!!");
	}
	//key不存在才可put進入map
	map.putIfAbsent("Joy", 93);	
	map.forEach((k,v)->System.out.println(k+":"+v));
	
	map.replaceAll((k,v)->v+5);
	System.out.println(map);
	
    }
    
}
