/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch19_20210119.ch19_3_optional;
import java.util.Optional;
import java.util.OptionalInt;
/**
 *
 * @author xvpow
 */
public class Ch19_3_2 {
	

  
    public static void main(String[] args) {
	//Optional.of 不相容null
	Optional<String> op1= Optional.of("T1");
	Optional<String> op2= Optional.ofNullable("T2");
	System.out.println(op1.get()+":"+op2.get());
	
//	Optional<String> op3= Optional.of(null);
//	Optional<String> op4= Optional.ofNullable(null);
//	System.out.println(op3.get()+":"+op4.get());
	
	Optional<String> op5 = Optional.empty();	
	//op5 = Optional.ofNullable("T3");
	//Optional 是empty會拋出例外
	System.out.println(op5.get());
	
	
	
	
	
    }
    
}
