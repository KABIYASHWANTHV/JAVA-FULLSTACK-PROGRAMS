package com.kabi;
class Book
{
	String bookTitle;
	String bookAuthor;
	int ISBN;
	Book(String bookTitle,String bookAuthor,int ISBN)
	{
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.ISBN = ISBN;
	}
	void addBook()
	{
		System.out.println("Book title : "+bookTitle);
		System.out.println("Book author : "+bookAuthor);
		System.out.println("Book isbn : "+ISBN);
	}
}
public class Assignment2Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book obj = new Book("Java","Dharun",101);
		obj.addBook();
		
	}
}
