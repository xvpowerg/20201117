/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch14_5_20201231.functionalif2;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Consumer;

/**
 *
 * @author xvpow
 */
public class Ch4_6 {

    public static void main(String[] args) {
	ArrayList<String> list = new ArrayList<>();
	list.add("Ken");
	list.add("Vivin");
	list.add("Lucy");
	list.add("Gigi");

	list.stream().map(new Function<String, Integer>() {
	    public Integer apply(String v) {
		return v.length();
	    }
	}).forEach(new Consumer<Integer>() {
	    public void accept(Integer s) {
		System.out.println(s);
	    }
	});

    }

}
