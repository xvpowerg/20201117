/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch22_20210128.Ch22_2_close;
import java.lang.AutoCloseable;
import java.io.Closeable;

//AutoCloseable close拋出Eexceotion
//Closeable close拋出IOEexceotion
public class Ch22_2 {

    static class Test1 implements AutoCloseable{
	    private String  name;

	public Test1(String name) {
	    this.name = name;
	}
	
	public void close(){
	    System.out.println(this.name);
	}
	    
    }

    static class Test2 implements AutoCloseable{
	private String  name;

	public Test2(String name) {
	    this.name = name;
	}
	public void close(){
	System.out.println(this.name);
	}
    }
    
    
    
    public static void main(String[] args) {
	// 必須是AutoCloseable 才可放入try()
	//關閉順序T2 在 T1
	try(Test1 t1 = new Test1("Test1");
	Test2 t2 = new Test2("Test2");){
	    
	}
    }
    
}
