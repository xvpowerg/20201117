/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch15_20210105.Ch15_1_lambda1;
/*
 Lambda 
 1 必須是functional Interface 才可使用Lambda
 2 Lambda 不會占用額外的硬碟空間
*/
public class Ch15_1 {
    
    static interface TestLambda{
	void run();
    }
    
    static void testRun(TestLambda test){
	test.run();
    }
    public static void main(String[] args) {
	testRun(new TestLambda(){
	    public void run(){
		System.out.println("Run!!!");
	    }
	});
	
	testRun(()->{
	   System.out.println("testRun!!");
	});
	
	
	
    }
    
}
