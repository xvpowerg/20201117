/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch1_2201117;

/**
 *
 * @author xvpow
 */
public class Ch1_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	boolean b1 = true;
	boolean b2 = false;
	
	System.out.println(b1 && b2);//兩邊為真才為真
	System.out.println(b1 || b2);//單為真就是真
	System.out.println(b1  ^  b2);//一真一假才為真
	System.out.println(!b1);//唱反調
	//短路現象 不繼續往下執行
	int g = 0;	
	boolean b3 = g < 1 && ++g > 3;
	System.out.println(g);
	System.out.println(b3);
	int h = 0;	
	//且 短路驅動 因為左邊為false
	boolean b4 = h >1 && ++h > 3;
	System.out.println(h);
	System.out.println(b4);
	
	//或 短路驅動 因為左邊為true
	int k = 0;	
	boolean b5 = k < 1 || ++k > 3;
	System.out.println(k);
	System.out.println(b5);
	

	
    }
    
}
