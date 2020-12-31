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
public class Ch14_1 {
    //非靜態內部類
    public static void main(String[] args) {
	// TODO code application logic here
	
	Student st1 = new Student("Ken");
	st1.setScore("國文", 85);
	System.out.println(st1.getScore());
	//很少用
	Student st2 = new Student("Vivin");
	Student.Score score2 = st2.new Score("數學",85);
	System.out.println(score2);
    }
    
}

