/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch20_20210121.stream2;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
public class Ch20_1 {
    public static void main(String[] args) {
	List<String> list = new ArrayList();
	list.add("Howard");
	list.add("Ken");
	list.add("Vivin");
	list.add("Lucy");
	
	Optional<String> opt1 = list.stream().findAny();//用於parallelStream
	Optional<String> opt2 = list.stream().findFirst();
//如果不是呼叫parallelStream()兩者一樣
	System.out.println(opt1.get());
	System.out.println(opt2.get());
//	
//	 Optional<String> first =  list.stream().filter(n->n.length() < 4).findFirst();
//	 first.ifPresent(v->System.out.println(v));\
System.out.println("==================");
list.stream().forEach(System.out::println);
System.out.println("==================");
list.parallelStream().forEach(System.out::println);
System.out.println("==================");
//可在stream內呼叫parallel()將Stram變為parallel 
//可在stream內呼叫sequential();將Stram變為非parallel 
list.stream().parallel().filter(v->v.length()>2).sequential().forEach(System.out::println);

    }
    
}
