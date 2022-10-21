package com.cogent.boot.service;

import java.util.List;

import com.cogent.boot.bean.Book;

public interface BookService {
	void addBook(Book book);
	void deleteBookById(Long Id);
	Book getBookById(long LongId);
	List<Book> getAllBooks();
	void updateBookById(long LongId);
}
