/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10_20201217.ch10_2_initblock1;

/**
 *
 * @author xvpow
 */
public class Ch10_2 {

       //非靜態區塊
    public static void main(String[] args) {
	TestBlock tb = new TestBlock();
	tb.find("Ken");
	tb.find("Ken");
	
	TestBlock tb2 = new TestBlock(20);
	tb2.find("Vivin");
	
    }
    
}
