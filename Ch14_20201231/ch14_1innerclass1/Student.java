/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch14_1_20201231.innerclass1;

/**
 *
 * @author xvpow
 */
public class Student {
    private String name;
    private Score score;
    Student(String name){
	this.name = name;
    }
    public void setScore(String subject,int number){
	score = new Score(subject,number);
    }
    
    public Score getScore(){
	return score;
    }
    //非靜態內部類可讀取外部類的所有屬性與方法
    public  class Score{
	private String subject;
	private int number;
	
	public Score(String subject,int number){
	    this.subject = subject;
	    this.number = number;
	}
	public boolean isPass(){
	    return number > 59;
	}
	public String toString(){
	    return name+":"+subject+":"+number;
	}
    }
}
