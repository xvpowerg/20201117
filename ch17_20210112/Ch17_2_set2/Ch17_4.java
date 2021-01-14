/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch17_20210112.Ch17_2_set2;
import tw.com.beans.Product;
import java.util.TreeSet;
/**
 *
 * @author xvpow
 */
public class Ch17_4 {

    static class MyProduct extends Product implements Comparable<MyProduct>{
	public MyProduct(String name,int price){
	    super(name,price);
	}
	public int compareTo(MyProduct mp){
	    if (this.getPrice() > mp.getPrice()){
		return 1;
	    }else if(this.getPrice() < mp.getPrice()){
		return -1;
	    }
	    return 0;
	}
    }
    public static void main(String[] args) {
	Product p1 = new MyProduct("Ps5",35000);
	Product p2 = new MyProduct("iphone12",15000);
	Product p3 = new MyProduct("Ipad",25000);
	TreeSet<Product> set = new TreeSet();
	set.add(p1);
	set.add(p2);
	set.add(p3);
	set.forEach(System.out::println);
    }
    
    
}
