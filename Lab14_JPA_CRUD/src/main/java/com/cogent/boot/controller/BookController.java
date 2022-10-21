package com.cogent.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cogent.boot.bean.Book;
import com.cogent.boot.service.BookService;

@Component
public class BookController {
	@Autowired
	BookService bookService;
	
	public void manageBook() {
		Book book=new Book();
		book.setTitle("Learn JPA");
		book.setAuthor("Charlie");
		book.setPrice(100.00);
		
		bookService.addBook(book);
		System.out.println("Done!");
	}
}
