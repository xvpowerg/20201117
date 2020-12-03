/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6_20201203.ch6_2_obj1;

/**
 *
 * @author xvpow
 */
public class Ch6_2 {
    //基本類別
    //類別
	//擁有某些特徵的一群東西分組
	//或是一些特殊的功能或操作
    
    //物件
	 //使用類別建立的每位個體    
    public static void main(String[] args) {
	// TODO code application logic here
	//有個變數可以存Student這個物件  
	//變數名稱為st1
	Student st1;
	//new(建立)一組Student物件 放到st1
	st1 = new Student();
	st1.name = "王大明";
	st1.className = "五年乙班";
	st1.id = "B0007";
	st1.scores[0] = 75;
	st1.scores[1] = 82;
	st1.scores[2] = 94;
	st1.printInfo();
	
      Student st2 = new Student();
	st2.name = "李大牛";
	st2.className = "三年A班";
	st2.id = "A0012";
	st2.scores[0] = 92;
	st2.scores[1] = 85;
	st2.scores[2] = 68;
	st2.printInfo();

	
    }
    
}
