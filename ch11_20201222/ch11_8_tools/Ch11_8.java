/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11_20201222.ch11_8_tools;

/**
 *
 * @author xvpow
 */
public class Ch11_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	/*
	%d整數 %s字串 %f 浮點數 
	*/
	String info = 
		String.format("name:%s age:%d height:%.2f%n", 
			"Ken",25,180.0f);
	System.out.println(info);
    }
    
}
