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
public class Ch1_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	//&
	//|
	//^
	int n1 = 0b101101;//45 伺服器端
	int n2 = 0b110110;//54 客戶端
	//--------------------------
	//      &  100100
	//      |  111111
	//      ^  011011   
	
	System.out.println(n1);
	System.out.println(n2);
	System.out.println(n1 & n2);//過濾器
	System.out.println(n1 | n2);//融合
	int n3 = n1 ^ n2;
	System.out.println(n1 ^ n2);
	System.out.println(n1 ^ n3);
	System.out.println(n2 ^ n3);
	
    }
    
}
