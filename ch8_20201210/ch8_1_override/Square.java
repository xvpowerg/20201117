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
public class Square  extends Shape{
    private float w;
    private float h;
    public Square(float w,float h){
	this.w = w;
	this.h = h;
    }
    // @Override 幫我們檢查Override是否正確
    @Override
    public float length(){
	float len = 2 * (w + h);
	return len;
    }
}
