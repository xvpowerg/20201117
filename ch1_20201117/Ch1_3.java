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
public class Ch1_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	
	// 一元運算
	// ++ --
	/*int i = 0;
	System.out.println(i++);//0
	System.out.println(++i);//2
	System.out.println(i);//2
	System.out.println(i--);//2
	System.out.println(--i);//0*/
	//k=1
	int k = 0;
	int v = k++ + 2 + ++k + k--;
		//0 + 2 +   2 + 2
	System.out.println(k);
	System.out.println(v);
	
    }
    
}

