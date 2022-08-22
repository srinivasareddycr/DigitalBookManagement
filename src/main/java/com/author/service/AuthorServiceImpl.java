package com.author.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.author.Model.Author;
import com.author.repository.AuthorRepository;


@Service
public class AuthorServiceImpl implements IAuthorService{

	@Autowired
	private AuthorRepository authorRepository;
	
	@Override
	public Integer addAuthor(Author author) {
		Author savedAuthor = authorRepository.save(author);
		return savedAuthor.getAId();
	}

}

