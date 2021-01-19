/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch19_20210119.ch19_2_stream1;
import java.util.stream.Stream;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch19_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	//Stream 
	//用來做甚麼?
	//Stream取代統迴圈
	//未來可能需要"並行的程式碼"不須大量的改變
	//比一般迴圈好閱讀
	
	//Stream特性
	//不會修改來源
	//有分惰性與終端
	//不可重複使用
	
	//不會修改來源
//	ArrayList<String> list = new ArrayList<>();
//	list.add("Ken");
//	list.add("Vivin");
//	list.add("Lindy");
//	list.add("Joy");
//	list.stream().filter(st->st.length() > 3).forEach(System.out::println);
//	System.out.println(list);

//分惰性與終端
//惰性 執行某個函數不會立刻運作 
//終端 執行某個函數會立刻運作
	ArrayList<String> list = new ArrayList<>();
	list.add("Ken");
	list.add("Vivin");
	list.add("Lindy");
	list.add("Joy");
	//list.stream().filter(st->st.length() > 3).forEach(System.out::println);
	//System.out.println(list);
	//peek 可以查看Stream流的狀況
	list.stream().peek(v->{System.out.println(v);});
	//count 終端的
	long count = list.stream().peek(v->{System.out.println("peek:"+v);}).count();
	System.out.println(count);
	
	//不可重複使用
	Stream<String> stm = list.stream();
	stm.peek(System.out::println);
	Object obj = stm.findFirst();
	
	
	
    }
    
}

