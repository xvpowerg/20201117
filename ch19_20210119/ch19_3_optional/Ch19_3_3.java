/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch19_20210119.ch19_3_optional;
import java.util.Optional;
/**
 *
 * @author xvpow
 */
public class Ch19_3_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	Optional<String> opt1 = Optional.ofNullable("Test1");
	Optional<String> opt2 = Optional.ofNullable(null);
	String  name = "";	
	if (opt1.isPresent()){
	    name = opt1.get();
	}
	System.out.println(name);
	String v1 = opt1.orElse("Empty");
	System.out.println(v1);
	//"Empty為default數值"
	String v2 = opt2.orElse("Empty");
	System.out.println(v2);
	//default數值的取得比較複雜時
	v2 = opt2.orElseGet(()->{return  new String("Empty Get");});
	System.out.println(v2);
	//如內容是null可自訂一拋出例外
	opt2.orElseThrow(()->new IllegalArgumentException("不可空白"));
	
    }
    
}
