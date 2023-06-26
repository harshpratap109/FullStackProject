package com.nama.springboot.firstdemo.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nama.springboot.firstdemo.model.Book;

@Repository
@Transactional
public interface BookRepository extends JpaRepository<Book, Integer>{
	
	Book findByBookname(String bookname);
}
