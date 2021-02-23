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
public class Ch25_4 {

    static class TestLock{
	
	public synchronized void show1(TestLock tlock){
	      System.out.println(Thread.currentThread().getName()+": Show1");
	    tlock.show2();
	}
	
	public synchronized void show2(){
	    System.out.println(Thread.currentThread().getName()+": Show2");
	}
    }
	    
	
    public static void main(String[] args) {
	TestLock tlock1 = new TestLock();
	TestLock tlock2 = new TestLock();
	
	Thread th1 = new Thread(()->tlock1.show1(tlock2));
	Thread th2 = new Thread(()->tlock2.show1(tlock1));
	
	th1.start();
	th2.start();
	
	
    }
    
}
