/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch15_20210105.Ch15_7_generic;
import java.util.List;
/**
 *
 * @author xvpow
 */
public class TestClass<LT,T extends List<LT>> {
    
    public void add(T data,LT value){
	data.add(value);
    }
    
}
