/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20201208.ch7_2_extends_part1;

/**
 *
 * @author xvpow
 */
public class Ch7_2 {
    //繼承與多型(polymorphism)
    //不會繼承
    //1 私有的方法 屬性
    //2 建構式
    public static void main(String[] args) {
	Student st1 = new Student();
	st1.setName("Ken");
	st1.setHeight(175);
	st1.setAge(80);
	st1.printInfo();
	System.out.println();
	Student st2 = new Student("Vivin",20,161);
	st2.printInfo();
	System.out.println();
	
	Teacher te1 = new Teacher("Ken",31,178);
	//多型(polymorphism)
	Person p1 = te1;
	p1.printInfo();
	
    }
    
}
