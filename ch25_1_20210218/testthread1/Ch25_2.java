/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch25_1_20210218.testthread1;

/**
 *
 * @author xvpow
 */
public class Ch25_2 {


    public static void main(String[] args) {
	// TODO code application logic here
	Thread t1 = new Thread(()->{for(int i=1;i<=500000;i++){
		System.out.println(Thread.currentThread().getName()+":"+i);
	}});
	Thread t2 = new Thread(()->{for(int i=1;i<=500000;i++){
		System.out.println(Thread.currentThread().getName()+":"+i);
	}});
	t1.setName("Thread1");
	t2.setName("Thread2");
	t1.start();
	t2.start();
	
	
    }
    
}
