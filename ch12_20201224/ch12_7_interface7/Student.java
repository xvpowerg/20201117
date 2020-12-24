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
public class Student implements StringArrayIterator{
    private String[] subjectList = {"中文","數學","地理"};
    private int[] scoreList = new int[3];
    public void setScore(int i,int score){
	scoreList[i] = score;
    }
    
    public String[] getIteratorValue(){
	return subjectList;
    }
}
