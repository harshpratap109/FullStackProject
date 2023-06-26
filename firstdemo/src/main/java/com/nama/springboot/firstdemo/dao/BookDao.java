package com.nama.springboot.firstdemo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nama.springboot.firstdemo.model.Book;
import com.nama.springboot.firstdemo.repository.BookRepository;

@Service
public class BookDao {
	
	@Autowired
	BookRepository bookRepository;
	
	
	
	public boolean saveOrUpdate(Book b)
	{
		bookRepository.save(b);
		return true;
	}
	
	public Book findByName(String bookname)
	{
		return bookRepository.findByBookname(bookname);
	}
	
	

	
	public void removeBook(int bookId)
	{
		
	  bookRepository.deleteById(bookId);
		
		
	}


	public List<Book> getAllBooks()
	{
		return bookRepository.findAll();
	}
	
	public long countBook() {
		return bookRepository.count();
	}
}
