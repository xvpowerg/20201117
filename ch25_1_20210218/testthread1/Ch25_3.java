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
public class Ch25_3 {
    
    static class Test{
	int x;
//	public synchronized void myrun(){
//	    
//	    for(int i=1;i<=5;i++){
//		System.out.println(++x);
//	    }
//	}
	
	public  void myrun(){
	    //重點保護
	synchronized(Test.class){
	    for(int i=1;i<=5;i++){
		System.out.println(++x);
	    }
	}	
	    
	}
    }
    
    public static void main(String[] args) {
	Test t1 = new Test();
	Thread th1 = new Thread(t1::myrun);
	Thread th2 = new Thread(t1::myrun);
	th1.start();
	th2.start();
	
	
    }
    
}
