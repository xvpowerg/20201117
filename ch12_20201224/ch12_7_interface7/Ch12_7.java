/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20201224.ch12_7_interface7;

/**
 *
 * @author xvpow
 */
public class Ch12_7 {
	
    static void foreachString(StringArrayIterator sai,
	                   StringPrintStyleIF sps){
	sai.foreach(sps);
    }
    
    public static void main(String[] args) {
	StringArray strArray = new StringArray(3);
	strArray.setValue(0, "Ken");
	strArray.setValue(1, "Vivin");
	strArray.setValue(2, "Lindy");
	StringPrintStyle sps = new StringPrintStyle();
	foreachString(strArray,sps);
//	System.out.println(strArray.getValue(0));
//	System.out.println(strArray.getValue(1));
//	System.out.println(strArray.getValue(2));
	

    Student st1 = new Student();
    st1.setScore(0, 95);
    st1.setScore(1, 82);
    st1.setScore(2, 71);
    //輪巡這個學生的所有科目
    foreachString(st1,sps);
    //作業
    //輪巡這個學生的所有科目與成績
    // 國文:95 數學:82 地理:71
    }
    
}
