package com.nama.springboot.firstdemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
	@Id
	private int bookid;
	@Column
	private String bookname;
	@Column
	private String bookauthor;
	
	
	public Book()
	{
		System.out.println("Book bean created..");
	}
	
	
	public Book(int bookId, String bookName,String authorName) {
		super();
		this.bookid = bookId;
		this.bookname = bookName;
		this.bookauthor = authorName;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookId) {
		this.bookid = bookId;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookName) {
		this.bookname = bookName;
	}
	
	public String getBookauthor() {
		return bookauthor;
	}
	public void setBookauthor(String authorName) {
		this.bookauthor = authorName;
	}
	
	


	@Override
	public String toString() {
		return "Book [bookName=" + bookname + ", bookId=" + bookid + ", authorName=" + bookauthor + "]";
	}


	@Override
	public boolean equals(Object obj) {
		return  this.bookid == ((Book)obj).bookid;
	}
	
	
	

}

