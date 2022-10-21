package com.cogent.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.boot.bean.Book;
import com.cogent.boot.repo.BookRepo;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookRepo bookRepo;
	
	@Override
	public void addBook(Book book) {
		bookRepo.save(book);
		
	}

	@Override
	public void deleteBookById(Long Id) {
		bookRepo.deleteById(Id);
		
	}

	@Override
	public Book getBookById(long LongId) {
		// TODO Auto-generated method stub
		return bookRepo.getById(LongId);
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return bookRepo.findAll();
	}

	@Override
	public void updateBookById(long LongId) {
		// TODO Auto-generated method stub
		
	}

}
