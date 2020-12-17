/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10_20201217.ch10_1_obj_override;

/**
 *
 * @author xvpow
 */
public class Ch10_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	Person p1 = new Person("Ken",38);
	Person p2 = new Person("Ken",38);
	//p1.print();
	System.out.println(p1);	
	String msg = p1.toString();
	System.out.println(msg);	
	Ch10_1 ch10 = new Ch10_1();
	//預設情況下equals 比較記憶體位置 == 一樣
	System.out.println(p1.equals(p2));
	
	
    }
    
}
