/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch25_1_20210218.testthread1;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.IntSupplier;
import java.util.function.IntConsumer;
/**
 *
 * @author xvpow
 */
public class Ch25_7 {
    
     static class IntRandomEvent implements Runnable{
	 IntSupplier intSupplier;
	 IntConsumer complate;
	 public IntRandomEvent(IntSupplier input,IntConsumer complate){
	     intSupplier = input;
	     this.complate = complate;
	 }
	 
	 public void run(){
	  complate.accept(intSupplier.getAsInt());
	 }
     }
    
    
    public static void main(String[] args) {
	// TODO code application logic here
	
	ExecutorService es =  Executors.newFixedThreadPool(2);
	Future<Integer> fu =
		es.submit(()->{
		    Thread.sleep(2000);
		    return ThreadLocalRandom.current().nextInt(50000);});
	
	IntRandomEvent intEvent = new  IntRandomEvent(
		()->{try{
		    return fu.get();
		}catch(Exception ex){} 
		return 0;},
		System.out::println);
	  System.out.println("Step 1");
	Thread runThread = new Thread(intEvent);
	runThread.start();
	System.out.println("Step 2");

//	try{
//	    System.out.println("Step 1");
//		int v = fu.get();    
//		System.out.println(v);
//	}catch(Exception ex){
//		System.out.println(ex);
//	}
//	System.out.println("Step 2");
	es.shutdown();
    }
    
}
