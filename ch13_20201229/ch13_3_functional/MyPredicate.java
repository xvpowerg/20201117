/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch13_20201229.ch13_3_functional;

/**
 *
 * @author xvpow
 */
//@FunctionalInterface 驗證是否為真的FunctionalInterface
@FunctionalInterface
public interface MyPredicate {
    boolean test(int v);   
      
}
