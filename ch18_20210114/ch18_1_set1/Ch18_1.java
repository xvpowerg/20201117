/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch18_20210114.ch18_1_set1;

import java.util.TreeSet;
import tw.com.beans.Product;
import java.util.Comparator;

/**
 *
 * @author xvpow
 */
public class Ch18_1 {

    static class MyComparator implements Comparator<Product>{
	private Order order = Order.ASC;
	private int offset = 1;
	enum Order{
	    ASC,
	    DESC
	}
	MyComparator(){}
	MyComparator(Order order){
	    this.order = order;
	       switch(order){
		case ASC:
		offset = 1;    
		  break;
		case  DESC:
		 offset = -1;   
		    break;
	    }	
	}
	//p1 大於 p2 回傳正數
	//p1 小於 p2 回傳負數
	//p1 等於 p2 回傳0
	public int compare(Product p1,Product p2){
	  return (p1.getPrice() - p2.getPrice()) * offset;	   
	}
    }
    public static void main(String[] args) {
	Product p1 = new Product("Ps5",35000);
	Product p2 = new Product("iphone12",15000);
	Product p3 = new Product("Ipad",25000);
	MyComparator myc = new MyComparator(MyComparator.Order.ASC);
	TreeSet<Product> set = new TreeSet(myc);
	set.add(p1);
	set.add(p2);
	set.add(p3);
	set.forEach(System.out::println);
    }
    
}
