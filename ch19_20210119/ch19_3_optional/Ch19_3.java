/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch19_20210119.ch19_3_optional;
import java.util.Optional;
/**
 *
 * @author xvpow
 */
public class Ch19_3 {
	
    static class Student{
	private String  name;
	private int  score;
	private Optional<String> addr = Optional.empty();
	public Student(int score) {
	    this.score = score;
	}

	public Optional<String> getName() {
	    return Optional.ofNullable(name);
	}

	public int getScore() {
	    return score;
	}

	public void setName(String name) {
	    this.name = name;
	}

	public void setScore(int score) {
	    this.score = score;
	}
	public String toString(){
	    return name+":"+score;
	}
    }
  
    public static void main(String[] args) {
	// TODO code application logic here
	Student st1 = new Student(85);
	st1.setName(null);
//	if (st1.getName() != null && st1.getName().equals("Lucy")){
//	    st1.setScore(st1.getScore()+20);
//	}
//	System.out.println(st1);
	st1.getName().ifPresent(n->{	    
	    if (n.equals("Lucy")) st1.setScore(st1.getScore()+10);
	    });
	System.out.println(st1);
    }
    
}
