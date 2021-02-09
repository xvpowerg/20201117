/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch24_20200209.nio2;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
import java.io.IOException;
public class Ch24_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
		Path path = Paths.get("C:","mydir");
		
		Stream<Path> stream = Files.list(path);
		//stream.forEach(System.out::println);
		//預設為Integer MAX 
		//最少為0
	         Stream<Path> walkPath =  Files.walk(path,0);
		// walkPath.forEach(System.out::println);
		 
		 Stream<Path> findStream = Files.find(path, 3, (p,attr)->{
			//size單位為byte
			return attr.size() > 500;
		 });
		 findStream.forEach(System.out::println);
	
    }
    
}

