/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch25_1_20210218.testthread1;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class Ch25_5 {

    public static void main(String[] args) {
	// TODO code application logic here
	ExecutorService es =
		Executors.newCachedThreadPool();
	
	
	for (int i= 1;i<=50;i++){
	    	es.submit(
		()->{ 
		    System.out.println(Thread.currentThread().getName());
		});
	}

	
    }
    
}
