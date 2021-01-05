/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch15_20210105.Ch15_4_methodreference;
import java.util.function.Consumer;
public class Ch15_4 {

    /**
     * Method Reference 用來簡化Lambda的
     */
    static void mySplit(String st){
	String[] array = st.split(",");
              for (int i = 0; i< array.length;i++){
		    array[i] = array[i].toUpperCase();
	      }
	     for (int i =0;i <  array.length;i++){
		 System.out.println(array[i]);
	     }	
    }
    public static void main(String[] args) {
	Consumer<String> consumer = st-> System.out.println(st);	
	consumer.accept("Test!!");
//	"Ken,Vivin,Lindy"
	Consumer<String> splite =st->{
	    String[] array = st.split(",");
              for (int i = 0; i< array.length;i++){
		    array[i] = array[i].toUpperCase();
	      }
	     for (int i =0;i <  array.length;i++){
		 System.out.println(array[i]);
	     }	
	} ;	
	splite.accept("Ken,Vivin,Lindy");
	//:: Method Reference
	Consumer<String> splite2 = Ch15_4::mySplit;
	splite2.accept("iris,lucy,tom");
	
    }
    
}
