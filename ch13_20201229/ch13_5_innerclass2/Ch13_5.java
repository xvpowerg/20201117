/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch13_20201229.ch13_5_innerclass2;

/**
 *
 * @author xvpow
 */
public class Ch13_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	String[] names = {"Ken","Vivin","Lindy"};
	String[] str = TestClass.appendTitle(names, "經理");
	//希望輸出 
	/*經理:Ken
	經理:Vivin
	經理:Lindy
	*/
	for (String name : str){
	    System.out.println(name);
	}
    }
    
}
