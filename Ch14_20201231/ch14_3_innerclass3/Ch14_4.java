/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch14_3_20201231.innerclass3;

/**
 *
 * @author xvpow
 */
public class Ch14_4 {

	static void replace(String[] values,		
		MyPredicate myPredicate,
		String target){
	        String upTarget = target.toUpperCase();
		for (int i =0;i < values.length;i++){
		    String str = values[i];
		    if(myPredicate.test(str)){
		      String newStr = 
			      str.replace(target, upTarget);
			values[i] = newStr;
		    }
		}
	}
    public static void main(String[] args) {
	
	String[] str = {"Ken","Vivin","Tom",
	    "Gigi","Lindy"};
	String target = "n";
	//找是否有n
//	UpPredicate up = new UpPredicate(target);
//	replace(str,up,target);
	MyPredicate myp = new MyPredicate(){
	    public boolean test(String source){
		return source!= null && source.length() > 3;
	    }
	};
	replace(str,myp,target);
	for (String s1 : str){
	    System.out.println(s1);
	}
	
	
	
    }
    
}
