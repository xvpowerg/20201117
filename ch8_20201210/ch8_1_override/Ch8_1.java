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
public class Ch8_1 {

    
    public static void printShape(Shape sq){
	System.out.println(sq.length());
    }
    //覆寫 Override 
    //子類型方法蓋過父類型的方法
    public static void main(String[] args) {
	Square s1 = new Square(2,3);
	System.out.println(s1.length());
	
	Circle c2 = new Circle(5);
	System.out.println(c2.length());
	
	printShape(s1);
	printShape(c2);
    }
    
}
