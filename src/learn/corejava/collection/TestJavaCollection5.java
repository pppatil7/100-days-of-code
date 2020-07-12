package learn.corejava.collection;

import java.util.*;

public class TestJavaCollection5 {

	public static void main(String[] args) {
     ArrayList<Book> a1=new ArrayList<Book>();
     Book b1= new Book(101,"harry potter","xyz","abc",125);
     Book b2= new Book(102,"wings of fire","dr.apj abdul kalam","qwe",150);
     Book b3= new Book(103,"shyamachi aai","sane guruji","rty",200);
     
     a1.add(b1);
     a1.add(b2);
     a1.add(b3);
     
     for(Book b:a1) {
    	 System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
     }

	}

}

class Book{
	int id;
	String name,author,publisher;
	int quantity;
	
	Book(int id,String name,String author,String publisher,int quantity){
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.quantity=quantity;
		
	}
}
