package com.ryan.standard.test4;

import java.util.HashMap;
import java.util.Map;

class Book {
	private String title, isbn; 

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		return true;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", isbn=" + isbn + "]";
	}

}  

class BookStore { 
	Map<Book, Integer> map = new HashMap<Book, Integer>();
	int getNumberOfCopies(Book b){
		return map.get(b);
	}
	
	public void addBook(Book b, int numberofcopies) {
		map.put(b, numberofcopies);
	}

	@Override
	public String toString() {
		return "BookStore [map=" + map + "]";
	}
	
}  

public class Number61 { 
	
	static BookStore bs = new BookStore();
	
	public static void main(String[] args) {
		Book b = new Book(); b.setIsbn("111");
		bs.addBook(b, 10);
		System.out.println(bs.getNumberOfCopies(b));
		
		System.out.println(bs);
		b = new Book(); b.setIsbn("111");
		System.out.println(bs);
		
		Book b2 = new Book();
		b2.setIsbn("111");
		System.out.println(b.equals(b2));
		System.out.println(bs.getNumberOfCopies(b)); // will throw exception because there is no hashcode
	} 
}

