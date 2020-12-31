/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch14_5_20201231.functionalif;
import java.util.ArrayList;
import java.util.function.Consumer;

public class Ch4_5 {

    //Consumer<T>  accept
    //Function<T,R>  R apply T
    //Predicate<T> boolean test(T)
    //Supplier<T> T get()
    //UnaryOperator<T> T apply(T)
    
    public static void main(String[] args) {
	ArrayList<String> list = new ArrayList<>();
	list.add("Ken");
	list.add("Vivin");
	list.add("Lucy");
	list.add("Gigi");
	//匿名內部類 不可修改 區域變數
	list.forEach(new Consumer<String>(){
	    int count = 1;
	    public void accept(String v){

		System.out.println(count+v);
				count++;
	    }
	});
	
    }
    
}
