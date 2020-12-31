/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch14_2_20201231.innerclass2;

/**
 *
 * @author xvpow
 */
public class Ch14_2 {

    /**
     *匿名內部類
     */
    public static void main(String[] args) {
	Dog dog = new Dog();
	dog.bark();
	Dog dog2 = new MyDog();
	dog2.bark();//喵喵
	//匿名內部類的作用在覆寫
	Dog dog3 = new Dog(){
	    public void bark(){
		System.out.println("支支!");
	    }
	};
	dog3.bark();
	
	
    }
    
}
