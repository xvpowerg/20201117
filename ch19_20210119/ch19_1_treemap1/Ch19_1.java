/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch19_20210119.ch19_1_treemap1;
import java.util.TreeMap;
import java.util.Comparator;
/**
 *
 * @author xvpow
 */
public class Ch19_1 {
    static class MyNumber implements Comparable<MyNumber>{
	int number;
	String value;
        
	public int compareTo(MyNumber n){
	    return number -n.number;
	}
	
	public MyNumber(int number, String value) {
	    this.number = number;
	    this.value = value;
	}
      
	public int getNumber() {
	    return number;
	}

	public String getValue() {
	    return value;
	}
	public String  toString(){
	    
	    return number+":"+value;
	    
	}
	
    }

    public static void main(String[] args) {
	//TreeMap 使用Key排序
//	TreeMap<Integer,String> map = new TreeMap();
//	map.put(9, "Ken");
//	map.put(20, "Lucy");
//	map.put(8, "Iris");
//	map.put(11, "Tom");
//	System.out.println(map);
	
	MyNumber n1 = new MyNumber(10,"G1");
	MyNumber n2 = new MyNumber(16,"C2");
	MyNumber n3 = new MyNumber(25,"A3");
	MyNumber n4 = new MyNumber(7,"B4");
	//如果有Comparator與Comparable以Comparator為優先
	Comparator<MyNumber> comp =  Comparator.comparing(n->n.getValue());
	TreeMap <MyNumber,String> nMap = new TreeMap(comp.reversed());
	nMap.put(n1, "Ken");
	nMap.put(n2, "Vivin");
	nMap.put(n3, "Lindy");
	nMap.put(n4, "Joy");
	System.out.println(nMap);
	
	
    }
    
}
