/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4_20201126;

/**
 *
 * @author xvpow
 */
public class Ch4_2 {

    static int test2(int v1,int v2){
	int ans = v1 + v2;
	return ans;
    }
    //Stack FILO
    //Queue FIFO
    public static void main(String[] args) {
	//函數運行方式
	int a1 = 5;
	int b2 = 3;
	int v = test2(a1,b2);
	System.out.println(v);
	
    }
    
}
