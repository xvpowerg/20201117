/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch20_20210121.stream2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
public class Ch20_2 {
    
    static class Book{
	private String  name;
	private String  isbn;

	public Book(String name, String isbn) {
	    this.name = name;
	    this.isbn = isbn;
	}

	@Override
	public String toString() {
	    return "Book{" + "name=" + name + ", isbn=" + isbn + '}';
	}

	@Override
	public int hashCode() {
	    int hash = 5;
	    hash = 53 * hash + Objects.hashCode(this.isbn);
	    return hash;
	}

	@Override
	public boolean equals(Object obj) {
	    if (this == obj) {
		return true;
	    }
	    if (obj == null) {
		return false;
	    }
	    if (getClass() != obj.getClass()) {
		return false;
	    }
	    final Book other = (Book) obj;
	    if (!Objects.equals(this.isbn, other.isbn)) {
		return false;
	    }
	    return true;
	}
	
    }
    static class Student{
	private String  name;
	private int  score;
	private List<Book> books = new ArrayList<>();
	
	public Student(String name, int score) {
	    this.name = name;
	    this.score = score;
	}	    
	@Override
	public String toString() {
	    return "Student{" + "name=" + name + ", score=" + score + '}';
	}	
	
	public void addBook(Book book){
	    books.add(book);
	}
	
    }
    public static void main(String[] args) {
	Book book1 = new Book("B1","ISBN00001");
	Book book2 = new Book("B2","ISBN00002");
	Book book3 = new Book("B3","ISBN00003");
	Book book4 = new Book("B4","ISBN00004");
	Book book5 = new Book("B5","ISBN00005");
	
	Student st1 = new Student("Ken",85);
	st1.addBook(book1);
	st1.addBook(book2);
	Student st2 = new Student("Vivin",50);
	st2.addBook(book3);
	Student st3 = new Student("Lucy",70);
	st2.addBook(book4);
	Student st4 = new Student("Iris",95);
	st2.addBook(book5);
	Student st5 = new Student("Joy",30);
	st1.addBook(book1);
	st1.addBook(book2);
	
	List<Student> list = new ArrayList();
	list.add(st1);
	list.add(st2);
	list.add(st3);
	list.add(st4);
	list.add(st5);
	//不及格的人數
	list.stream().filter(st->st.score < 60).forEach(System.out::println);
	//map 可以改變Stream內的類型
	list.stream().map(st->st.name).forEach(System.out::println);
	System.out.println("==================");
	//不及格的人數 的name?
       list.stream().filter(st->st.score<60).
	       map(st->st.name).forEach(System.out::println);
       //全體成績的加總
      int sum = list.stream().mapToInt(st->st.score).sum();
      System.out.println(sum);
      
      //希望輸出所有學生看的書不可重複
      //flatMap 注意要回傳Stream
      list.stream().
	      flatMap(st->st.books.stream()).
	      distinct().forEach(System.out::println);
    }
    
}
