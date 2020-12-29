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
public class IntPredicate implements MyPredicate{
      public boolean test(int v){
	  return v > 10;
      }
}
