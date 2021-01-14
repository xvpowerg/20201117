/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch18_20210114.ch18_1_set1;

import tw.com.beans.Product;
import java.util.TreeSet;
import java.util.Comparator;

/**
 *
 * @author xvpow
 */
public class Ch18_1_2 {

    public static void main(String[] args) {
	Product p1 = new Product("Ps5", 35000);
	Product p2 = new Product("iphone12", 15000);
	Product p3 = new Product("Ipad", 25000);
	Product p4 = new Product("xBox", 75000);
	Product p5 = new Product("Android Phone", 35000);
	Comparator<Product> cp = 
		Comparator.comparing( p->p.getPrice());
	//thenComparing 可在排序其他屬性
	cp =  cp.thenComparing(p->p.getName());

	TreeSet<Product> set = new TreeSet<>(cp);
	set.add(p1);
	set.add(p2);
	set.add(p3);
	set.add(p4);
	set.add(p5);
	
	set.forEach(System.out::println);
    }
    
}
