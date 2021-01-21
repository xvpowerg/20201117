/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch20_20210121.stream2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Ch20_3 {

    static class Student{
	private String  name;
	private int  score;
	public Student(String name, int score) {
	    this.name = name;
	    this.score = score;
	}	    
	@Override
	public String toString() {
	    return "Student{" + "name=" + name + ", score=" + score + '}';
	}	
	
	
    }
    public static void main(String[] args) {
	Student st1 = new Student("Ken",85);	
	Student st2 = new Student("Vivin",50);
	Student st3 = new Student("Lucy",70);	
	Student st4 = new Student("Iris",95);	
	Student st5 = new Student("Joy",30);
	Student st6 = new Student("Joy",83);
	Student st7 = new Student("Tom",93);
	Student st8 = new Student("Lindy",52);
	List<Student> list = new ArrayList();
	list.add(st1);
	list.add(st2);
	list.add(st3);
	list.add(st4);
	list.add(st5);
	list.add(st6);
	list.add(st7);
	list.add(st8);
	
	//collect 可以做一些集合
	List<Student> stList = 
		list.stream().filter(st->st.score>59).collect(Collectors.toList());
	System.out.println(stList);
	
	//Collectors.toCollection 可以是Set or List
	ArrayList<Student> arraySt =list.stream().filter(st->st.score>59).
		collect(Collectors.toCollection(ArrayList::new));
	System.out.println(arraySt);
	//如果要轉Map
	//注意如果Key重複使用傳兩參數的toMap會拋出例外
	Map<String,Student> stMap =
		list.stream().collect(Collectors.toMap(st->st.name, st->st,
			(ov,nv)->{
			    System.out.println(ov+":"+nv);			    
			    ov.score += nv.score;
			    return ov;}));
	System.out.println(stMap);
	//分群組
	Map<Integer,List<Student>> groupMap 
		= list.stream().collect(Collectors.groupingBy(st->st.score/10));
	System.out.println("groupMap:"+groupMap);
	//二分法
	Map<Boolean,List<Student>> partitionMap = list.stream().collect(Collectors.partitioningBy(st->st.score > 59));
	System.out.println(partitionMap);
	// 分隔符號 開頭 結尾
	String names = list.stream().map(st->st.name).distinct().
		collect(Collectors.joining(",","Title:","."));
	System.out.println(names);
	
    }
    
    
}
