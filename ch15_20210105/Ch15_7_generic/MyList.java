/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch15_20210105.Ch15_7_generic;
import java.util.ArrayList;
//T 類型
//E 元素
//K 關鍵字
//R 表示回傳類型
public class MyList<T> {
    private ArrayList<T> list = new ArrayList();
    //預設情況下只能使用Object的函數
    public void add(T value){	
	list.add(value);	
    }
    public T get(int index){
	return list.get(index);
    }
    
}
