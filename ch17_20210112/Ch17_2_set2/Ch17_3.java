/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch17_20210112.Ch17_2_set2;
import java.util.TreeSet;
public class Ch17_3 {
    static class Student implements Comparable<Student>{
	private String name;
	private int age;
	private int score;

	//如果目前的大於傳入回傳正數
	//如果目前的小於傳入回傳負數
	//如果目前的等於傳入回傳0
	public int compareTo(Student st){
	    if (score > st.score){
		return 1;
	    }else if(score < st.score){
		return -1;
	    }else if(age > st.age){
		return 1;
	    }else if(age < st.age){
		return -1;
	    }
	    return name.compareTo(st.name);
	}
	
	public Student(String name, int age, int score) {
	    this.name = name;
	    this.age = age;
	    this.score = score;
	}
	public String toString(){
	    return name+":"+age+":"+score;
	}
	
    }
  /*
    TreeSet可排序
    預設 ASC 小到大遞增排序
    DESC 大到小遞減排序
    
    */
    public static void main(String[] args) {
	/*TreeSet<Integer> set = new TreeSet();
	set.add(15);
	set.add(6);
	set.add(11);
	set.add(8);
	set.add(9);
	set.add(5);
	set.add(6);
	set.forEach(System.out::println);*/

	Student st1 = new Student("Ken",25,78);
	Student st2 = new Student("Vivin",35,83);
	Student st3 = new Student("Iris",12,91);
	Student st4 = new Student("Tom",26,78);
	Student st5 = new Student("Joy",25,63);
	Student st6 = new Student("Ben",25,78);
	TreeSet<Student> stSet = new TreeSet();
	stSet.add(st1);
	stSet.add(st2);
	stSet.add(st3);
	stSet.add(st4);
	stSet.add(st5);
	stSet.add(st6);
	stSet.forEach(System.out::println);
    }
    
}
