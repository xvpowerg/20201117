/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch23_20200204.nio2;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.stream.Stream;
public class Ch23_1_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	Path msgFilePath = Paths.get("c:","mydir");
	try{
	    Stream<Path> stream =  Files.list(msgFilePath);
	    //stream.forEach(System.out::println);
	    long count = stream.filter(p->
		p.getFileName().toString().indexOf(".txt") >-1).count();
	    System.out.println(count);
	}catch(IOException ex){
	    System.out.println(ex);
	}
	
    }
    
}
