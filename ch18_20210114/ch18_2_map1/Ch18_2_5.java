/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch18_20210114.ch18_2_map1;
import java.util.ArrayList;
import java.util.HashMap;
public class Ch18_2_5 {
   static class Student{
	private String name;
	private int score;
	public Student(String name, int score) {
	    this.name = name;
	    this.score = score;
	}
	public String getName() {
	    return name;
	}
	public int getScore() {
	    return score;
	}	
	public String toString(){
	    return name+":"+score;
	}	
    }
   
   static void putMap(Student st,HashMap<String,Integer> map){
       int total = 0;
       String key = st.name;
       if (map.containsKey(st.name)){
	    total = map.get(key);
       }
       total += st.getScore();
       map.put(key, total);       
   }
    public static void main(String[] args) {
	Student st1 = new Student("Ken",100);
	Student st2 = new Student("Ken",72);
	Student st3 = new Student("Vivin",85);
	Student st4 = new Student("Lucy",33);
	Student st5 = new Student("Lucy",25);
	Student st6 = new Student("Ken",60);
	ArrayList<Student> list = new ArrayList();
	list.add(st1);
	list.add(st2);
	list.add(st3);
	list.add(st4);
	list.add(st5);
	list.add(st6);
	HashMap<String,Integer> map1 = new HashMap<>();
	//
//	list.forEach(st->putMap(st,map1));
//	System.out.println(map1);

	HashMap<String,Integer> map2 = new HashMap<>();	
	list.forEach(st->map2.merge(st.name, st.score,(ov,nv)-> ov + nv));
	System.out.println(map2);
	//
	HashMap<String,Integer> map3 = new HashMap<>();	
	list.forEach(st->{
	    map3.computeIfPresent(st.getName(), (k,v)->v+st.getScore());
	    map3.computeIfAbsent(st.getName(), (k)->st.getScore());	
	});
	System.out.println(map3);
	
	//1 請將Student放入ArrayList
	//2 請使用Map幫我存放 姓名(K):總成績(V)
	
	
	
    }
    
}

