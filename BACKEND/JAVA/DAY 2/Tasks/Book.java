package SUJE;

import java.util.Arrays;

public class Book {
	//5. Write a Java program to create a class called "Book" with attributes for title, author, and ISBN, 
	//and methods to add and remove books from a collection.
	String title;
	String author;
	int ISBN;
	int c;
	String bookArr[];
	
	void array() {}
	
	void addBook(String title, String author, int ISBN) {
		String book = title + " - " + author + " - " + ISBN;
		String bookArr [] = new String[10];
		int c=1;
		for(int i=0;i<c;i++) {
			bookArr[i]=book;
			System.out.println(bookArr[i]);
			
		}
		this.bookArr=bookArr;
		this.c=c;
	}
	
	void removeBook(int ISBN) {
		for(int i=0;i<c;i++) {
		if(bookArr[i].contains(Integer.toString(ISBN))) {
			bookArr[i]="";
			System.out.println(bookArr[i]);
		}
		}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book obj = new Book();
		
	obj.addBook("Guliver's Travel", "me" , 123);
	obj.addBook("Guliver's Travel", "me" , 124);
	obj.removeBook(124);
	}

}
