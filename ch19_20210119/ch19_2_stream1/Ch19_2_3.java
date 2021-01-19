/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch19_20210119.ch19_2_stream1;

import java.util.ArrayList;

/**
 *
 * @author xvpow
 */
public class Ch19_2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	 ArrayList<String> list = new ArrayList<>();
	list.add("Vivin");
	list.add("Ken");
	list.add("Ken");
	list.add("Lindy");
	list.add("Joy");
	//distinct過濾重複
	list.stream().distinct().forEach(System.out::println);
	//list.stream().findAny()
	//list.stream()
	
	
    }
    
}
