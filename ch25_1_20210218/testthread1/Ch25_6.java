/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch25_1_20210218.testthread1;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
/**
 *
 * @author xvpow
 */
public class Ch25_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	// TODO code application logic here
	//取得cpu核心數
	int count = Runtime.getRuntime().availableProcessors();	
	ExecutorService es =  Executors.newFixedThreadPool(count/2);
	    for (int i= 1;i<=50;i++){
		    es.execute(()->{
		    System.out.println(Thread.currentThread().getName());
	    });
	}

	
    }
    
}
