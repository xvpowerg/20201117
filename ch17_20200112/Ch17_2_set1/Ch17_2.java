/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch17_20200112.Ch17_2_set1;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
public class Ch17_2 {

    static class Item{
	private String name;
	private int id;

	public Item(String name, int id) {
	    this.name = name;
	    this.id = id;
	}
	public String toString(){
	    return name+":"+id;
	}
	public boolean equals(Object obj){
	    Item it = (Item)obj;
	    return  it.id == id && it.name.equals(name) ;
	}
	public int hashCode(){
	    return id+name.hashCode();
	}
    }
    
   //Set的內容不會重複
   //一般的Set無順序
   //hashCode 可以先使用hashCode判斷物件是否一樣的條件之一
    //hashCode 預設情況給的是參考位置
    //hashCode 把物件數字化 可以先快速確定是否不相等
    //hashCode 
    //如果hashCode 不相等 物件一定不相等
    //如果hashCode 相等 物件不一定相等
    //hashCode 不可使用亂數 需要穩定的數字
    
    //HashSet 如果hashCode不相等不會比較equals
    public static void main(String[] args) {
	/*Set<String> set1 = new HashSet<>();
	set1.add("Ken");
	set1.add("Lucy");
	set1.add("Joy");
	set1.add("Iris");
	set1.add("Ken");
	set1.forEach(System.out::println);*/
	Item i1 = new Item("A1",100);
	Item i2 = new Item("A2",50);
	Item i3 = new Item("A3",700);
	Item i4 = new Item("A4",300);
	Item i5 = new Item("A3",700);
	System.out.println(i5.equals(i3));
	
	Set<Item> set2 = new HashSet<>();
	set2.add(i1);
	set2.add(i2);
	set2.add(i3);
	set2.add(i4);
	set2.add(i5);
	set2.forEach(System.out::println);
System.out.println("===================");
//Set轉List
	ArrayList<Item> arrayList =new ArrayList();
	arrayList.addAll(set2);
	arrayList.forEach(System.out::println);
	arrayList.sort((x1,x2)->x1.name.compareTo(x2.name));
	System.out.println("===================");
      arrayList.forEach(System.out::println);
    }
    
}

