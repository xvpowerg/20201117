/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch16_20210107.Ch16_3_generices3;

/**
 *
 * @author xvpow
 */
public interface TestIF<T,R> {
      R objToValue(T t);
}
