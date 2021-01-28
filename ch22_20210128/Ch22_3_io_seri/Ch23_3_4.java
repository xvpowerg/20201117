/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch22_20210128.Ch22_3_io_seri;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
/**
 *
 * @author xvpow
 */
public class Ch23_3_4 {
    //序列化時父無Serializable
  static class Test0{
      private String t0 = "T0";

	public String getT0() {
	    return t0;
	}

	public void setT0(String t0) {
	    this.t0 = t0;
	}      
  }  
static  class Test1 extends Test0 implements Serializable{
	private String t1 = "T1";

	public String getT1() {
	    return t1;
	}
	public void setT1(String t1) {
	    this.t1 = t1;
	}
	@Override
	public String toString() {
	    return "Test1{" + "t1=" + t1 + '}'+" t0:"+this.getT0();
	}
	
}
    public static void main(String[] args)throws Exception {
	    // TODO code application logic here	    
	    Test1 t1 = new Test1();
	    t1.setT0("V0");
	    t1.setT1("V1");
	    System.out.println(t1);
	    
	    //序列化
	    File file = new File("C:\\mydir\\t1.obj");
	    try(FileOutputStream fileOut = new FileOutputStream(file);
		   ObjectOutputStream objOut = new ObjectOutputStream(fileOut)){
		objOut.writeObject(t1);
	    }
	    
	    //反序列化 父類別的數值 無寫入到序列化檔案內
	    try(FileInputStream fin = new FileInputStream(file);
		ObjectInputStream objin = new ObjectInputStream(fin);){
		   Test1 newt1 =(Test1) objin.readObject();
		   System.out.println(newt1);
	    }	    
    }    
}
