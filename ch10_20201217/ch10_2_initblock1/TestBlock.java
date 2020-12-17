/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10_20201217.ch10_2_initblock1;

public class TestBlock {

    private String[] values = new String[500000];
    private int size;
    private float arg2;

    //非靜態初始化區塊 假設希望 在每個建構式呼叫之前 初始化好屬性 或做某些事
    //可使用init block
    {
	for (int i = 0; i < values.length; i++) {
	    values[i] = "";
	}
    }

    public TestBlock() {
    }

    public TestBlock(int size) {
	this.size = size;
    }

    public TestBlock(int size, float arg2) {
	this.size = size;
	this.arg2 = arg2;
    }

    //需求希望values 初始化為空白字串
    public void find(String s) {

	for (String v : values) {
	    if (v.equals(s)) {
		System.out.println("有!");
	    }
	}

    }

}
