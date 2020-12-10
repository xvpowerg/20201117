/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20201210.ch8_1_override;

/**
 *
 * @author xvpow
 */
public class Circle  extends Shape{
    private float r;
    public Circle(float r){
	this.r = r;
    }
    public float length(){
	double len = 2* Math.PI * r;
	     return  (float)len;
    }
}
