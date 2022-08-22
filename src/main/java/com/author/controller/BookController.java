package com.author.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.author.Model.Book;
import com.author.service.IBookService;

@RestController
@RequestMapping("/api/v1/digitalbooks/")
public class BookController {

	@Autowired
	private IBookService bookService;
	
	@PostMapping("author/{id}/book")
	public Integer addBook(@PathVariable Integer id, @RequestBody Book book) {
		return bookService.addBook(id, book);
	}
	
//	@PutMapping("author/{aId}/book/{bId}")
//	public Book updateBook(@PathVariable Integer aId, @RequestBody Book book, @PathVariable Integer bId) {
//		book.getActive()
//		return bookService.updateBook(aId, bId, book);
//	}
	
	@PutMapping("author/{aId}/book/{bId}")
	public ResponseEntity<Book> updateBook(@PathVariable("aId") Integer aId, @RequestBody Book book, @PathVariable("bId") Integer bId) {
		return new ResponseEntity<Book>(bookService.updateBook(aId, book, bId), HttpStatus.OK);
	}
}
