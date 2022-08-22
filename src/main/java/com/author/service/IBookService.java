package com.author.service;

import com.author.Model.Book;

public interface IBookService {

	public Integer addBook(Integer aId, Book book);
	
	public Book updateBook(Integer aId, Book book, Integer bId);
}
