
package ch3_20201124;
import java.util.stream.IntStream;
public class Ch3_1 {
    public static void main(String[] args) {
	int[] array1 = new int[5];
	array1[1] = 50;
	array1[3] = 72;
	array1[4] = 86;
	for (int i= 0;i<array1.length;i++){
	    System.out.print(array1[i]+" ");
	}
	 System.out.println();
	//for each
	for (int v : array1){
	    System.out.print(v+" ");
	}
	System.out.println();
	
     IntStream.of(array1).forEach(System.out::println);
    	System.out.println();
	 
    }
    
}
