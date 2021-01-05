/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch15_20210105.Ch15_6_methodreference3;
import java.util.function.BiConsumer;
public class MyClass {
    
    
  private int v1;
  private String v2;

  
  private void run(BiConsumer<Integer,String> bic){
      bic.accept(v1, v2);
  }
  private void printInfo(int v1,String v2){
      System.out.println(v1+":"+v2);
  }
  
  public void run(){
      //呼叫非靜態的method reference
      run(this::printInfo);      
  }
  
    public MyClass() {
	this(0,"未設定");
    }

    public MyClass(int v1, String v2) {
	this.v1 = v1;
	this.v2 = v2;
    }
    
    public String toString(){
	return v1+":"+v2;
    }

}
