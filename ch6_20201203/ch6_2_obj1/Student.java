/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6_20201203.ch6_2_obj1;
//姓名 長度大於10 小於2 王大明
//班級 一年甲班
//學號 長度為5開頭為英文字母.....
//成績 不可小於0 大於100
//成績 多少科目 
//個人總成績計算
//個人平均分數計算

public class Student {

    //屬性預設值跟陣列預設值一樣
    String name;
    String className;
    String id;
    //private 只能在相同內別內讀取
   private final int count = 3;
   int[] scores = new int[count];
    
    void printInfo() {
	System.out.printf("姓名:%s 班級:%s 學號:%s ",
		name,
		className,
		id);

	for (int i = 0; i < scores.length; i++) {
	    System.out.printf("成績%d:%d ", i + 1, scores[i]);
	}
	System.out.printf("總成績:%d 平均:%.2f ", sum(), avg());
	System.out.println();
    }

    int sum() {
	int sum = 0;
	for (int v : scores) {
	    sum += v;
	}
	return sum;
    }

    float avg() {
	return sum() / (float)count;
    }

}
