/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch16_20210107.Ch16_4_collection1;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch16_4_4 {
	static class MyNumber{
	    int number;
	    MyNumber(int n){
		number = n ;
	    }
	  public String toString(){
	      return number+"";
	  }    
	  
	  public boolean equals(Object oj){
		MyNumber n = (MyNumber)oj;
		return number == n.number;
	  }
	}
    public static void main(String[] args) {
	MyNumber n1 = new MyNumber(10);
	MyNumber n2 = new MyNumber(21);
	MyNumber n3 = new MyNumber(15);
	
	MyNumber n4 = new MyNumber(21);
	
	ArrayList<MyNumber> list = new ArrayList<>();
	list.add(n1);
	list.add(n2);
	list.add(n3);
	list.forEach(System.out::println);
	//List是用equals作為比對是否存在
	System.out.println(list.contains(n4));
	System.out.println(list.remove(n4));
	list.forEach(System.out::println);
    }
    
}
