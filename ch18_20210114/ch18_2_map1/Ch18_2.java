/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch18_20210114.ch18_2_map1;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.Map.Entry;
public class Ch18_2 {

    public static void main(String[] args) {
	Map<String,Integer> map = new HashMap<>();
	map.put("Howard", 95);
	map.put("Iris", 85);
	map.put("Vivin", 91);
	map.put("Howard", 100);
	
	System.out.println(map.get("Iris"));
	map.forEach((k,v)->System.out.println(k+":"+v));
	
	Set<Entry<String,Integer>> set =  map.entrySet();
	for (Entry<String,Integer> entry : set){
	    System.out.println(entry.getKey()+":"+entry.getValue());
	}
	
    }
    
}
