/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch16_20210107.Ch16_4_collection1;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;

/*
List 繼承了 Collection
ArrayList 實作了 List 
*/
public class Ch16_4 {

  
    public static void main(String[] args) {
	ArrayList<String> list = new ArrayList<>();
	list.add("Ken");
	list.add("Vivin");
	list.add("Lindy");
	list.add("Joy");
	
	System.out.println(list.get(2));
	System.out.println(list.size());
	
	System.out.println("==================");
	for (String s :list){
	    System.out.println(s);
	}
	System.out.println("==================");
	list.forEach(st->System.out.println(st));
	
	

    }
    
}
