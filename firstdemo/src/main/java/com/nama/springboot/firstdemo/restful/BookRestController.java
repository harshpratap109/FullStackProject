package com.nama.springboot.firstdemo.restful;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nama.springboot.firstdemo.dao.BookDao;
import com.nama.springboot.firstdemo.model.Book;

@RestController
@CrossOrigin(origins = "*")
public class BookRestController {

	@Autowired
	BookDao bookdao;
	
	@GetMapping("allbooks")
	public List<Book> getAllBooks() {
		return this.bookdao.getAllBooks();
	}


	@GetMapping("book/{bookname}")
	public ResponseEntity<Book> getBook2(@PathVariable String bookname) {
		Book b = this.bookdao.findByName(bookname);

		if (b == null)
			return ResponseEntity.notFound().build();
		else
			return ResponseEntity.ok(b);

	}

	@PostMapping("addbook")
	public String addBook(@RequestBody Book b) {
		boolean r = this.bookdao.saveOrUpdate(b);

		if (r) {
			return "Book with bookid:" + b.getBookid() + " added successfully..";
		} else {
			return "Not able to add book with bookid:" + b.getBookid();
		}

	}

	@PutMapping("updatebook")
	public String updateBook(@RequestBody Book b) {
		boolean r = this.bookdao.saveOrUpdate(b);

		if (r) {
			return "Book with bookid:" + b.getBookid() + " updated successfully..";
		} else {
			return "Not able to update book with bookid:" + b.getBookid();
		}

	}
	
	@DeleteMapping("rembook/{bookid}")
	public void removeBook1(@PathVariable int bookid) {
		this.bookdao.removeBook(bookid);
	}
	
	@GetMapping("/count")
	public Long bookCount() {
		return this.bookdao.countBook();
	}

}
