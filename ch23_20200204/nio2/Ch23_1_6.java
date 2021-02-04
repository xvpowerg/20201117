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
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Ch23_1_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	Path msgFilePath = Paths.get("c:","mydir","msg.txt");
//	try{
//	     byte[] data = Files.readAllBytes(msgFilePath);
//	     String  msg = new String(data);
//	     System.out.println(msg);
//	}catch(IOException ex){
//	    System.out.println(ex);
//	}
//	    try{
//		List<String> msgList = Files.readAllLines(msgFilePath);
//		//msgList.forEach(System.out::println);
//		int count = msgList.stream().mapToInt(s->s.length()).sum();
//		System.out.println(count);
//		//顯示文章的字數
//	    }catch(IOException ex){
//		System.out.println(ex);
//	    }
	    
	    try{
		  Stream<String> textStream = Files.lines(msgFilePath);
		 // textStream.forEach(s->System.out.println(s.toUpperCase()));
		  //希望輸出的英文字全大寫
		String upStr = 
			textStream.map(st->st.toUpperCase()).collect(Collectors.joining("\n"));
		  System.out.println(upStr);
	   // textStream
	    }catch(IOException ex){
    
		}
	    
	    
    
}}
