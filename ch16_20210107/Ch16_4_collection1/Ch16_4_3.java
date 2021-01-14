/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch16_20210107.Ch16_4_collection1;
import java.util.ArrayList;
public class Ch16_4_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	ArrayList<Integer> list = new ArrayList<>();
	list.add(25);
	list.add(40);
	list.add(71);
	list.add(83);	
	list.remove(Integer.valueOf(71));
	list.forEach(System.out::println);
    }
    
}
